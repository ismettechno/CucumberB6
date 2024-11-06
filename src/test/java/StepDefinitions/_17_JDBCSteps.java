package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _17_JDBCSteps {

    DialogContent dc = new DialogContent();

    @Then("Send the Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {

        // DB den data yı oku
        List<List<String>> dbList = DBUtility.getListData(sorgu);

        // kontorl ediyorum db den okuyabildim mi
        for (int i = 0; i < dbList.size(); i++)
            System.out.println(dbList.get(i).get(0));

        // Webden(UI) dan ekrandaki isimleri oku
        List<WebElement> UIList = dc.nameList; //findElemnts

        //kontrol
        for (int i = 0; i < UIList.size(); i++)
            System.out.println(UIList.get(i).getText());


        // birebir Assert yap
        for (int i = 0; i < dbList.size(); i++)
            Assert.assertEquals(dbList.get(i).get(0),
                    UIList.get(i).getText().trim(),
                    "Eşleştirme yapılamadı");

    }
}

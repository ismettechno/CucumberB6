package StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;   //Yukarıdaki 3 impotrun yerine aşağıdaki yazılabilir

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;  // Burada yıldız hepsi demek , hepsi Eklendi, import oldu

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("Username ve şifre gönderildi");


//        dc.username.sendKeys("turkeyts"); wait+scrol+clear
//        dc.password.sendKeys("TechnoStudy123");wait+scrol+clear
//        dc.loginButton.click(); wait+scrol

        dc.mySendKeys(dc.username,"turkeyts");
        dc.mySendKeys(dc.password,"");
        dc.myClick(dc.loginButton);


    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Siteye girildiği doğrulandı");


    }
}

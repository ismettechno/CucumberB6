package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln=new LeftNav();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> linkler=dtLinkler.asList();

        for (int i = 0; i < linkler.size(); i++) {
              ln.myClick( ln.getWebElement(linkler.get(i))  );  // Sevgili ln ben sana String adını göndreyeim sen bana WebElemente çevir
        }

    }
}

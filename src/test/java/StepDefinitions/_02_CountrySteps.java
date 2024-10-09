package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils()

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,"ülkeadi");
        dc.mySendKeys(dc.codeInput,"ülkekodu");
        // kaydet butonuna bas
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        // kaydoldu mesajını kontrol et
    }
}

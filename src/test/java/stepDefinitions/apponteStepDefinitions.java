package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.appontePages;
import util.DriverFactory;

public class apponteStepDefinitions {

    appontePages appontePages = new appontePages(DriverFactory.getDriver());

   @When("kurumsal_tiklanır")
    public void kurumsal_tiklanır() {
       appontePages.kurumsaltiklama();
    }

    @When("uye_ol_basilir")
    public void uye_ol_basilir() {
    }

    @When("numara_girilir")
    public void numara_girilir() {
    }

    @When("kod_gonder_basılır")
    public void kod_gonder_basılır() {
    }

    @Then("bitere")
    public void bitere() {
    }


}

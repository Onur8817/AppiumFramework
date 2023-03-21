package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KesifPages;
import util.DriverFactory;

public class KesifStepDefinitions {

    KesifPages KesifPages = new KesifPages(DriverFactory.getDriver());

   @When("kurumsal_tiklanır")
    public void kurumsal_tiklanır() {
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

    @Then("biter")
    public void biter() {
    }


}

package stepDefinitions;

import io.cucumber.java.en.When;
import pages.N11page;
import util.DriverFactory;

public class N11stepDef {
    N11page n11page = new N11page(DriverFactory.getDriver());
    @When("kategoriler_tiklanir")
    public void kategoriler_tiklanir() throws InterruptedException {
        n11page.kategoriler_tikla();
    }
    @When("elektronik_tiklanir")
    public void elektronik_tiklanir() {
        n11page.elektronik_tikla();
    }
}

package starter.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.qasir_steps;

public class qasir_test {
    @Steps
    qasir_steps qs;

    @Given("I am on the qasir web application")
    public void iAmOnTheQasirWebApplication() {
        qs.openHomePage();
    }

    @When("I am choose dialling code coutny number")
    public void iAmChooseDiallingCodeCoutnyNumber() {
        qs.clickBtnFlag();
        qs.clickFlagIndo();
    }

    @And("I am input phone number")
    public void iAmInputPhoneNumber() {
        qs.inputNumberPhone();
    }

    @And("I am input PIN")
    public void iAmInputPIN() {
        qs.inputPin();
    }

    @And("I am click button login")
    public void iAmClickButtonLogin() {
        qs.clickBtnLogin();
    }

    @And("I am choose one my outlet")
    public void iAmChooseOneMyOutlet() {
        qs.clickOutlet();
    }

    @And("I am change my profile")
    public void iAmChangeMyProfile() {
        qs.clickImageProfile();
        qs.clickButtonUserProfile();
        qs.changeLastName();
        qs.clickBtnSave();
    }

    @Then("I am success automation code qasir web")
    public void iAmSuccessAutomationCodeQasirWeb() {
        qs.alertMessage();
    }
}

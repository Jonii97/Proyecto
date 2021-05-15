package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhpTravelsSteps extends PageSteps {

    @Given("The user is in home page")
    public void theUserIsInHomePage() {
        Injector._page(HomePage.class).go();
    }

    @When("The user go to About Us page")
    public void TheUserGoToAboutUsPage() {
        Injector._page(HomePage.class).clickBlog();
    }

    @Then("The About Us page is displayed")
    public void TheAboutUsPageIsDisplayed() {
        Injector._page(HomePage.class).clickBlog();
    }

}

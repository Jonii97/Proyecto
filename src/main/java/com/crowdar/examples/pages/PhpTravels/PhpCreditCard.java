package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PhpCreditCard extends PhpBasePage{
    public PhpCreditCard(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String CREDIT_CARD_CSS = "#pay > div > div.modal-body > div > div.col-sm-12.creditcardform";
    private final String FIST_NAME_XPATH = "//*[@id=\"card-holder-firstname\"]";
    private final String LAST_NAME_XPATH = "//*[@id=\"card-holder-lastname\"]";
    private final String CARD_NUMBER_XPATH = "//*[@id=\"card-number\"]";
    private final String EXPIRATION_XPATH = "//*[@id=\"expiry-month\"]";


    public void creditCard(){
        waitForElementPresence(By.cssSelector(CREDIT_CARD_CSS));
        Assert.assertTrue(isElementPresent(By.cssSelector(CREDIT_CARD_CSS)), "Los campos de la tarjeta no Estan");
    }
}

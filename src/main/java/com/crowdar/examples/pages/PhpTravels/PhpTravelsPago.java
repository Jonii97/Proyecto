package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PhpTravelsPago extends PhpBasePage{
    public PhpTravelsPago(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String CONTEINER_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div.main-wrapper.scrollspy-action > div > div";

    private final String BUTTON_PAY_ON_XPATH = "//*[@id=\"248\"]";

    private final String CONFIRMACION_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div.main-wrapper.scrollspy-action > div > div > div.success-box.reserved > div.content";


    public void validateContenedor(){
        waitForElementPresence(By.cssSelector(CONTEINER_CSS));
        Assert.assertTrue(isElementPresent(By.cssSelector(CONTEINER_CSS)), "El Contenedor no esta Cargado");
    }

    public void tapPagos(){
        waitForElementPresence(By.xpath(BUTTON_PAY_ON_XPATH));
        clickElement(By.xpath(BUTTON_PAY_ON_XPATH));
    }

    public void manejoAlerta(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void confirmacion(){
        waitForElementPresence(By.cssSelector(CONFIRMACION_CSS));
        Assert.assertTrue(isElementPresent(By.cssSelector(CONFIRMACION_CSS)), "El contenedor no Esta");
    }

}

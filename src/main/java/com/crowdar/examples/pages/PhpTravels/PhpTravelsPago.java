package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PhpTravelsPago extends PhpBasePage{
    public PhpTravelsPago(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String CONTEINER_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div.main-wrapper.scrollspy-action > div > div";

    private final String BUTTON_PAY_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div.main-wrapper.scrollspy-action > div > div > div.form-group > center > button.btn.btn-primary";

    private final String METODO_PAGO_CSS = "#pay > div > div.modal-body";


    public void validateContenedor(){
        waitForElementPresence(By.cssSelector(CONTEINER_CSS));
        Assert.assertTrue(isElementPresent(By.cssSelector(CONTEINER_CSS)), "El Contenedor no esta Cargado");
    }

    public void tapPagos(){
        waitForElementPresence(By.cssSelector(BUTTON_PAY_CSS));
        clickElement(By.cssSelector(BUTTON_PAY_CSS));
    }

    public void validatePay(){
        Assert.assertTrue(isElementPresent(By.cssSelector(METODO_PAGO_CSS)), "El metodo de Pago no esta");
    }

}

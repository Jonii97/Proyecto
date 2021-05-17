package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PhpTravelsHotelsDetalle extends PhpBasePage{

    public PhpTravelsHotelsDetalle(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    private final String FORM_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div > div > div > div > div.acc_section > div > div.col-md-8.offset-0.go-right.order-2.order-lg-first > div:nth-child(2) > div.bg-white-shadow.pt-25.ph-30.pb-40";

    private final String FIRST_NAME_CSS = "#guestform > div.row.gap-20.mb-0 > div.col-12.col-sm-6.o2 > div > label > input";
    private final String SURNAME_CSS = "#guestform > div.row.gap-20.mb-0 > div.col-md-6.col-12.o1 > label > input";
    private final String EMAIL_CSS = "#guestform > div:nth-child(2) > div.col-md-6.col-12.o2 > label > input[type=email]";
    private final String EMAIL_CONF_CSS = "#guestform > div:nth-child(2) > div.col-md-6.col-12.o1 > label > input[type=email]";
    private final String NUMBERS_CONTACT_CSS = "#guestform > div:nth-child(3) > div > label > input[type=text]";
    private final String DIREC_CSS = "#guestform > div:nth-child(4) > div > label > input[type=text]";

    private final String FORMULARIO_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div > div > div > div > div.acc_section > div > div.col-md-8.offset-0.go-right.order-2.order-lg-first > div:nth-child(2) > div.bg-white-shadow.pt-25.ph-30.pb-40";

    private final String COUNTRY_CSS = "#guestform > div:nth-child(5) > div > div.chosen-container.chosen-container-single";
    private final String SELECT_COUNTRY_CSS = "#guestform > div:nth-child(5) > div > div.chosen-container.chosen-container-single.chosen-with-drop.chosen-container-active > div > ul > li:nth-child(6)";

    private final String FORM_EXTRA_CSS = "#bookingdetails > div.bg-white-shadow.pt-25.ph-30.pb-40.mt-30";
    private final String EXTRA_UNO_XPATH = "//*[@id=\"bookingdetails\"]/div[2]/div/table/tbody/tr[1]/td[4]/label/span[1]";
    private final String EXTRA_DOS_XPATH = "//*[@id=\"bookingdetails\"]/div[2]/div/table/tbody/tr[3]/td[4]/label/span[1]";

    private final String FORM_CONFIRM_CSS = "#bookingdetails > div.alert.alert-info.mt-30";
    private final String CONFIRM_CSS = "#bookingdetails > div.form-group > button";


    public void completoFormularioNombre(String name, String surname){
        WebElement form = driver.findElement(By.cssSelector(FORM_CSS));
        js.executeScript("arguments[0].scrollIntoView();", form);

        driver.findElement(By.cssSelector(FIRST_NAME_CSS)).clear();
        driver.findElement(By.cssSelector(FIRST_NAME_CSS)).sendKeys(name);

        driver.findElement(By.cssSelector(SURNAME_CSS)).clear();
        driver.findElement(By.cssSelector(SURNAME_CSS)).sendKeys(surname);
    }

    public void completoFormularioMail(String mail, String confEmail, String number, String address){
        driver.findElement(By.cssSelector(EMAIL_CSS)).clear();
        driver.findElement(By.cssSelector(EMAIL_CSS)).sendKeys(mail);

        driver.findElement(By.cssSelector(EMAIL_CONF_CSS)).clear();
        driver.findElement(By.cssSelector(EMAIL_CONF_CSS)).sendKeys(confEmail);

        driver.findElement(By.cssSelector(NUMBERS_CONTACT_CSS)).clear();
        driver.findElement(By.cssSelector(NUMBERS_CONTACT_CSS)).sendKeys(number);

        driver.findElement(By.cssSelector(DIREC_CSS)).clear();
        driver.findElement(By.cssSelector(DIREC_CSS)).sendKeys(address);
    }

    public void validateFormulario(){
        Assert.assertTrue(isElementPresent(By.cssSelector(FORMULARIO_CSS)), "El formulario no se cargo");
    }

    public void seleccionarPais(){
        clickElement(By.cssSelector(COUNTRY_CSS));
        waitForElementPresence(By.cssSelector(SELECT_COUNTRY_CSS));
        clickElement(By.cssSelector(SELECT_COUNTRY_CSS));
    }

    public void seleccionoExtra(){
        WebElement extra = driver.findElement(By.cssSelector(FORM_EXTRA_CSS));
        js.executeScript("arguments[0].scrollIntoView();", extra);

        driver.findElement(By.xpath(EXTRA_UNO_XPATH)).click();
        driver.findElement(By.xpath(EXTRA_DOS_XPATH)).click();
        sleep(2000);
    }


    public void confirm(){
        WebElement confirmacion = driver.findElement(By.cssSelector(FORM_CONFIRM_CSS));
        js.executeScript("arguments[0].scrollIntoView();", confirmacion);

        sleep(1000);
        clickElement(By.cssSelector(CONFIRM_CSS));
    }
}

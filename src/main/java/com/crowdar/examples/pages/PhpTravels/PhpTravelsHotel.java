package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class PhpTravelsHotel extends PhpHomePage {
    public PhpTravelsHotel(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    private final String TOUR_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div:nth-child(6) > div > div.row.equal-height.cols-2.cols-md-2.cols-lg-4.gap-10.gap-md-20.gap-xl-30 > div:nth-child(3) > figure > a";

    private final String DATE_CSS = "body > div.body-inner > div > div > div.page-wrapper.page-detail.bg-light > div:nth-child(5) > div > div.col-12.col-lg-4.col-xl-3.order-lg-last > aside > div > form > div > div > div > div > div:nth-child(1) > input";
    private final String CALENDAR_XPATH = "//*[@id=\"datepickers-container\"]/div[1]/div";
    private final String DAY_XPATH = "//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[34]";

    private final String ADULT_XPATH = "//*[@id=\"selectedAdults\"]";
    private final String ADULT_NUMBERS_XPATH = "//*[@id=\"selectedAdults\"]/option[3]";

    private final String CHILD_XPATH = "//*[@id=\"selectedChild\"]";
    private final String CHILD_NUMBERS_XPATH = "//*[@id=\"selectedChild\"]/option[3]";

    private final String INFANT_XPATH = "//*[@id=\"selectedInfants\"]";
    private final String INFANT_NUMBERS_XPATH = "//*[@id=\"selectedInfants\"]/option[2]";

    private final String BOOK_CSS = "body > div.body-inner > div > div > div.page-wrapper.page-detail.bg-light > div:nth-child(5) > div > div.col-12.col-lg-4.col-xl-3.order-lg-last > aside > div > form > div > form > button";

    public void selectTour(){
        clickElement(By.cssSelector(TOUR_CSS));
    }

    public void datePicker(){
        clickElement(By.cssSelector(DATE_CSS));
        waitForElementPresence(By.xpath(CALENDAR_XPATH));
        driver.findElement(By.xpath(DAY_XPATH)).click();
    }

    public void infantPicker(){
        clickElement(By.xpath(INFANT_XPATH));
        waitForElementPresence(By.xpath(INFANT_NUMBERS_XPATH));
        driver.findElement(By.xpath(INFANT_NUMBERS_XPATH)).click();
    }

    public void clickBook(){
        waitForElementPresence(By.cssSelector(BOOK_CSS));
        clickElement(By.cssSelector(BOOK_CSS));
    }
}
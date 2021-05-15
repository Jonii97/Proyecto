package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpHomePage extends PhpBasePage{
    public PhpHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    private final String BUTTON_CSS = "#search > div > div > div > div > div > nav > ul > li:nth-child(1) > a";
    public void go(){navigateToCompleteURL();}

}

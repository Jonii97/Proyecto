package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpHomePage extends PhpBasePage{
    public PhpHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    public void go(){navigateToCompleteURL();}

}

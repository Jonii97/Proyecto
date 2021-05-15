package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsBasePage extends PageBaseWeb {

    public PhpTravelsBasePage(RemoteWebDriver driver){
        super(driver);
        BASE_URL = "https://phptravels.com/";
    }
}

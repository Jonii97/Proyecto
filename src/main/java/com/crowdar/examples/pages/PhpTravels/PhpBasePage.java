package com.crowdar.examples.pages.PhpTravels;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpBasePage extends PageBaseWeb {
    public PhpBasePage (RemoteWebDriver driver){
        super(driver);
        BASE_URL = "https://www.phptravels.net/home";
    }
}

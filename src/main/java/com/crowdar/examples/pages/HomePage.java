package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends PhpTravelsBasePage{
    public HomePage(RemoteWebDriver driver){
        super(driver);
        this.url="";
    }

    private final String BUTTON_ABOUT_US_CSS = "body > footer > div > div > div.col-xs-6.col-sm-4.col-md-2.links.html5-banners > a:nth-child(3)";

    public void go(){
        navigateToCompleteURL();
    }
    public void clickBlog(){
        clickElement(By.cssSelector(BUTTON_ABOUT_US_CSS));
    }
}

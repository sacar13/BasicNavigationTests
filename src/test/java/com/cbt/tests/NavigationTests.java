package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle1 = driver.getTitle();
        driver.get("https://etsy.com");
        driver.navigate().back();
        String googleTitle2 = driver.getTitle();
        verifyEquals(googleTitle1,googleTitle2);
        driver.close();

        driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String googleTitle3 = driver.getTitle();
        driver.get("https://etsy.com");
        driver.navigate().back();
        String googleTitle4 = driver.getTitle();
        verifyEquals(googleTitle3,googleTitle4);
        driver.close();

        driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle5 = driver.getTitle();
        driver.get("https://etsy.com");
        driver.navigate().back();
        String googleTitle6 = driver.getTitle();
        verifyEquals(googleTitle5,googleTitle6);
        driver.close();




    }
}

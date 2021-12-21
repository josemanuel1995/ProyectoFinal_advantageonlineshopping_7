package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends PageObject {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionFromDropDown(By by, String visibleText){
        Select select = new Select(getDriver().findElement(by));
        select.selectByVisibleText(visibleText);
    }

}

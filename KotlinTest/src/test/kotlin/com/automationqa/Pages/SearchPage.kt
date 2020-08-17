package com.automationqa.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import java.awt.Button

class SearchPage(private val driver: WebDriver) {

    //WebElements

    @FindBy (xpath = "//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/input")
    private  val searchBox: WebElement? = null

    @FindBy (xpath = "//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/button")
    private val Button: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }
    fun SearchProduct(heladera: String){
        searchBox?.sendKeys(heladera)
        Button?.click()
    }
}
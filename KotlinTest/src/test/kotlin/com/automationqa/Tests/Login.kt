package com.automationqa.Tests

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

open class TestIngreso {

    /* lateinit var driver: WebDriver
    private set */

    var driver: WebDriver? = null

    @BeforeTest
    fun createDriver() {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\Walter\\IdeaProjects\\KotlinTest\\src\\main\\kotlin\\Drivers\\chromedriver.exe"
        )
        val driver: WebDriver = ChromeDriver()
        val url = "https://www.fravega.com/"
        driver.get(url)
        driver.manage().window().maximize()
        driver?.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/input"))?.sendKeys("Heladeras")
        driver?.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/header/div[2]/div/div[1]/form/button"))?.click()
    }


        @AfterTest
        fun CloseBrowser() {
            driver?.close()
            driver?.quit()
        }
    }
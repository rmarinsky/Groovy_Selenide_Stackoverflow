package com.stackoverflow

import com.stackoverflow.listeners.ScreenshotOnFailure
import com.stackoverflow.utils.PropertiesReader
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Listeners

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver
import static com.stackoverflow.utils.BrowserSelection.selectBrowser

@Listeners(ScreenshotOnFailure)
class SelenideBaseTest {


    @BeforeClass(alwaysRun = true)
    void setUp() {
        selectBrowser(PropertiesReader.getConfig("BROWSER"))
    }

    @AfterClass(alwaysRun = true)
    void after() {
        clearBrowserCache()
        closeWebDriver()
    }

}

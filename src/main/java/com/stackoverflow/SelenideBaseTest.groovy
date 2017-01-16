package com.stackoverflow

import com.codeborne.selenide.Configuration
import com.stackoverflow.listeners.ScreenshotOnFailure
import com.stackoverflow.utils.PropertiesReader
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Listeners

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache

@Listeners(ScreenshotOnFailure)
class SelenideBaseTest {

    @BeforeClass(alwaysRun = true)
    void setUp() {
        Configuration.baseUrl = PropertiesReader.getConfig("BROWSER")
    }

    @AfterClass(alwaysRun = true)
    void after() {
        clearBrowserCache()
    }

}

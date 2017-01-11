package com.stackoverflow.utils

import com.codeborne.selenide.Configuration

class BrowserSelection {

    static void selectBrowser(String browser) throws Exception {

        if (browser == "Firefox") {
            //TODO
        } else if (browser == "Chrome") {
            Configuration.browser = "Chrome"
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver")
        } else if (browser == "IE") {
            //TODO
        } else if (browser == "Safari") {
            //TODO
        } else {
            throw new IllegalStateException("Browser " + browser + " not supported in tests");
        }
    }

}

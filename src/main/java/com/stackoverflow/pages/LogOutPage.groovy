package com.stackoverflow.pages

import com.stackoverflow.Locators.LogOutPageLocators
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$

class LogOutPage extends LogOutPageLocators {

    @Step
    clickOnLogOutButton() {
        $(LOGOUT_BUTTON).click()
        return new HomePage()
    }

}

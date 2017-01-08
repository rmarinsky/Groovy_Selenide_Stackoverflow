package com.stackoverflow.pages

import com.codeborne.selenide.Condition
import com.stackoverflow.Locators.LoginPageLocators
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$
import static com.stackoverflow.utils.PropertiesReader.loadProperty

class LoginPage extends LoginPageLocators {

    @Step
    enterUserEmail() {
        $(EMAIL_FIELD).sendKeys(loadProperty("USER_EMAIL"))
        return this
    }

    @Step
    enterUserPassword() {
        $(PASSWORD_FIELD).sendKeys(loadProperty("USER_PASSWORD"))
        return this
    }

    @Step
    clickOnSubmitButton() {
        $(SUBMIT_BUTTON).click()
        $(AVATAR_IMAGE).waitUntil(Condition.visible, 3000)
        return new HomePage()
    }

}

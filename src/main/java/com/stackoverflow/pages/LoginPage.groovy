package com.stackoverflow.pages

import com.codeborne.selenide.Condition
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$

class LoginPage {

    @Step
    enterUserEmail(String value) {
        $("#email").sendKeys(value)
        return this
    }

    @Step
    enterUserPassword(String value) {
        $("#password").sendKeys(value)
        return this
    }

    @Step
    static clickOnSubmitButton() {
        $("#submit-button").click()
        $(".avatar-me.js-avatar-me").shouldBe(Condition.visible)
        return new HomePage()
    }

}

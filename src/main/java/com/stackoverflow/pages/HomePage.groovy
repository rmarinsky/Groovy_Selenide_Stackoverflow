package com.stackoverflow.pages

import com.stackoverflow.Locators.HomePageLocators
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.open
import static com.stackoverflow.utils.PropertiesReader.loadProperty

class HomePage extends HomePageLocators {

    @Step
    navigateToMainPage() {
        open(loadProperty("URL"))
        return this
    }

    @Step
    clickOnLoginLink() {
        $(LOGIN_LINK_AT_THE_TOP).click()
        return new LoginPage()
    }

    @Step
    checkThatUserAvatarIsPresent() {
        assert $(AVATAR_IMAGE).isDisplayed(): "something is wrong, avatar is not displayed"
        return this
    }

    @Step
    clickOnTopBarIcon() {
        $(TOP_BAR_ICON).click()
        return this
    }

    @Step
    clickOnLogOutLinkIntoDropDown() {
        $(LOGOUT_LINK).click()
        return new LogOutPage()
    }

    @Step
    checkThatLoginLinkIsPresent() {
        assert $(LOGIN_LINK_AT_THE_TOP).isDisplayed(): "something is wrong, Login link is not displayed"
        return this
    }

}

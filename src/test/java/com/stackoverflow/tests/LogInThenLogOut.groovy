package com.stackoverflow.tests

import com.stackoverflow.SelenideBaseTest
import com.stackoverflow.pages.HomePage
import org.testng.annotations.Test
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.annotations.Stories
import ru.yandex.qatools.allure.annotations.Title

@Features("Login and LogOut")
@Stories("LogIn&LogOut")
class LogInThenLogOut extends SelenideBaseTest {

    @Title("Check ability to LogIn then LogOut with correct credentials")
    @Test
    void loginThenLogOut() {
        new HomePage()
                .navigateToMainPage()
                .clickOnLoginLink()
                .enterUserEmail()
                .enterUserPassword()
                .clickOnSubmitButton()
                .checkThatUserAvatarIsPresent()
                .clickOnTopBarIcon()
                .clickOnLogOutLinkIntoDropDown()
                .clickOnLogOutButton()
                .checkThatLoginLinkIsPresent()
    }

}

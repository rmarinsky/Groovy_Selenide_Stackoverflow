package com.stackoverflow.tests

import com.stackoverflow.SelenideBaseTest
import com.stackoverflow.pages.HomePage
import com.stackoverflow.utils.PropertiesReader
import org.testng.annotations.Test
import ru.yandex.qatools.allure.annotations.Features
import ru.yandex.qatools.allure.annotations.Stories
import ru.yandex.qatools.allure.annotations.Title

@Features("Login and LogOut")
@Stories("LogIn&LogOut")
class LogInThenLogOut extends SelenideBaseTest {

    protected static final String USER_EMAIL = PropertiesReader.config.USER_EMAIL
    protected static final String USER_PASSWORD = PropertiesReader.config.USER_PASSWORD

    @Title("Check ability to LogIn then LogOut with correct credentials")
    @Test
    void loginThenLogOut() {
        new HomePage()
                .openHomePage()
                .clickOnLoginLink()
                .enterUserEmail(USER_EMAIL)
                .enterUserPassword(USER_PASSWORD)
                .clickOnSubmitButton()
                .avatarShouldBeVisible()
                .clickOnTopBarIcon()
                .clickOnLogOutLink()
                .clickOnLogOutButton()
                .linkLoginShouldBeVisible()
    }

}

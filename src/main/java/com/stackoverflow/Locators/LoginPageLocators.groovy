package com.stackoverflow.Locators

import com.stackoverflow.utils.PropertiesReader

class LoginPageLocators {

    protected static final String SUBMIT_BUTTON = "#submit-button"
    protected static final String EMAIL_FIELD = "#email"
    protected static final String PASSWORD_FIELD = "#password"
    protected static final String AVATAR_IMAGE = ".avatar-me.js-avatar-me"
    protected static final String USER_EMAIL = PropertiesReader.config.USER_EMAIL
    protected static final String USER_PASSWORD = PropertiesReader.config.USER_PASSWORD

}

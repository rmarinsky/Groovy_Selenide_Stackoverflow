package com.stackoverflow.utils

class PropertiesReader {

    static String getConfig(String key) {
        return config.getProperty(key)
    }

    static ConfigObject config = new ConfigSlurper().parse(new File("src/main/resources/configuration.groovy").toURI().toURL())

}

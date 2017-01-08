package com.stackoverflow.utils

class PropertiesReader {

    static String loadProperty(String name) {
        Properties prop = new Properties()
        try {
            prop.load(new FileReader("src\\main\\resources\\testdata.properties"))
        } catch (IOException e) {
            e.printStackTrace()
        }
        String value = ""
        if (name != null) {
            value = prop.getProperty(name)
        }
        return value
    }

}

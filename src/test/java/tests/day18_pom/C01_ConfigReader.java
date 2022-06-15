package tests.day18_pom;

import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigReader {
    @Test
    public void test01(){
      Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
       Driver.getDriver().get(ConfigReader.getProperty("facebook"));

    }
}

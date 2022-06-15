package tests.day21_C01_ReusableMethod_HtmlReports;

import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotReusableMethods {
    @Test
    public void test01() throws IOException {

            // amazon sayfasina gidip fotografini cekelim
           Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
            ReusableMethods.getScreenshot("amazon");
            Driver.closeDriver();
        }

}

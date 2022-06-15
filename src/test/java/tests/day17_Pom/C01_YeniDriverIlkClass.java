package tests.day17_Pom;

import org.junit.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {
    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        /*
        Bugune kadar TetsBase classina extends ederek kullandigimiz driver yerine
        bundan sonra Driver classindan kullanacagimiz
        getDriver static methodunu kullanacagiz
        Driver.getDriver() in
        driver out
         */
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();
    }
}

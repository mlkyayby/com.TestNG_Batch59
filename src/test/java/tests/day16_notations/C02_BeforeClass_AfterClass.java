package tests.day16_notations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {
    //JUnit te @beforeClass ve AfterClass notasyonuna sahiup
    //methodlar statik olmak zorundaydi
    //TestNG bu ZORUNLULUKTAN bizi kurtariyor
    /*
    TestNG bize daha fazla before ve after notasyonlari sunar
    diger before/after notasyonlarin tanimlayacagimiz
    grup test veya sutun dan once ve sonra calisirlar
    ileride xml dosyalari ile birlikte bunu gorecegiz

     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}

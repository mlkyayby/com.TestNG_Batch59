package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
        public BrcPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
        public WebElement ilkLoginButonu;
        @FindBy(xpath = "//input[@id='formBasicEmail']")
        public WebElement eMailTextBox;
        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwortTextBox;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement ikinciLoginButonu;
        @FindBy(id = "dropdown-basic-button")
        public WebElement kullaniciProfilIsmi;

    }

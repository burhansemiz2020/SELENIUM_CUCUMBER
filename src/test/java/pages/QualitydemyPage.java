package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;
    @FindBy(xpath="//input[@id='login-email']")
    public WebElement kullaniciEmailKutusu;
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;
    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookiesKabulButonu;
}

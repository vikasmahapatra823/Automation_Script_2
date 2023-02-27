package OHRM_LandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@name='username']")
    @CacheLookup // It marked the webelement so
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath= "//button[@type='submit']")
    WebElement submit_btn;

    public void Input_data1(String USN1) {
        username.sendKeys(USN1);
    }
    public void Input_data2(String PWD1) {
        password.sendKeys(PWD1);
    }
    public void clicksubmit(){
        submit_btn.click();
    }
}

package OHRM_LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class OHRM_AppTest {
    public String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String username = "Admin";
    public String password = "admin123";
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

}

import OHRM_LandingPage.LoginPage;
import OHRM_LandingPage.OHRM_AppTest;
import org.testng.annotations.Test;

public class TC_LoginPage extends OHRM_AppTest {

    @Test
    public void loginTest(){
        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.Input_data1(username);
        lp.Input_data2(password);
        lp.clicksubmit();

    }

}

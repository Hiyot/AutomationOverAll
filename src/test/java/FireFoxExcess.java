import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FireFoxExcess {

    private static WebDriver driver;

    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.gecko.driver" , Constant.FIREFOX_DRIVER);
        driver = new FirefoxDriver();
        driver.get("https://www.ynet.co.il/home/0,7340,L-8,00.html");
    }

    @Test
    public void navigate(){
//        driver.navigate().to("https://translate.google.com/");
    }
}

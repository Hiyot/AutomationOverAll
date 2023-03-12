import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeTest {

    private static WebDriver driver;


@BeforeClass
    public void SetDriver(){

    System.setProperty("webdriver.chrome.driver" , Constant.CHROME_DRIVER);
    driver = new ChromeDriver();
    driver.get("https://www.walla.co.il/");
}
@Test
    public void navigate(){
//    driver.navigate().to("https://translate.google.com/");
}


}

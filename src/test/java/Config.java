import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Config {
    WebDriver driver;
    private io.github.bonigarcia.wdm.WebDriverManager WebDriverManager;

    @BeforeTest
    public void StartBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get ("https://phptravels.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @AfterTest
    public void CloseBrowser(){
        driver.quit();

    }

}

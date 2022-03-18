package Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    @Before
    public void InitializeDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\radub\\Desktop\\Work\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://skoda.ro");
        driver.manage().window().maximize();

        // Wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public void TearDown(){

        // driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

}

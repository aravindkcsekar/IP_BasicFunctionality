/**
 * Created by UFT Learning on 22-12-2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryGoogle {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "E:\\Job Search\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = "www.google.com";
        driver.get(url);

    }
}

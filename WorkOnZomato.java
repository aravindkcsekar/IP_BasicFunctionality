/**
 * Created by UFT Learning on 22-12-2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOnZomato {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "E:\\Job Search\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();

        String ZUrl = "http://www.zomato.com";

        driver.get(ZUrl);
        System.out.println("Zomato Website Open");

        String BrowTitle = driver.getTitle();
        System.out.println("Title of BrowserPage :"+BrowTitle);
        String BrowURL = driver.getCurrentUrl();
        System.out.println("URL of BrowserPage :"+BrowURL);

        driver.manage().window().maximize();
        System.out.println("Browser Maximized");

        if (BrowURL.contentEquals(ZUrl))
            System.out.println("Maintains Same URL");
        else
            System.out.println("URL Automatically modified");

        driver.findElement(By.id("location_input")).sendKeys("Chicago");







        //driver.close();

        //System.exit(0);


    }

}


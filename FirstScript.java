/**
 * Created by UFT Learning on 11-12-2016.
 */



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;


public class FirstScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;

        @Before
        public void start(){
            System.setProperty("webdriver.chrome.driver", "E:\\Job Search\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("http://newtours.demoaut.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void StartTest(){

            String baseUrl;
            baseUrl = "http://newtours.demoaut.com";
            String ExpectedTitle = "Welcome: Mercury Tours";
            String ActualTitle = "";
            driver.get(baseUrl);
            ActualTitle = driver.getTitle();

            if (ActualTitle.contentEquals(ExpectedTitle)) {
                System.out.println("Correct Page");
            } else {
                System.out.println("Wrong Page - Try Again - closing browser");
                driver.close();
            }

            WebElement WSignOn = driver.findElement(By.linkText("SIGN-ON"));
            System.out.println("The Sign-On link is available : " + WSignOn);

            List<WebElement> listfont = driver.findElements(By.tagName("font"));
            for (WebElement temp : listfont) {
                System.out.println("All Font in Page : " + temp.getText());
            }
            System.out.println("Waiting for 4 seconds before cruises");
            Thread.sleep(4000);
            driver.findElement(By.linkText("Cruises")).click();

        }

        @After
        public void tear()
        {
            driver.close();
            System.exit(0);
        }

    }

}







        //driver.findElement(By.name("userName")).sendKeys("kalyan01");
        //driver.findElement(By.name("password")).sendKeys("98765");













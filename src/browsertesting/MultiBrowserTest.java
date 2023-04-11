package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    // declaration of static variables
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);    // open baseUrl into browser
        driver.manage().window().maximize(); // maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // give implicit wait to driver

        System.out.println(driver.getTitle());  // print the title of the pages
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println(driver.getPageSource()); // Get page source

        //Find the Email field element and type the Email
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Find the password field and type the password
        driver.findElement(By.name("password")).sendKeys("xyz123");

        // close the browser
        driver.close();



    }


    }





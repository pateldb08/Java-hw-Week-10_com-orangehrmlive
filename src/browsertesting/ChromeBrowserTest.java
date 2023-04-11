package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
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

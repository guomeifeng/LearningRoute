/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    public static void main(String[] args) {
        WebDriver driver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:/Users/Kelly/AppData/Local/Google/Chrome/User Data/Default");
        options.addArguments("--start-maximized", "allow-running-insecure-content", "--test-type");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kelly\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.navigate().to("http://www.baidu.com/");
        WebElement textInput = driver.findElement(By.id("kw"));
        textInput.sendKeys("Selenium Automation");
        WebElement submit = driver.findElement(By.id("su"));
        submit.click();
    }

}

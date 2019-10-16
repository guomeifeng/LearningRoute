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
		// 通过配置参数禁止data;的出现
		options.addArguments("--user-data-dir=C:/Users/Kelly/AppData/Local/Google/Chrome/User Data/Default");
		// 通过配置参数删除稳定性和安全性会有所下降提示
		options.addArguments("--start-maximized", "allow-running-insecure-content", "--test-type");
		//设置启动谷歌驱动
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kelly\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("http://www.baidu.com/");
		//根据id获取输入框
                WebElement textInput = driver.findElement(By.id("kw"));
                //在输入框输入“Selenium”
                textInput.sendKeys("Selenium 自动测试");
                //根据id获取“百度一下”按钮
                WebElement submit = driver.findElement(By.id("su"));
                //点击按钮
                submit.click();
	}
 
}

package org.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	public static void launchChrome(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void passUrl(String url) {
		driver.get(url);
	}
	
	public static void fillText(WebElement e, String text) {
		e.sendKeys(text);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	
	public static void takeScreenshot(String imageName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\"+imageName+".png");
		FileUtils.copyFile(src, des);
	
	}
}

package project.One;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void getdriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
		}
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static WebElement locator(String locator, String attribValue) {
		if(locator.equals("id")) {
			WebElement findElement = driver.findElement(By.xpath(attribValue));
			return findElement;
		}
		else if(locator.equals("name")) {
			WebElement findElement = driver.findElement(By.name(attribValue));
			return findElement;
		}
		else if(locator.equals("xpath")) {
			WebElement findElement = driver.findElement(By.xpath(attribValue));
			return findElement;
		}
		else {
			WebElement findElement = driver.findElement(By.tagName(attribValue));
			return findElement;
			}
	}
	public static void textSend(WebElement findElement, String Values) {
		findElement.sendKeys(Values);
	}
	public static void textclick(WebElement findElement) {
		findElement.click();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void screenshot(String screenshot) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\Krishna\\Working saves\\"+screenshot+".png");
		FileUtils.copyFile(source, des);
	}
	
}
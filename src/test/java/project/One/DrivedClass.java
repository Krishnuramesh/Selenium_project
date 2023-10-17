package project.One;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DrivedClass extends BaseClass{
	public static void main(String[] args) throws IOException {
		getdriver("edge");
		driver.get("https://www.facebook.com/");
		//POM p=new POM();
		WebElement username = driver.findElement(By.cssSelector("input#email"));
		textSend(username,"test");
		WebElement pwd = driver.findElement(By.cssSelector("input.inputtext[name ='pass']"));
		textSend(pwd, "232");
		WebElement login = driver.findElement(By.cssSelector("button[name = 'login']"));
		textclick(login);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriver wait = new WebDriversWait(driver,Duration.ofSeconds(5));
		
	}
	
}

	



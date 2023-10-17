package project.One;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junitt1 extends BaseClass{
	@BeforeClass
	public static void tc01() {
	getdriver("edge");
	url("https://www.facebook.com/");
	}
	@Before
	public void tc02() {
		Date d=new Date();
		System.out.println(d);
		System.out.println("krish");
	}
	@Test
	public void tc03() {
		POM p=new POM();
		WebElement username = p.getUsername();
		textSend(username,"test");
	}
	@After
	public void tc04() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void tc05() {
		//quitBrowser();
	}

}

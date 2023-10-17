package project.One;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNG extends BaseClass {
	@Test
	private void case1() {
		System.out.println("case1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case2() {
		System.out.println("case2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case3() {
		System.out.println("case6");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case4() {
		System.out.println("case4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case5() {
		System.out.println("case5");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case6() {
		System.out.println("case6");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void case7() {
		System.out.println("case7");
		System.out.println(Thread.currentThread().getId());
	}
	
	
	}

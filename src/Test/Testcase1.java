package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest
    public void beforetest() {
		
		System.out.println("After method is executed");
		
	}

	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("before method is executed");
		
	}
	
	@Test
	public void method1() {
		
		System.out.println("Testcase is executed");
		
	}
	@Test
	public void method2() {
		
		System.out.println("Testcase2 is executed");
	}
	
	@AfterMethod     
	public void aftermethod() {
		
		System.out.println("After method is executed");
		
	}
	@AfterTest
    public void aftertest() {
		
		System.out.println("After test is executed");
		
	}
	
}

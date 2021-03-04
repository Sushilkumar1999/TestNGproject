package Test;

import org.testng.annotations.Test;

public class Group {

	@Test(groups= {"Sanity","Regressions"})
	public void method1() {
		
		System.out.println("Testcase is executed");
		
	}
	@Test(groups= {"Regressions"})
	public void method2() {
		
		System.out.println("Testcase2 is executed");
	}
	
	@Test(groups= {"Regressions"})
	public void method3() {
		
		System.out.println("Testcase3 is executed");
		
	}
	

}

package testNG_;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_testNG {//Test class   (for test case execution no main method in this)
    @Test
	public void demoA() {//Test Method
		Reporter.log("Hello world");//it will print only in the report
	}
	@Test
	public void demoB() {
		Reporter.log("Welcome to JAVA",true);//it will print both on report and console, (if we use false it will print only in report);
		
	}
	@Test
	public void demoC() {
		System.out.println("Learn Automation");//it will Print only on console;
	}
}

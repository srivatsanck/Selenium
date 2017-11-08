package sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass1 {
	
  @Test(priority=1)
  public void addition() {
	  System.out.println("addition");
  }
  
  
  
  @Test(priority=0)
  public void sub() {
	 // int a =10/0;
	  System.out.println("sub");
  }
}

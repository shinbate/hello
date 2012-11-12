package net.ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testGetMessage() throws Exception {               
    	HelloWorld hello = new HelloWorld();               
    	assertEquals(ʺHello Worldʺ, hello.getMessage());        
    	}
    
    public void testGetMessageWithName() throws Exception {               
		  HelloWorld hello = new HelloWorld();               
		  assertEquals(ʺHello Steveʺ, hello.getMessage(ʺSteveʺ));      
		  }                
	  public void testGetMessageWithNameOther() throws Exception {    
		  HelloWorld hello = new HelloWorld();               
		  assertEquals(ʺHello Jobsʺ, hello.getMessage(ʺJobsʺ));       
		  }        
	  public void testGetMessageWithNameNull() throws Exception { 
		  HelloWorld hello = new HelloWorld();              
		  assertEquals(ʺHello Worldʺ, hello.getMessage(null));   
		  }
}

package com.sapient.week1;
import org.junit.Test;

public class CheckEvenTest {
	private CheckEven even = new CheckEven(); 


	public void testEven1() {
		assertEquals("4 is a even number",true,even.check(4));
	}

    public void testEven2(){
            assertEquals("123 is not a even number",false,even.check(123));
    }


    public void testEven3(){
            assertEquals("232 is a even number",true,even.check(232));
    }

    public void testEven4(){
            assertEquals("765 is not an even number",false,even.check(765));
    }
	private void assertEquals(String string, boolean b, Boolean check) {
		// TODO Auto-generated method stub
		
	}
}

package Week8.SapientAssignment;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumberTest {
	
	Number num;
	@Before
	public void setup()
	{
		 num =new Number();
	}
	
	@Test
	public void if_prime() {
        assertEquals(1, num.checkPrime(5));
        assertEquals(1, num.checkPrime(97));
        assertEquals(1, num.checkPrime(59));
        assertEquals(1, num.checkPrime(83));
     
  }
	
	@Test
    public void if_notprime() {
        assertEquals(0, num.checkPrime(6));
        assertEquals(0, num.checkPrime(22));
        assertEquals(0, num.checkPrime(54));
}
	@Test
	public void if_palindrome() {
		assertEquals(true,num.checkPalindrome(353));
		assertEquals(true,num.checkPalindrome(2992));
	}
	@Test
	public void if_not_palindrome() {
		assertEquals(false,num.checkPalindrome(786));
		assertEquals(false,num.checkPalindrome(432));
	}
	
	@Test
	public void if_armstrong() {
		assertEquals(true,num.checkArmstrong(370));
		assertEquals(true,num.checkArmstrong(407));
	}
	@Test
	public void if_notarmstrong() {
		assertEquals(false,num.checkArmstrong(54));
		assertEquals(false,num.checkArmstrong(231));
	}
}

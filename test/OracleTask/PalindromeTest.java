package OracleTask;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumberIntoArray() {
		//fail("Not yet implemented");
		int number= 54;
		Palindrome palindrome=new Palindrome(number);
		ArrayList<Integer> array = new ArrayList<Integer>(
	            List.of(5,4));
		assertEquals(array,palindrome.numberIntoArray(54));
	  
	}
	@Test
	public void testArrayIntoNumber() {
		//fail("Not yet implemented");
		int number= 5402;
		ArrayList<Integer> array = new ArrayList<Integer>(
	            List.of(5,4,4,5));
		Palindrome palindrome=new Palindrome(number);
		
		assertEquals(5445,palindrome.arrayIntoNumber(array));
	  
	}

	@Test
	public void testNumberOfDigits() {
		//fail("Not yet implemented");
		int number= 54;
		Palindrome palindrome=new Palindrome(number);
		assertEquals(2,palindrome.numberOfDigits(54));
	}
	
	
	@Test
	public void testChangeOfDigits() {
		//fail("Not yet implemented");
		ArrayList<Integer> array = new ArrayList<Integer>(
	            List.of(5,4,1,3));
		Palindrome palindrome=new Palindrome(0);
		assertEquals(5445,palindrome.changeDigits(array));
	}

	@Test
	public void testNextPalindrome() {
		//fail("Not yet implemented");
		int number= 14554;
		Palindrome palindrome=new Palindrome(0);
		assertEquals(14641,palindrome.nextPalindrome(number));
	}
	@Test
	public void canInitiatePalindrome() {
		//fail("Not yet implemented");
		Palindrome palindrome =new Palindrome(10);
		assertNotNull(palindrome);
	}

}

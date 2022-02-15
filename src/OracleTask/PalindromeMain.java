package OracleTask;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String args[])
    {
		System.out.println("Enter a number:");
		
		try {
				Scanner sc = new Scanner(System.in);
				int number=sc.nextInt();
				Palindrome pal=new Palindrome(number);
				System.out.println(pal);
				sc.close();
		}
		 catch(Exception e) {
			System.out.println("Invalid input. Please only give numbers.");
		}
    }

}
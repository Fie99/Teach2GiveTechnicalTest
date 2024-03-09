
/*Question 5: Reverse Integer
Write a program that takes an integer as input and returns an integer with reversed digit
ordering.*/

import java.util.Scanner;
public class ReverseInteger {
	public static void main(String[] args) {
	   {
	      int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      
	      Scanner in = new Scanner(System.in);
	      
	      num = in.nextInt();
	  
	      for( ;num != 0; )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reversenum);
	   }
 }
}

 



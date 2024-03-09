
/*Question 1: FizzBuzz
Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
"FizzBuzz".*/


public class FizzBuzz {

	public static void main(String[] args) {      
		int n = 100;  
		System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");    
		for (int i = 1; i <= 100; i++)   
		{   
		if (i%3==0 && i%5==0)   
		{     
		System.out.print("FizzBuzz");  
		}     
		else if (i%3==0)   
		{    
		System.out.print("Fizz");  
		}     
		else if (i%5==0)   
		{     
		System.out.print("Buzz");  
		}   
		else   
		{       
		System.out.print(i);  
		}    
		System.out.print(","+" ");  
		}     
		}  

	}



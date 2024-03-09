

/*Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100.*/

import java.util.*;
public class FibonacciSequence {
	
   
	      
	    public static void main(String args[])
	    {  
	    	   int n = 100, firstTerm = 0, secondTerm = 1;
	    	    System.out.println("Fibonacci Series up to " + n + " :");

	    	    for (int i = 1; i <= n; ++i) {
	    	      System.out.print(firstTerm + ", ");

	    	      // compute the next term
	    	      int nextTerm = firstTerm + secondTerm;
	    	      firstTerm = secondTerm;
	    	      secondTerm = nextTerm;
	    	    }
	    	  }
	        
	       
	    
	}  


		

	



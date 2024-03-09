


/*Question 3: Power of Two
Write a program that takes an integer as input and returns true if the input is a power of two.*/

import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println(num + " => " + isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }

	public static String toString(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

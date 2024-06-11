package basicjavaprograms;



/*Properties of Prime Numbers
 * 
Greater than 1:
Prime numbers must be greater than 1. The smallest prime number is 2.

Only Two Divisors:
A prime number has exactly two distinct positive divisors: 1 and the number itself.

First Prime Number:
The first prime number is 2, which is also the only even prime number. 
All other prime numbers are odd since any even number greater than 2 can be divided by 2.
*/
public class PrimeExample {
	
	
	public static void main(String args[]) {
		
		System.out.println(isPrime(5));
	
	}
	
	
	public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return false;
        }
        // Check from 2 to the square root of the number like 16/2, 16/3, 16/4 ------16/16
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // if no if divisible completely , its not a prime no
                return false;
            }
        }
        return true;
    }
}

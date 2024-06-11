/**
 * 
 */
package basicjavaprograms;

import java.util.Scanner;

public class readInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your desired input here...");
        int i = scan.nextInt();
        double d = scan.nextDouble();
         scan.nextLine();   

        String s = scan.nextLine();
         scan.close();   // always close the scanner
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
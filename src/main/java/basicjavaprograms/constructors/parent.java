/**
 * 
 */
package basicjavaprograms.constructors;

/**
 * @author anilkumar06
 *
 */
public class parent {

	int a = 10;

	parent() {

		System.out.println("hiii from parent no args constructor");

	}
	parent(String str) {

		System.out.println("hiii from parent str args constructor");

	}
	static class child extends parent {
		int a = 11;

		child() {

			System.out.println(super.a);
			System.out.println(this.a);
			System.out.println("hiii3232");

		}
		child(String str) {
			
			/*
			 * If you comment out the super(str); line in the Child constructor with a
			 * string argument, the program will no longer explicitly call the Parent
			 * constructor with the string argument. Instead, the Java compiler will
			 * implicitly insert a call to the no-argument constructor of the Parent class.
			 */
			
			// super("anil");   

			System.out.println(super.a);
			System.out.println(this.a);
			System.out.println("hiii3232");

		}
		public static void main(String[] args) {

			new child();  // first parent's no arg constructor will be called
			new child("Anil");  // first parent's  no-arg constructor only will be called

		}}}
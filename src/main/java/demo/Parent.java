/**
 * 
 */
package demo;

/**
 * @author anilkumar06
 *
 */
public class Parent {

	public Parent() {

		System.out.println("I am parent constructor");
	}

	public static final String display(String a) {
		System.out.println("I am in parent class");
		return "parent";
	}
}

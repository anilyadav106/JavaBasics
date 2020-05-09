/**
 * 
 */
package demo;

import java.io.IOException;

/**
 * @author anilkumar06
 *
 */
public class child extends Parent {

	public child() {
		super();
		System.out.println(super.display("anil"));

		System.out.println("I am child constructor");

	}

	public child(int i) {
		this();
		System.out.println("I am child constructor with arguments");
		System.out.println(this.display1("asa"));
	}

	public final String display1(String a) {
		System.out.println("I am in child class");
		return "anil1";
	}

	public static void main(String[] args) throws IOException {

		child c = new child(3);

	}

}

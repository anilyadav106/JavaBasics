/**
 * 
 */
package basicjavaprograms.constructors;

import java.io.IOException;

/**
 * @author anilkumar06
 *
 */
public class child1 extends Parent1 {

	public child1() {
		
		super();
		
		System.out.println(super.display("anil"));

		System.out.println("I am child constructor");

	}

	public child1(int i) {
		this();
		System.out.println("I am child constructor with arguments");
		System.out.println(this.display1("asa"));
	}

	public final String display1(String a) {
		System.out.println("I am in child class");
		return "child";
	}

	public static void main(String[] args) throws IOException {

		child1 c = new child1(2);

	}

}

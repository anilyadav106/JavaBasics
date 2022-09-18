package basicjavaprograms;

public class child extends parent {
	int i = 2;
	String name = "i am child";

	@Override
	public void m1() {

		System.out.println("child method");
	}

	public static void main(String[] args) {
		/*
		 * child object referenced by child type ,all child variables and methods are
		 * accessed;
		 */
		System.out.println("**** no casting****");
		child c = new child();
		c.m1();
		System.out.println(c.i);
		System.out.println(c.name);

		/*
		 * parent object referenced by parent type , all parent variables and methods
		 * are accessed
		 */
		System.out.println("**** no casting****");
		parent p = new parent();
		p.m1();
		System.out.println(p.i);
		System.out.println(p.name);

		/*
		 * child object referenced by parent type , all parent variables and parent overridden methods in child are
		 * accessed
		 */
		System.out.println("**** up casting****");
		parent c1 = new child();

		System.out.println(c1.i);
		System.out.println(c1.name);
		c1.m1();

		System.out.println("*****up casting tricky assignment*****");
		child c2 = new child();
 		parent p2 = c2; 
 		
 		// above 2 lines are same as parent p2 = new child();
 		
		p2.m1();
		System.out.println(p2.i);
		System.out.println(p2.name);

		/*
		 * calling the non-overriddenn method of parent class
		 */
		parent p3 = new child();

		p3.m2();

	}

}

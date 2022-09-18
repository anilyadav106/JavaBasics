
package FiveDayWorkshop;

 
public class Student {

	
	int rno;
	String name;
	String branch;  

	public void display() {
		System.out.println("ROll no is " + rno);
		System.out.println("ROll no is " + name);
		System.out.println("ROll no is " + branch);

		 
		
	}
	 
	public static void main(String[] args) {

		
		Student s1= new Student();
		s1.rno=1;
		s1.name="anil";
		s1.branch="ECE";
		Student s2 = new Student();
		s2.rno=2;
		s2.name="sunil";
		s2.branch="IT";
		
		s1.display();
		s2.display();
		
		
	}

}

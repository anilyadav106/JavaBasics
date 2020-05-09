package basicjavaprograms;

public class parentClass {

	void test1(String s) {
		System.out.println("in test1");

	}

	public static void main(String[] args) {
		parentClass t = new parentClass();
		t.test1("rere");
	}

}

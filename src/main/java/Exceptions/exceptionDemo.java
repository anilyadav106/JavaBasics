package Exceptions;

public class exceptionDemo {

	public static void main(String[] args) {

		int i = 14;
		System.out.println("Start of program");
		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			System.out.println("in finally block-closing db connection");
		}

		System.out.println("End of program");
	}

}

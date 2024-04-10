/**
 * 
 */
package basicjavaprograms;

 
/**
 * @author anilkumar06
 *
 */
public class CustomException extends Exception {

	public CustomException(String msg) {
		
		/*
		 * calling parent class Exception's argument constructor which then call its
		 * parent Throwable's argument constructor
		 */
		 super(msg); 
	}

	static void execute(String trxType) throws CustomException {

		switch (trxType) {

		case "Credit":

			System.out.println("Executing credit");
			break;
		case "Debit":
			System.out.println("Executing debit");
			break;
		case "Saving":
			System.out.println("Executing saving");
			break;
		case "WIthdrwal":
			System.out.println("Executing withdrawal");
			break;
		default:
			throw new CustomException("Entered trx type is not allowed");

		}

	}

	public static void main(String[] args) {

		try {
			
			CustomException.execute("Credit1");
		} catch (CustomException e) {
			/*
			 *  this same msg provided in constructor is then stored in a variable in the
			 * throwable class and is returned by Throwable class' getmessage() method
			 */
			System.out.println(  e.getMessage());

		}

	}

}

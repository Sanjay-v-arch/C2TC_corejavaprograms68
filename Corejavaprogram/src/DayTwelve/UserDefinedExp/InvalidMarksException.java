//Program to define User defined exception class
package DayTwelve.UserDefinedExp;

/*public class InvalidMarksException {

}*/
public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}
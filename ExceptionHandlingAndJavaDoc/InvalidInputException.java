package ExceptionHandlingAndJavaDoc;

import java.util.InputMismatchException;

public class InvalidInputException extends Exception{
String Message;

public InvalidInputException(String message) {
	
	super(message);
	
}

}

package ExceptionHandlingAndJavaDoc;

public class InvalidPasswordException extends Exception {
String msg;

public InvalidPasswordException(String msg) {
	super(msg);
	
}

}

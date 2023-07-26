package ExceptionHandlingAndJavaDoc;

public class NotEvenNumberException extends Exception {
String msg;

public NotEvenNumberException(String msg) {
	super(msg);

}

}

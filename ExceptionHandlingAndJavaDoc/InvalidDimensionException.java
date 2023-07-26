package ExceptionHandlingAndJavaDoc;

public class InvalidDimensionException extends Exception {
String msg;

public InvalidDimensionException(String msg) {
	super(msg);
	
}

}

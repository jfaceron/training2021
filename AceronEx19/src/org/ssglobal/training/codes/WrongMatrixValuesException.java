package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class WrongMatrixValuesException extends Exception{
	
private String message = "Wrong Values";
	public WrongMatrixValuesException() {}
	
	public WrongMatrixValuesException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	}
}


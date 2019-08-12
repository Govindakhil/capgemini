package capgemini.exception;

public class DivisionException extends Exception {
	public DivisionException(String message) {
		super(message);
	}
	@Override
	public String getMessage()
	{
		return super.getMessage()+"can not divide by zero value..";
	}

}

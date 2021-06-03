package customException;

public class MoodAnalyserException extends Exception {
	enum ExceptionType {
         ENTERED_NULL,ENTERED_EMPTY
	}
Exception type;

	public MoodAnalyserException(Exception Type,String message) {
		super(message);
		this.type = type;
  }
}

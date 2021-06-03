package customException;


public class MoodAnalayser {
private static final Exception Exception_Empty = null;
private static final Exception Exception_null = null;
private String message;
	
	public String  analyserMood(String message)throws MoodAnalyserException { 
		return this.message = message;
	}
	
	void analyserMood() {
		this.message = message;
	}


	public String MoodAnalyser() throws MoodAnalyserException {
		try {
			if (message.length() == 0)
				throw new MoodAnalyserException(Exception_Empty ,"Enter your proper mood");
		    if (message.contains("sad"))
			   if (message.contains("sad"))
			      return "SAD";
		       else
			      return "Happy";
	    } catch (NullPointerException e) {		
	    	throw new MoodAnalyserException(Exception_null,"Enter your proper mood");
	    }
		return "Happy";	
        }
}
	

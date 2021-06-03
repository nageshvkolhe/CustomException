package customException;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {

	
     @Test
	 public void giveNullMoodShouldThrowException() {
    	 MoodAnalayser moodAnalyser = new MoodAnalayser();
    	 	try {
    	 		moodAnalyser.analyserMood(null);
    	 	} catch (MoodAnalyserException e) {
    	 		Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
    	 	}
	}
}

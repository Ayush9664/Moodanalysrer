package bridgelabz;

public class MoodAnalyser {
	 private String message;
	    // default constructor
	    public MoodAnalyser(){
	    }
	    // parameterized constructor
	    public 
	    MoodAnalyser(String message) {
	        this.message = message;
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to mood analyser Program");
	    }
	    //This method is created for implementing test cases which does not use parameterized constructor
	    public String analyseMood(String message) throws MoodAnalysisException{
	        this.message = message;
	        return analyseMood();
	    }
	    //This method is created for implementing test cases which uses parameterized constructor
	    public String analyseMood()throws MoodAnalysisException {
	        try {
	            if (message.length() == 0)
	                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
	            if (message.contains("Sad"))
	                return "SAD";
	            else
	                return "HAPPY";
	        } catch (NullPointerException exception) {
	            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper message");
	        }
	    }
}

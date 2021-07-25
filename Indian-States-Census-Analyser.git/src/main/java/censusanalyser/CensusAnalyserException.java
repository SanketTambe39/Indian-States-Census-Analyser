package censusanalyser;

public class CensusAnalyserException extends Exception {

	 public enum ExceptionType {
		 NO_SUCH_FILE, NO_SUCH_FIELD
	    }

	    public ExceptionType exceptionType;
		public CensusAnalyserException(String message,ExceptionType exceptionType) {
			super();
			this.exceptionType = exceptionType;
		}
}

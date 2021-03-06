package censusanalyser;

public class IndianCensusMain {

	 public static void main(String[] args) throws CensusAnalyserException, CSVBuilderException {
	        CensusAnalyser censusAnalyser = new CensusAnalyser();
	        int totalIndianCensusRecords = censusAnalyser.loadIndiaCensusData("C:\\Users\\Sanket\\Desktop\\StateCensusData.csv");
	        int totalStateCodeRecords = censusAnalyser.loadStateCodeData("C:\\Users\\Sanket\\Desktop\\StateCode.csv");
	        System.out.println("Total Indian Census Records = " + totalIndianCensusRecords);
	        System.out.println("Total State Code Records = " + totalStateCodeRecords);
	    }
	
}

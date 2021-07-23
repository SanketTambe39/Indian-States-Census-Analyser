package censusanalysertest;

import org.junit.Assert;
import org.junit.Test;

import censusanalyser.CensusAnalyser;
import censusanalyser.CensusAnalyserException;

public class CensusAnalyserTest {

	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\Sanket\\Desktop\\StateCensusData.csv";
	private static final String WRONG_CSV_FILE_PATH = "C:\\Users\\Sanket\\Downloads\\StateCensusData.csv";
	private static final String WRONG_CSV_FILE_TYPE = "C:\\Users\\Sanket\\Desktop\\StateCensusData.pdf";
	private static final String WRONG_DELIMITER = "C:\\Users\\Sanket\\Desktop\\StateCensusData.csv";
	private static final String NO_HEADER = "C:\\Users\\Shravya\\Sanket\\StateCensusData.csv";

	@Test
    public void givenIndianCensusCSV_WhenFileReturnsCorrectNumberOfRecords_ShouldReturnNumberOfRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numberOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29, numberOfRecords);
        } catch(CensusAnalyserException ignored) {
        	
        }
    }
	
}

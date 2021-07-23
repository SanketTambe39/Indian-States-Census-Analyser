package censusanalysertest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import censusanalyser.CensusAnalyser;
import censusanalyser.CensusAnalyserException;


public class CensusAnalyserTest {

	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\Sanket\\Desktop\\StateCensusData.csv";
	private static final String WRONG_CSV_FILE_PATH = "C:\\Users\\Sanket\\Downloads\\StateCensusData1.csv";
	private static final String WRONG_CSV_FILE_TYPE = "C:\\Users\\Sanket\\Desktop\\StateCensusData.pdf";
	private static final String WRONG_DELIMITER = "C:\\Users\\Sanket\\Desktop\\StateCensusData.csv";
	private static final String NO_HEADER = "C:\\Users\\Sanket\\StateCensusData.csv";

	@Test
    public void givenIndianCensusCSV_WhenFileReturnsCorrectNumberOfRecords_ShouldReturnNumberOfRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numberOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29, numberOfRecords);
        } catch(CensusAnalyserException ignored) {
        	
        }
    }
	@Test
    public void givenIndianCensusData_WhenWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(CensusAnalyserException.class);
            censusAnalyser.loadIndiaCensusData(WRONG_CSV_FILE_PATH);
        } catch(CensusAnalyserException censusAnalyserException) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.NO_SUCH_FILE, censusAnalyserException.exceptionType);
        }
    }
	
}

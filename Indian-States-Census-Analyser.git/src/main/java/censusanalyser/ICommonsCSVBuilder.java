package censusanalyser;

import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVRecord;

public interface ICommonsCSVBuilder {

	List<CSVRecord> getCSVFileList(Reader reader) throws CensusAnalyserException;
}

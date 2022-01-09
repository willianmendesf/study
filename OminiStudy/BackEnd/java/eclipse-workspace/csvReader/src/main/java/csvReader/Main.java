package csvReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Main {

	public static void main(String[] args) throws IOException {

		String documentsPath = System.getProperty("user.home") + "/Documents";
		
		Path documentsDirectory = Paths.get(documentsPath);
		
		String filename =  "data.csv";
		
		Path csvPath = documentsDirectory.resolve(filename);
		
		
		CSVParser csvParser = CSVParser.parse(
				csvPath, 
				Charset.defaultCharset(), 
				CSVFormat.DEFAULT.withHeader("ID", "Name", "Age"));
		
		// csvParser.forEach(csvRecord -> { System.out.println(csvRecord.toMap()); });
		
		Stream<CSVRecord> csvRecordStream = StreamSupport.stream(csvParser.spliterator(), false);
		
		List<Student> studentList = csvRecordStream
			.skip(1)
			//.map(csvRecord -> System.out.println(csvRecord.toMap()))
			.map(CSVRecord::toMap)
			.map(row -> new Student(row))
			.collect(Collectors.toList());
		
		//List<Student> studentList = rowList
			//	.stream()
			//	.map(row -> new Student(row))
			//	.collect(Collectors.toList());
		
		System.out.println(studentList);
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HospitalDatabaseCSVFile {

	public static void main(String[] args) {
		
		String fileName = "HDCSV.csv";
		File file = new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNextLine()) {
				String[] record = inputStream.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				
				System.out.println(record[10]+" "+Arrays.toString(record));
			}
			
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

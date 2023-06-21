import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 
 * Creates a new CSV file and writes a header to it and writes and appends survey data from a GUI to the CSV file
 *
 */
public class FileHandler {
 // Private String surveyFile is initialized 
 private String surveyFile = "survey_results.csv";
 // Private FileWriter fileOutput is declared
 private FileWriter fileOutput;
 //Private PrintWriter printWriter is declared
 private PrintWriter printWriter;
 
 /**
  * The FileHandler constructor creates a CSV file and writes a header to that CSV file
  * 
  */
 public FileHandler()  {
	 // The try catch is used for reading and writing to the CSV file and catches an IOException if an exception is found
	 try {
		// A FileWriter is initialized
		fileOutput = new FileWriter(surveyFile);
		// A PrintWriter is initialized
		printWriter = new PrintWriter(fileOutput);
		// The String headers is initialized
		String headers = "DateTime,FirstName,LastName,PhoneNumber,Email,Sex,Water,Meals,Wheat,Sugar,Dairy,Miles,Weight\n";
		// The PrintWriter writes headers to the CSV file 
		printWriter.write(headers);
	    // The FileWriter is closed 
		fileOutput.close();
	    // The PrintWriter is closed
		printWriter.close();
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
/**
 * Writes and Appends a String that has surveyData from a GUI to the new CSV file
 * @param surveyData
 */
public void writeResults(String surveyData) {
	// The try catch is used for appending and writing data to the new CSV file and catches an IOException if an exception is caught
	try {
		// A FileWriter is initialized
		FileWriter fileWriter = new FileWriter(surveyFile, true);
		// A PrintWriter is initialized
		PrintWriter printWriter = new PrintWriter(fileWriter);
		// Writes and Appends the String surveyData to the new CSV file
		printWriter.write(surveyData + "\n");
		// The FileWriter is closed
		fileWriter.close();
		// PrintWriter is closed
		printWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}	

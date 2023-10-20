import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		// EXAMPLE USAGE OF FileHelper.java
		System.out.println(FileHelper.readFileByLine("src/files/input.txt"));
		System.out.println(FileHelper.readCSVFile("src/files/csv.txt"));
		FileHelper.writeToFile(FileHelper.readFileByLine("src/files/input.txt"), "src/files/Output.txt");
	}
}
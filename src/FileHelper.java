import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileHelper
{
	public static List<String> readFileByLine(String path) throws IOException
	{
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));

		List<String> input = new ArrayList<>();

		String line;
		while ((line = br.readLine()) != null)
		{
			input.add(line);
		}
		return input;
	}

	public static List<List<String>> readCSVFile(String path) throws IOException
	{
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));

		List<List<String>> input = new ArrayList<>();

		String line;
		while ((line = br.readLine()) != null)
		{
			List<String> lineValues = List.of(line.split(";"));
			input.add(lineValues);
		}
		return input;
	}

	public static void writeToFile(List<String> lines, String file) throws IOException
	{
		FileWriter myWriter = new FileWriter(file);
		for (String line : lines)
		{
			myWriter.write(line + "\n");
		}
		myWriter.close();
	}
}

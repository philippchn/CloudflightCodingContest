package CCC40;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class level1 {
    public static void solve(String path, String output) throws IOException {
        List<String> input = FileHelper.readFileByLine(path);
        List<String> result = new ArrayList<>();
        input.removeFirst();
        for (String s : input)
        {
            String[] values = s.split(" ");
            result.add(
                    String.valueOf((Integer.parseInt(values[0]) * Integer.parseInt(values[1]))/3))
            ;
        }
        FileHelper.writeToFile(result, output);
    }
}

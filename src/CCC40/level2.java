package CCC40;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class level2 {
    public static void solve(String path, String output) throws IOException {
        List<String> input = FileHelper.readFileByLine(path);
        List<String> result = new ArrayList<>();
        input.removeFirst();
        int id = 1;
        int idCounter = 0;

        for (String s : input)
        {
            String[] values = s.split(" ");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);
            int numTables = Integer.parseInt(values[2]);

            StringBuilder tempResult = new StringBuilder();
            for (int i = 0; i <= y; i++)
            {
                for(int j = 0; j < x; j++)
                {
                    if (idCounter++ == 3)
                    {
                        id++;
                        idCounter = 1;
                    }
                    tempResult.append(id).append(" ");
                }
                if (id == numTables)
                {
                    tempResult.append("\n");
                    break;
                }
                tempResult.append("\n");
            }
            idCounter = 0;
            id = 1;
            result.add(tempResult.toString());
        }
        FileHelper.writeToFile(result, output);
    }
}

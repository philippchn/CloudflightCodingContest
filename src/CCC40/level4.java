package CCC40;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class level4 {
    public static void solve(String path, String output) throws IOException {
        List<String> input = FileHelper.readFileByLine(path);
        List<String> result = new ArrayList<>();

        input.removeFirst();

        for (String s : input)
        {
            String[] values = s.split(" ");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);
            int numTables = Integer.parseInt(values[2]);
            int placeVertical = x / 2 + (x % 2);
            int counter = 1;

            int lineCounter = y / 4;

            String tempResult = "";
            do {
                for (int j = 0; j < placeVertical; j++) {
                    tempResult = tempResult + "X.";
                }
                if (Integer.parseInt(values[1]) % 2 != 0) {
                    tempResult = tempResult.substring(0, tempResult.length() - 1);
                }
                y--;
                if (counter++ == 3 && y != 0) {
                    tempResult = tempResult + "\n";
                    lineCounter--;
                    for (int j = 0; j < x; j++) {
                        tempResult = tempResult + ".";
                    }
                    y--;
                    counter = 1;
                    numTables = numTables - placeVertical;
                }
                tempResult = tempResult + "\n";
            } while (lineCounter != 0);

            if (y != 3){
                for (int i = 0; i < numTables; i++) {
                    int c = 0;
                    for (int j = 0; j < x / 4; j++) {
                        tempResult = tempResult + ("XXX.");
                        i++;
                        c++;
                    }
                    while (c++ < x)
                    {
                        tempResult = tempResult + (".");
                    }
                    if (y % 2 != 0) {
                        tempResult = tempResult.substring(0, tempResult.length() - 1);
                    }
                    tempResult = tempResult + "\n";
                }
            }
            else{
                for (int i = 0; i < y; i++) {
                    for (int j = 0; j < placeVertical; j++) {
                        tempResult = tempResult + "X.";
                    }
                    if (Integer.parseInt(values[1]) % 2 != 0) {
                        tempResult = tempResult.substring(0, tempResult.length() - 1);
                    }
                    tempResult = tempResult + "\n";
                }
            }
            result.add(tempResult);
        }
        FileHelper.writeToFile(result, output);
    }
}

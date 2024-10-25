package CCC40;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level3 {
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
            for (int i = 0; i < y; i++)
            {
                for(int j = 0; j < x - (x % 3); j++)
                {
                    if (idCounter++ == 3)
                    {
                        id++;
                        idCounter = 1;
                    }
                    tempResult.append(id).append(" ");
                }
                for(int j = 0; j < (x % 3); j++)
                {
                    tempResult.append(0).append(" ");
                }
                if (id == numTables)
                {
                    tempResult.append("\n");
                    break;
                }
                tempResult.append("\n");
            }

            if (id < numTables)
            {
                id++;
                result.add(replaceZero(tempResult.toString(), id, numTables));
            }
            else
            {
                result.add(tempResult.toString());
            }
            idCounter = 0;
            id = 1;
        }
        FileHelper.writeToFile(result, output);
    }

    private static String replaceZero(String roomInOneLine, int id, int numTables) {
        String[] room = roomInOneLine.split(" \n");
        int freeSpaceY = (room.length / 3);
        int freeSpaceX = countZeroesInLine(room[0]);

        int index = 0;

        for (int i = 0; i < freeSpaceY * freeSpaceX; i++)
        {
            for (int k = 0; k < 3; k++)
            {
                if (index == room.length)
                {
                    index = 0;
                }
                room[index] = room[index].replaceFirst(" 0", " " + id + " ");
                index++;
            }
            if ((room.length - index) < 2)
            {
                index = 0;
            }
            if (id == numTables)
            {
                break;
            }
            id++;
        }
        StringBuilder result = new StringBuilder();
        for (String s : room) {
            s = s.replace("  ", " ");
            result.append(s);
            result.append("\n");
        }

        return result.toString();
    }

    private static int countZeroesInLine(String line)
    {
        int result = 0;
        for (char c : line.toCharArray())
        {
            if (c == '0')
            {
                result++;
            }
        }
        return result;
    }
}

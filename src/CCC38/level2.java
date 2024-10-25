package CCC38;

import java.io.IOException;
import java.util.*;

public class level2 extends level1{
    public level2(String path) throws IOException {
        super();
        List<String> input = FileHelper.readFileByLine(path);

        this.size = Integer.parseInt(input.get(0));

        map = new String[size][size];
        for (int i = 0; i < size; i++)
        {
            String line = input.get(i+1);
            for (int s = 0; s < line.length(); s++)
            {
                map[i][s] = String.valueOf(line.charAt(s));
            }
        }
        readCoordinates(input);
    }

    @Override
    public void readCoordinates(List<String> input)
    {
        for(int i = size + 2; i < input.size(); i++)
        {
            this.numberOfCoordinates = Integer.parseInt(input.get(size + 1));
            this.coordinates.add(input.get(i).split(" "));
        }
    }

    @Override
    public void writeTileType(String path) throws IOException {
        List<String> result = new ArrayList<>();
        for (String[] coordinate : coordinates) {
            String type = checkType(
                    Integer.parseInt(coordinate[0].split(",")[0]), Integer.parseInt(coordinate[0].split(",")[1]),
                    Integer.parseInt(coordinate[1].split(",")[0]), Integer.parseInt(coordinate[1].split(",")[1])
            );
            result.add(type);
        }
        FileHelper.writeToFile(result, path);
    }

    private String checkType(int x1, int y1, int x2, int y2) {
        String[][] mapCopy = map.clone();
        if(checkAdjacentRecursive(x1, y1, x2, y2, x1, y1, mapCopy))
        {
            return "SAME";
        }
        else
        {
            return "DIFFERENT";
        }
    }
    private Boolean checkAdjacentRecursive(int x, int y, int goalX, int goalY, int startX, int startY, String[][] mapCopy)
    {
        if (x == goalX && y == goalY)
        {
            return true;
        }
        if (mapCopy[y][x].equals("W") || x > goalX || y > goalY || x < startX || y < startY)
        {
            return false;
        }
        return checkAdjacentRecursive(x + 1,y, goalX, goalY, startX, startY, mapCopy)
                || checkAdjacentRecursive(x,y + 1, goalX, goalY, startX, startY, mapCopy)
                || checkAdjacentRecursive(x - 1, y , goalX, goalY, startX, startY, mapCopy)
                || checkAdjacentRecursive(x, y - 1 , goalX, goalY, startX, startY, mapCopy);
    }
}

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class level1 {
    int size;
    String[][] map;
    int numberOfCoordinates;
    List<String[]> coordinates = new ArrayList<>();
    protected level1() {

    }
    public level1(String path) throws IOException {
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

    protected void readCoordinates(List<String> input)
    {
        for(int i = size + 2; i < input.size(); i++)
        {
            this.numberOfCoordinates = Integer.parseInt(input.get(size + 1));
            this.coordinates.add(input.get(i).split(","));
        }
    }

    protected void writeTileType(String path) throws IOException {
        List<String> result = new ArrayList<>();
        for (String[] coordinate : coordinates) {
            result.add(map[Integer.parseInt(coordinate[1])][Integer.parseInt(coordinate[0])]);
        }
        FileHelper.writeToFile(result, path);
    }

}

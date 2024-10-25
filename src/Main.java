import CCC40.level1;
import CCC40.level2;
import CCC40.level3;
import CCC40.level4;

import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		level4();
	}

	private static void level1() throws IOException {
		level1.solve("src/CCC40/lvl1/level1_example.in", "src/CCC40/lvl1/out0.txt");
		level1.solve("src/CCC40/lvl1/level1_1.in", "src/CCC40/lvl1/out1.txt");
		level1.solve("src/CCC40/lvl1/level1_2.in", "src/CCC40/lvl1/out2.txt");
		level1.solve("src/CCC40/lvl1/level1_3.in", "src/CCC40/lvl1/out3.txt");
		level1.solve("src/CCC40/lvl1/level1_4.in", "src/CCC40/lvl1/out4.txt");
		level1.solve("src/CCC40/lvl1/level1_5.in", "src/CCC40/lvl1/out5.txt");
	}

	private static void level2() throws IOException {
		level2.solve("src/CCC40/lvl2/level2_example.in", "src/CCC40/lvl2/out0.txt");
		level2.solve("src/CCC40/lvl2/level2_1.in", "src/CCC40/lvl2/out1.txt");
		level2.solve("src/CCC40/lvl2/level2_2.in", "src/CCC40/lvl2/out2.txt");
		level2.solve("src/CCC40/lvl2/level2_3.in", "src/CCC40/lvl2/out3.txt");
		level2.solve("src/CCC40/lvl2/level2_4.in", "src/CCC40/lvl2/out4.txt");
		level2.solve("src/CCC40/lvl2/level2_5.in", "src/CCC40/lvl2/out5.txt");
	}

	private static void level3() throws IOException {
		level3.solve("src/CCC40/lvl3/level3_example.in", "src/CCC40/lvl3/out0.txt");
		level3.solve("src/CCC40/lvl3/level3_1.in", "src/CCC40/lvl3/out1.txt");
		level3.solve("src/CCC40/lvl3/level3_2.in", "src/CCC40/lvl3/out2.txt");
		level3.solve("src/CCC40/lvl3/level3_3.in", "src/CCC40/lvl3/out3.txt");
		level3.solve("src/CCC40/lvl3/level3_4.in", "src/CCC40/lvl3/out4.txt");
		level3.solve("src/CCC40/lvl3/level3_5.in", "src/CCC40/lvl3/out5.txt");
	}

	private static void level4() throws IOException {
		level4.solve("src/CCC40/lvl4/level4_example.in", "src/CCC40/lvl4/out0.txt");
		level4.solve("src/CCC40/lvl4/level4_1.in", "src/CCC40/lvl4/out1.txt");
	}
}
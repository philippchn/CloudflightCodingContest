import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		runLevel1();
//		runLevel2(); TODO FIX STACK OVERFLOW
	}
	private static void runLevel1() throws IOException {
		level1 one1 = new level1("src/lvl1/level1_1.in");
		one1.writeTileType("src/lvl1/out1.txt");
		level1 one2 = new level1("src/lvl1/level1_2.in");
		one2.writeTileType("src/lvl1/out2.txt");
		level1 one3 = new level1("src/lvl1/level1_3.in");
		one3.writeTileType("src/lvl1/out3.txt");
		level1 one4 = new level1("src/lvl1/level1_4.in");
		one4.writeTileType("src/lvl1/out4.txt");
		level1 one5 = new level1("src/lvl1/level1_5.in");
		one5.writeTileType("src/lvl1/out5.txt");
	}
	private static void runLevel2() throws IOException {
		level2 twoSimple = new level2("src/lvl2/level2_simple.in");
		twoSimple.writeTileType("src/lvl2/outSimple.txt");

		level2 twoExample = new level2("src/lvl2/level2_example.in");
		twoExample.writeTileType("src/lvl2/outExample.txt");

		level2 two1 = new level2("src/lvl2/level2_1.in");
		two1.writeTileType("src/lvl2/out1.txt");

		level2 two2 = new level2("src/lvl2/level2_2.in");
		two2.writeTileType("src/lvl2/out2.txt");

		level2 two3 = new level2("src/lvl2/level2_3.in");
		two3.writeTileType("src/lvl2/out3.txt");

		level2 two4 = new level2("src/lvl2/level2_4.in");
		two4.writeTileType("src/lvl2/out4.txt");

		level2 two5 = new level2("src/lvl2/level2_5.in");
		two5.writeTileType("src/lvl2/out5.txt");
	}
}
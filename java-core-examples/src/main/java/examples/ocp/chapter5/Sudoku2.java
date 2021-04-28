package examples.ocp.chapter5;

import java.util.Arrays;

public class Sudoku2 {
    static int[][] game = new int[6][6];

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        System.out.println(Arrays.toString(obj));
    }
}

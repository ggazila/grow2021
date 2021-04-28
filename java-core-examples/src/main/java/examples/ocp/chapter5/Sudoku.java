package examples.ocp.chapter5;

import java.util.Arrays;

public class Sudoku {
    static int[][] game;

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        System.out.println(Arrays.deepToString(game));
//        game[3][3] = "X";
    }
}

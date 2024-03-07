//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] arrayArrays = new int[3][2];

        int[][] arrayArrays2 = {
                                {1,2},
                                {3,4},
                                {5,4},
                                {3,4}
                                        };
        int subArrayLenght = arrayArrays[0].length;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arrayArrays2[i][j]);
            }
        }
    }
}
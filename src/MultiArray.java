import java.util.Random;

public class MultiArray {

    private int[][] array;

    public MultiArray(int n, int m) {
        array = new int[n][m];
    }

    public void randomize() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = RandomFill.randomFill();
            }
        }
    }

    public void print() {
        for (int[] arrays : array) {
            for (int number : arrays) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    public int findMax() {
        int max = 0;
        for (int[] arrays : array) {
            for (int number : arrays) {
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    public int findMin(int max) {
        int min = max;
        for (int[] arrays : array) {
            for (int number : arrays) {
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }
}

public class MultiArray {
    private int n = 10;
    private int m = 10;
    int[][] array = new int[n][m];


    public MultiArray(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void randomize() {
        int count = 0;
        int count2 = 0;
        do {
            array[count][count2] = RandomFill.randomFill();
            count++;
            if (count == m) {
                count2++;
                count = 0;
            }
        } while (count <= n - 1 && count2 <= m - 1);
    }

    public void print() {
        int count = 0;
        int count2 = 0;
        do {
            System.out.print(array[count][count2] + " ");
            count++;

            if (count == m) {
                count2++;
                count = 0;
                System.out.println();
            }
        } while (count <= n - 1 && count2 <= m - 1);
    }

    public void findMin() {
        int count = 0;
        int count2 = 0;
        int min = 0;

        for (count = 0; count < n; count++) {
            for (count2 = 0; count2 < m; count2++) {
                if (array[count][count2] < min) {
                    min = array[count][count2];
                }
            }
        }
        System.out.println("Min to: " + min);
    }

    public void findMax() {
        int count = 0;
        int count2 = 0;
        int max = 0;

        for (count = 0; count < n; count++) {
            for (count2 = 0; count2 < m; count2++) {
                if (array[count][count2] > max) {
                    max = array[count][count2];
                }
            }
        }
        System.out.println("Max to: " + max);
    }
}
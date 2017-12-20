public class Main {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray(20, 10);

        multiArray.randomize();

        multiArray.print();

        int maxValue = multiArray.findMax();

        System.out.println("Najmniejsza wartość to: " + multiArray.findMin(maxValue));

        System.out.println("Największa wartość to: " + maxValue);
    }
}

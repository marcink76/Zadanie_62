public class Main {
    public static void main(String[] args){
        MultiArray multiArray = new MultiArray(20, 10);

        multiArray.randomize();

        multiArray.print();

        multiArray.findMin();

        multiArray.findMax();
    }
}

package controlflow;

public class Loops {
    public static void main(String[] args) {
        forLoops();
        iterateArrays();
        whileLoops();
        doWhile();
    }

    private static void forLoops() {
        // for (initialization; condition; update) {}
        for (var i = 0; i < 5; i++) {
            System.out.println("The iteration number " + i);
        }
    }

    private static void iterateArrays() {
        double[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %.2f\n", i, arr[i]);
        }
    }

    private static void whileLoops() {
        // while(condition) {}
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;  // update
        }
    }

    private static void doWhile() {
        int count = -1;
        do {
            System.out.println("Count is " + count);
            count--;
        } while (count > 0);
    }
}

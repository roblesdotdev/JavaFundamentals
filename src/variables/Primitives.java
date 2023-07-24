package variables;

public class Primitives {
    // psvm<Tab>
    public static void main(String[] args) {
        // sout
        System.out.println("This is the output");

        printInfo();
        System.out.println("=======================================");
        printDemo();

        // type name = value;
   }

    static void printInfo() {
        System.out.println("The most basic variable types in Java are called primitives");
        System.out.println("# There are 4 primitive types that can store whole numbers");
        System.out.println("byte  -> 8 bits");
        System.out.println("short -> 16 bits");
        System.out.println("int   -> 32 bits");
        System.out.println("long  -> 64 bits");
        System.out.println("# There are 2 primitive types that can store floating point numbers");
        System.out.println("float  -> 32 bits");
        System.out.println("double -> 64 bits");
    }

    static void printDemo() {
        byte b = 3;
        short bb = 3;
        int count = 0;
        long largeNumber = 1L;  // Prefix L is for long types

        System.out.printf("Whole numbers -> %d, %d, %d, %d\n", b, bb, count, largeNumber);
    }
}

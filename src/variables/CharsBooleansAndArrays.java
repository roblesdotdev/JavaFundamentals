package variables;

public class CharsBooleansAndArrays {
    public static void main(String[] args) {
        boolean isAdmin = false;

        System.out.println("The value of isAdmin is: " + isAdmin);

        char a = 'a';
        char h = '\uDC7D';
        System.out.printf("%c %c\n", a, h);

        int[] results = {1, 2, 3, 4, 5};

        System.out.println("The first result is " + results[0]);
        System.out.println("The last result is " + results[results.length - 1]);

        printInfo();
    }

    static void printInfo() {
        System.out.println("The boolean type can store true or false");
        System.out.println("Chars can store unicode values");
        System.out.println("Arrays are fixed size");
    }
}

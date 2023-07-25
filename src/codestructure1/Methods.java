package codestructure1;

public class Methods {
    public static void main(String[] args) {
        greet("John Doe");
        int result = addTwoNumbers(33, 4);
        System.out.println(result);
    }

    // modifiers, return type, name(params) {}
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // method signature -> void greet(String)
    public static int addTwoNumbers(int n1, int n2) {
        return n1 + n2;
    }
}

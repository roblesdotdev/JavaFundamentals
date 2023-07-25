package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String name = "John Doe";
        commonMethods();
        compareStrings();
        concatenate();
        fromArray();
        fromString();
    }

    private static void commonMethods() {
        String name = "John Doe";
        System.out.println("The length is " + name.length());
        System.out.println("Upper name: " + name.toUpperCase());
        System.out.println("Lower name: " + name.toLowerCase());
        System.out.println("Contains substring 'oe'? " + name.contains("oe"));
        System.out.println("Starts with J? " + name.startsWith("J"));
        System.out.println("The lastname is " + name.substring(name.indexOf("Doe")));

        String newName = name.replace("John", "Mary");
        System.out.println(name);
        System.out.println(newName);
    }

    private static void compareStrings() {
        String n1 = "john";
        String n2 = "John";

        System.out.println(n1.equals(n2));
        System.out.println(n1.equalsIgnoreCase(n2));
    }

    private static void concatenate() {
        String name = "Mary Jane";
        String greet = "Hello";
        String greeting = greet + " " + name;
        System.out.println(greeting);

        String greeting2 = String.format("%s %s!", greet, name);
        System.out.println(greeting2);
    }

    private static void fromArray() {
        String[] colorsArray = {"red", "blue", "orange", "yellow"};
        String colorsString = String.join(" ", colorsArray);
        System.out.println(colorsString);
    }

    private static void fromString() {
        String colorsString = "red blue orange yellow";
        String[] colorsArray = colorsString.split(" ");
        System.out.println(Arrays.toString(colorsArray));
    }

}

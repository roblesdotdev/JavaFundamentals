package classes;

import java.util.ArrayList;

/*
En Java, las "wrapper classes" (clases envoltorio) son un conjunto de clases que permiten convertir
tipos de datos primitivos en objetos. Los tipos primitivos en Java son aquellos que representan
valores simples, como int, char, boolean, etc. Sin embargo, en ciertas situaciones, es necesario tratar
estos tipos primitivos como objetos para que puedan ser utilizados en algunas bibliotecas y clases
que requieren objetos en lugar de tipos primitivos.

Las "wrapper classes" proporcionan una forma de envolver o encapsular un valor primitivo dentro de un
objeto, lo que permite que los tipos primitivos se comporten como objetos. Cada tipo primitivo tiene su
correspondiente clase envoltorio, que se nombra siguiendo un patrón similar:

int: Integer
char: Character
boolean: Boolean
byte: Byte
short: Short
long: Long
float: Float
double: Double
 */
public class WrapperClasses {
    public static void main(String[] args) {
        Integer count = 0;

        System.out.println(count);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        for (var n : nums) {
            System.out.println("Item: " + n);
        }
    }
}

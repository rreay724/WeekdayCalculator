package com.practice;

import java.util.Scanner;
import java.util.Vector;

public class VectorManipulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /** Vector variables **/
        Vector v1 = new Vector();
        Vector v2 = new Vector();

        /** Print each vector size **/
        System.out.println("Vector 1 size: " + v1.size());
        System.out.println("Vector 2 size: " + v2.size());

        /** Enter 4 Strings **/
        System.out.println("Enter four strings");
        System.out.println("Enter string 1: ");
        String string1 = scanner.next();
        System.out.println("Enter string 2: ");
        String string2 = scanner.next();
        System.out.println("Enter string 3: ");
        String string3 = scanner.next();
        System.out.println("Enter string 4: ");
        String string4 = scanner.next();

        /** Insert strings into first vector object **/
        v1.add(string1);
        v1.add(string2);
        v1.add(string3);
        v1.add(string4);

        /** Enter 4 more Strings **/
        System.out.println("======================================");
        System.out.println("Enter 4 more strings");
        System.out.println("Enter String 1: ");
        String string5 = scanner.next();
        System.out.println("Enter String 2: ");
        String string6 = scanner.next();
        System.out.println("Enter String 3: ");
        String string7 = scanner.next();
        System.out.println("Enter String 4: ");
        String string8 = scanner.next();

        /** Insert next set of strings in second vector object **/
        v2.add(string5);
        v2.add(string6);
        v2.add(string7);
        v2.add(string8);

        /** Print each vectors size and elements contained **/

        System.out.println("Vector 1 size: " + v1.size() + "\nVector 1 contents: " + v1);
        System.out.println("Vector 2 size: " + v2.size() + "\nVector 2 contents: " + v2);

        System.out.println("=======================================");

        System.out.println("Enter index number between 1 and 3 for vector 1: ");
        int i = scanner.nextInt();
        System.out.println("=======================================");

        System.out.println("Element at index " + i + " is " + v1.get(i));
        System.out.println("Element at index " + i + " is " + v2.get(i));

        System.out.println("Removing elements at index " + i);
        v1.remove(i);
        v2.remove(i);
        System.out.println("========================================");
        System.out.println("Contents with removed index from vector 1 is: " + v1);
        System.out.println("Contents with removed index from vector 2 is: " + v2);

        System.out.println("=========================================");

        System.out.println("Adding element at index 0 from vector 1 to vector 2");
        v2.add(v1.get(0));

        System.out.println("Vector 1 size: " + v1.size() + "\nVector 1 contents: " + v1);
        System.out.println("Vector 2 size: " + v2.size() + "\nVector 2 contents: " + v2);

        System.out.println("==========================================");
        System.out.println("Enter one more string: ");
        String string9 = scanner.next();
        v1.add(string9);

        System.out.println("Index of String9 in vector 1 is: " + v1.indexOf(string9));
        System.out.println("============================================");
        System.out.println("First element of vector 1 is: " + v1.firstElement() + "\nLast element of " +
                "vector 1 is: " + v1.lastElement());

        System.out.println("=============================================");
        System.out.println("Clearing all elements from vector 2");
        v2.clear();

        System.out.println("Vector 1 size: " + v1.size() + "\nVector 1 contents: " + v1);
        System.out.println("Vector 2 size: " + v2.size() + "\nVector 2 contents: " + v2);














    }
}

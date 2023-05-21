package code.src.startingoutwithjava.chapter7arrays;

import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        int size1,
                size2;
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the Size of arrayOne: ");
        size1 = read.nextInt();
        System.out.println("Enter the size of arrayTwo: ");
        size2 = read.nextInt();

        Sort s = new Sort(size1, size2);

        System.out.println("Enter elements of array1!");
        s.accept(size1, 1);
        System.out.println("Enter elements of array2!");
        s.accept(size2, 0);

        // Displaying array1.
        System.out.println("The elements of array1 are:");
        int sor[] = s.getArray1();
        for (int val : sor)
            System.out.print(val + " ");
        System.out.println("");

        // Displaying array2.
        System.out.println("The elements of array2 are: ");
        sor = s.getArray2();
        for (int val : sor)
            System.out.print(val + " ");
        System.out.println("");

        // Displaying the sorted array.
        s.display();
        read.close();
    }
}
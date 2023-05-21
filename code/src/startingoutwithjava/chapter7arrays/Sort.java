package code.src.startingoutwithjava.chapter7arrays;

import java.util.Scanner;

public class Sort {
    private int[] array1;
    private int[] array2;
    private int[] sorted;

    public Sort(int size1, int size2) {
        array1 = new int[size1];
        array2 = new int[size2];
        sorted = new int[size1 + size2];
    }

    private void sort() {
        boolean flag = true, a1 = false, a2 = false;
        int index1 = 0, index2 = 0, totalIndex = 0, size;

        if (array1.length >= array2.length) {
            size = array2.length; 
            while (flag) {
                if (array1[index1] > array2[index2]) { 
                    sorted[totalIndex] = array2[index2]; 
                    totalIndex++;
                    index2++;

                    if (index2 == size) {
                        a2 = true; 
                        flag = false; 
                    }
                } else if (array1[index1] < array2[index2]) {  
                    sorted[totalIndex] = array1[index1];
                    totalIndex++;
                    index1++;

                } else {
                    sorted[totalIndex] = array1[index1];
                    totalIndex++;
                    index1++;
                    sorted[totalIndex] = array2[index2];
                    totalIndex++;
                    index2++;

                    if (index2 == size) {
                        a2 = true; // Signaling the end of array2.
                        flag = false; //Signaling to end the loop.
                    }
                }
            }
            // filling whats left of array1
            if (a2 == true) {
                for (int i = index1; i < array1.length; i++) {
                    sorted[totalIndex] = array1[i];
                    totalIndex++;
                }
            }
        } else {
            size = array1.length;
            while (flag) {
                if (array1[index1] > array2[index2]) {
                    sorted[totalIndex] = array2[index2];
                    totalIndex++;
                    index2++;
                } else if (array1[index1] < array2[index2]) {
                    sorted[totalIndex] = array1[index1];
                    totalIndex++;
                    index1++;

                    if (index1 == size) {
                        a1 = true; // signaling array1 has no items left.
                        flag = false; // signaling to end the while loop.
                    }
                } else {
                    sorted[totalIndex] = array1[index1];
                    totalIndex++;
                    index1++;
                    sorted[totalIndex] = array2[index2];
                    totalIndex++;
                    index2++;

                    if (index1 == size) {
                        a1 = true;
                        flag = false;
                    }
                }
            }
            // filling whats left of array2
            if (a1 == true) {
                for (int i = index2; i < array2.length; i++) {
                    sorted[totalIndex] = array2[i];
                    totalIndex++;
                }
            }
        }
    }

    public void accept(int size, int flag) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            if (flag == 1)
                array1[i] = read.nextInt();
            else
                array2[i] = read.nextInt();
        }

    }

    public int[] getArray1() {
        return array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public int[] getSorted() {
        sort();
        return sorted;
    }

    public void display() {
        sort();

        System.out.println("The sorted array is: ");
        for (int val : sorted)
            System.out.print(val);
    }
}

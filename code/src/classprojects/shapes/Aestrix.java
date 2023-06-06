package code.src.classprojects.shapes;

import java.util.Scanner;

public class Aestrix {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int line;
        System.out.print("Enter the line: ");
        line = read.nextInt();
        read.close();
        for (int i = 0; i < line; i++) { // line = 5  i = 1 < 5
            for (int j = line; j > i; j--) { // j =  > 1
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //k = 0 <= 0
                System.out.print("*");
            }

            System.out.print("\t");
            for (int l = 0; l <= i; l++){ // l = 0 <= 0
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

package code.src.startingoutwithjava.chapter5loopsandfiles;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

import java.io.*;

public class ReadWriteData {
    public static void main(String[] args) throws IOException {
        // FileWriter fWriter = new FileWriter("Customers.txt", true);
        // PrintWriter outputFile = new PrintWriter(fWriter);

        // Scanner read = new Scanner(System.in);
        // String names;

        // // accepting from user and writting data to the file.
        // System.out.println("Enter the name of your Friends: ");
        // names = read.nextLine();
        // outputFile.println(names);
        // System.out.println("Enter the name of your Friends: ");
        // names = read.nextLine();
        // outputFile.println(names);
        // System.out.println("Enter the name of your Friends: ");
        // names = read.nextLine();
        // outputFile.println(names);

        // outputFile.close();

        File myFile = new File("Customers.txt");
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNext())
            System.out.println(inputFile.nextLine());
        // System.out.println(inputFile.nextLine());
        // System.out.println(inputFile.nextLine());
        // System.out.println(inputFile.nextLine());

        inputFile.close();

    }
}
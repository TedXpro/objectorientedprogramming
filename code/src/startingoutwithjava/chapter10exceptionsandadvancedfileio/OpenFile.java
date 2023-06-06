package code.src.startingoutwithjava.chapter10exceptionsandadvancedfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String fileName;
        System.out.print("Enter the name of the file: ");
        fileName = read.nextLine();
        read.close();

        try {
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);
            System.out.println("File was found!");
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("The File does not exist!");
        }

        System.out.println("Done");
    }
}

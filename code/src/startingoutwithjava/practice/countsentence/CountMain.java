package code.src.startingoutwithjava.practice.countsentence;

import java.util.Scanner;

/**
 * This program uses the CountSentence class.
 */
public class CountMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sentence = read.nextLine();
        read.close();

        CountSentence mid = new CountSentence(sentence);
        mid.countChar();
        mid.countWords();
        mid.display();
        
    }
}

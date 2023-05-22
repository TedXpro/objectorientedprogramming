package code.src.startingoutwithjava.chapter9inheritance.passfailexam;

import java.util.Scanner;

public class PassFailExamDemo {
    public static void main(String[] args) {
        int questions, 
                missed;
        double minPassing;

        Scanner read = new Scanner(System.in);

        System.out.print("How many questions are on the exam: ");
        questions = read.nextInt();

        System.out.print("How many questions did the student miss: ");
        missed = read.nextInt();

        System.out.print("How much is the minimum passing score: ");
        minPassing = read.nextDouble();
        read.close();

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);
        System.out.println("Each questions count " + exam.getPointsEach() + " points");
        System.out.println("The exam Score is: " + exam.getScore());
        System.out.println("The exam grade is: " + exam.getLetterGrade());
    }
}

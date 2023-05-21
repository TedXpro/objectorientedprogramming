package code.src.startingoutwithjava.chapter9inheritance.finalexam;

import java.util.Scanner;

public class FinalExamDemo {
    public static void main(String[] args) {
        int questions,
                missed;
        Scanner read = new Scanner(System.in);

        System.out.print("How many questions are on the final exam: ");
        questions = read.nextInt();
        System.out.print("How many questions did the student miss: ");
        missed = read.nextInt();

        FinalExam finalExam = new FinalExam(questions, missed);
        System.out.println("Each questoins counts: " +
                finalExam.getPointsEach() + " points");
        System.out.println("The exam Score is " + finalExam.getScore());
        System.out.println("The exam grade is " + finalExam.getLetterGrade());

        read.close();
    }
}

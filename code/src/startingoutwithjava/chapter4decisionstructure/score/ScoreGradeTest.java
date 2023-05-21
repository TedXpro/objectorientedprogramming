package code.src.startingoutwithjava.chapter4decisionstructure.score;
import java.util.Scanner;

/**
 * This program uses the Score Grade class
 * to Grade Scores A - F
 */
public class ScoreGradeTest{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score;

        ScoreGrade grade = new ScoreGrade();

        System.out.print("Enter the score to be graded: ");
        score = read.nextDouble();

        grade.setGrade(score);

        System.out.println("The LetterGrade of the score " 
                + grade.getGrade() + " is " + grade.getLetterGrade());

    }
}

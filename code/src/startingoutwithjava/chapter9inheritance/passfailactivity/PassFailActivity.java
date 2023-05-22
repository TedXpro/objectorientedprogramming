package code.src.startingoutwithjava.chapter9inheritance.passfailactivity;

import code.src.startingoutwithjava.chapter9inheritance.gradedactivity.GradedActivity;

/**
 * This class extends the GradedActivity class to calculate
 * pass of fail.
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    /**
     * set the minPassingScore
     * 
     * @param mps holds the value for the minPassingScore.
     */
    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    public char getLetterGrade() {
        char letterGrade;

        if (score >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}

package code.src.startingoutwithjava.chapter9inheritance.curvedactivity;

import code.src.startingoutwithjava.chapter9inheritance.gradedactivity.GradedActivity;

/**
 * Inherits the Graded Activity class and overloads
 * the setScore method.
 */
public class CurvedActivity extends GradedActivity {
    private double rawScore;
    private double percentage;

    public CurvedActivity(double percentage) {
        this.percentage = percentage;
        rawScore = 0.0;
    }

    public void setScore(double rawScore) {
        this.rawScore = rawScore;
    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }
}

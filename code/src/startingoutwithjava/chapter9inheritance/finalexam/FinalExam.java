package code.src.startingoutwithjava.chapter9inheritance.finalexam;

import code.src.startingoutwithjava.chapter9inheritance.gradedactivity.GradedActivity;

public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        double numericScore;

        this.numMissed = numMissed;
        this.numQuestions = numQuestions;

        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);
        
        setScore(numericScore);
        adjustScore();
    }

    public void adjustScore() {
        double fraction;

        fraction = score - (int) score;

        if (fraction >= 0.5)
            score = score + 1 - fraction;
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public double getNumMissed() {
        return numMissed;
    }
}

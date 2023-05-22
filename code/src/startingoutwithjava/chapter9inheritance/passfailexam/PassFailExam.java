package code.src.startingoutwithjava.chapter9inheritance.passfailexam;

import code.src.startingoutwithjava.chapter9inheritance.passfailactivity.PassFailActivity;

/**
 * This class extends the PassFailActivity class which is also
 * a subclass to the GradedActivity class.
 */
public class PassFailExam extends PassFailActivity{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * assings the fields.
     * @param questions holds the number of questions.
     * @param missed holds the number of questions missed.
     * @param minPassing holds the minPassing score.
     */
    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);

        double numericScore;

        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    /**
     * @return the numQuestions field.
     */
    public int getNumQuestions() {
        return numQuestions;
    }

    /**
     * @return the pointsEach field.
     */
    public double getPointsEach() {
        return pointsEach;
    }
    
    /**
     * @return the numMissed field.
     */
    public int getNumMissed() {
        return numMissed;
    }
}

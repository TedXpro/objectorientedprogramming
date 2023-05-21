package code.src.startingoutwithjava.chapter9inheritance.gradedactivity;

public class GradedActivity {
    protected double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    public GradedActivity() {
        score = 0.0;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getLetterGrade() {
        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}

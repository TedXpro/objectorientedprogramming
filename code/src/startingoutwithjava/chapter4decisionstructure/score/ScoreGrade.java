package code.src.startingoutwithjava.chapter4decisionstructure.score;
/**
 * The Score Grade class ranks a given grade
 * in a particular manner.
 */
public class ScoreGrade {
    private double grade;

    public ScoreGrade() {
        grade = 0.0;
    }

    public void setGrade(double g) {
        grade = g;
    }

    public double getGrade() {
        return grade;
    }

    public char getLetterGrade() {
        if (grade < 60)
            return 'F';
        else {
            if (grade < 70)
                return 'D';
            else {
                if (grade < 80)
                    return 'C';
                else {
                    if (grade < 90)
                        return 'B';
                    else
                        return 'A';
                }
            }
        }
    }
}
package code.src.startingoutwithjava.chapter9inheritance.interfaceexample;

import code.src.startingoutwithjava.chapter9inheritance.gradedactivity.GradedActivity;

public interface Relatable {
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}

package org.jonas;

import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    /**
     * calculates the average score for one assignment
     */
    public void calcAssignmentAvg() {
        //TODO: to be implemented
    }

    /**
     * generates random scores for all students in an assignment, with the following rule:
     * * if the number is `0`, then generate a random score in range `[0, 60)` for the student
     * * if the number is `1`, `2`, then generate a random score in range `[60, 70)` for the student
     * * if the number is `3`, `4`, then generate a random score in range `[70, 80)` for the student
     * * if the number is `5`, `6`, `7`, `8`, then generate a random score in range `[80, 90)` for the student
     * * if the number is `9`, `10`, then generate a random score in range `[90, 100]` for the student
     */
    public void generateRandomScore() {
        Random random = new Random();

        for (int i = 0; i < scores.size(); i++) {
            int randNum = random.nextInt(0, 11);

            int randScore = switch (randNum) {
                case 0 -> random.nextInt(0, 61);
                case 1, 2 -> random.nextInt(60, 71);
                case 3, 4 -> random.nextInt(70, 81);
                case 5, 6, 7, 8 -> random.nextInt(80, 91);
                case 9, 10 -> random.nextInt(90, 101);
                default -> 0;
            };
            scores.add(randScore, i);
        }
        calcAssignmentAvg();
    }

}

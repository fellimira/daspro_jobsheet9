package daspro_jobsheet9;
import java.util.Scanner;
public class GroupScore06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j;
        int score, totalScore, highestGroup = 0;
        double avgScore, highestAverage = 0;

        while (i <= 6) {
            totalScore = 0;

            System.out.println("Group " + i);

            for (j = 1; j <= 5; j++) {
                System.out.print("Score from rating group " + j + " = ");
                score = sc.nextInt();

                totalScore += score;
            }

            avgScore = totalScore / 5.0;

            System.out.println("Total score = " + totalScore);
            System.out.println("Average score = " + avgScore);
            
             if (avgScore > highestAverage) {
                highestAverage = avgScore;
                highestGroup = i;
            }

            System.out.println();
            i++;
        }

        System.out.println("Group with the highest average score: Group " + highestGroup);
        System.out.println("Highest average score = " + highestAverage);

        sc.close();
    }
}
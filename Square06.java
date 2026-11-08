package daspro_jobsheet9;
import java.util.Scanner;
public class Square06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
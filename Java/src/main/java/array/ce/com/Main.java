package array.ce.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays Problem using Java Language");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Questions:");
        System.out.println();
        System.out.println("1. Finding Closet Pair");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("Enter the number question to select the question");
        Scanner scanner = new Scanner(System.in);
        int questionNumber = scanner.nextInt();
        switch (questionNumber){
            case 1:
                System.out.println();
                System.out.println("The nearest point is: " + NearestPoints.findingNearestPoints());
                System.out.println("=======================================");
                System.out.println();
                break;
            default:
                System.out.println();
                System.out.println("=======================================");
                System.out.println("Invalid question number");
                System.out.println("=======================================");
                System.out.println();
                break;
        }
    }
}
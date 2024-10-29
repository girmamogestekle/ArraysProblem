package array.ce.com;

import java.util.Arrays;
import java.util.Scanner;

public class NearestPoints<T> {

    private static double[][] points;

    public static String findingNearestPoints(){
        display();
        double minDistance = Double.MAX_VALUE;
        int p1=0, p2=0;
        for(int i = 0; i < points.length; i++){
            for(int j=i+1; j < points.length; j++){
                double tempMinDistance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(tempMinDistance < minDistance){
                    p1=i;
                    p2=j;
                    minDistance = tempMinDistance;
                }
            }
        }
        return new StringBuilder().append("(" + points[p1][0] + ", " + points[p1][1] + "), ")
                .append("(" + points[p2][0] + ", " + points[p2][1] + ")").toString();
    }

    private static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    private static void display(){
        System.out.println("Enter the number of points");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();
        points = new double[numberOfPoints][2];
        for(int i=0; i<numberOfPoints; i++){
            System.out.println("Enter point [" + (i+1) + ", 1]: ");
            points[i][0] = scanner.nextDouble();
            System.out.println("Enter point [" + (i+1) + ", 2]: ");
            points[i][1] = scanner.nextDouble();
        }
        System.out.println("=======================================");
        System.out.println("Thank you for enter the inputs");
        System.out.println();
        System.out.println("=======================================");
    }

}

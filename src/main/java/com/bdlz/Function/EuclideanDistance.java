package com.bdlz.Function;

import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the X and Y to Find Euclidean distance");
        System.out.println(" Enter X:");
        x=scanner.nextInt();
        System.out.println(" Enter Y:");
        y=scanner.nextInt();
        double distance=  Math.sqrt((x * x) + (y * y));
        System.out.println("Euclidean distance from the point (x, y) to the origin ( 0 , 0):"+distance);
    }
}

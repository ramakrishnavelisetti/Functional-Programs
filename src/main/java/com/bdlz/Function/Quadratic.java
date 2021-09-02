package com.bdlz.Function;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c, Delta;
        float Root1, Root2;

        System.out.println("Calculating Quadratic Roots of Equation");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 'a' in Qudratic equation:");
        a = sc.nextInt();

        System.out.println("Enter the value of 'b' in Qudratic equation:");
        b = sc.nextInt();

        System.out.println("Enter the value of 'c' in Qudratic equation:");
        c = sc.nextInt();

        System.out.println("The roots of the equation " + a + "x^2+" + b + "x+" + c + " are ");
        sc.close();

        Delta = b * b - 4 * a * c;
        System.out.println("Value of Delta =" + Delta);

        if (Delta >= 0) {
            Root1 = (float) (-b + Math.sqrt(Delta)) / (2 * a);
            Root2 = (float) (-b - Math.sqrt(Delta)) / (2 * a);
            System.out.println("Root 1: " + Root1 + "  &  Root 2: " + Root2);
        } else {
            System.out.println("No real solution, Roots are imaginary");
        }
    }

}

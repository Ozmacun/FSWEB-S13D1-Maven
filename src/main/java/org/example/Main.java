package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 16));
        System.out.println("-----------------");
        System.out.println(hasTeen(23, 1, 15));
        System.out.println("-----------------");
        System.out.println(isCatPlaying(false, 36));
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width");
        double width = scanner.nextDouble();
        System.out.println("Enter a height");
        double height = scanner.nextDouble();
        System.out.println("Area of the rectangle is "+ area(width, height));
        System.out.println("-----------------");
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle is " + area(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return (clock < 8 || clock > 20);
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge < 19) ||
                (secondAge > 13 && secondAge < 19) ||
                (thirdAge > 13 && thirdAge < 19);

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int maxTemp = isSummer ? 45 : 35;
        return temp < maxTemp && temp > 25;
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0) {
            System.out.println("One or more invalid values!");
            return -1;
        }
        return width * height;

    }

    public static double area(double radius) {
        if(radius < 0) {
            System.out.println("Invalid radius value!");
            return -1;
        }
        return Math.pow(radius,2)*Math.PI;
    }

}

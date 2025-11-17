package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(2, 5, 3, 6);
        System.out.println("result (2, 5) to (3, 6) " + result2);
        double result3 = Point.distance(5, 3, 3, 1);
        System.out.println("result (5, 3) to (3, 1) " + result3);
        double result4 = Point.distance(0, 0, 0, 5);
        System.out.println("result (0, 0) to (0, 5) " + result4);
    }
}

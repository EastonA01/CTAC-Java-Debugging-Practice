package org.example;

import java.util.ArrayList;

public class Main {
    // ArrayList Initialization
    static ArrayList<Integer> nums = new ArrayList<>();
    public static void main(String[] args) {
        // Add numbers
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        // Deliberate NullPointerException
        ArrayList<Integer> nullList = null;
        try {
            System.out.println(calculateAverage(nullList)); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Deliberate ArrayIndexOutOfBoundsException
        try {
            // Accessing an invalid index
            System.out.println(nums.get(10)); // This will cause ArrayIndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Normal execution
        System.out.println("Average of nums: " + calculateAverage(nums));
    }


    /**
    Write a Java method that calculates the average of an array of integers.
    This method should take an array of integers as input
    and return a double as output.
    @param numbers Is an array of integers
     @return double as output
     **/
    public static double calculateAverage(ArrayList<Integer> numbers){
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();

        // BAD OUTPUT FOR REFERENCE:
        // return sum / 10;
    }
}
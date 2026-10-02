/**
 *  Java program to create, update, and delete HashMap instance.
 */

package com.mycollections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<Integer, BigDecimal> myMap = new HashMap<>();

        // Add.
        myMap.put(1, new BigDecimal("8.9"));
        myMap.put(8, new BigDecimal("7.9"));
        myMap.put(2, new BigDecimal("8.1"));
        myMap.put(3, new BigDecimal("8.6"));
        myMap.put(4, new BigDecimal("6.5"));
        myMap.put(5, new BigDecimal("3.9"));
        myMap.put(6, new BigDecimal("7.9"));
        myMap.put(7, new BigDecimal("2.9"));
        myMap.put(9, new BigDecimal("1.9"));

        // Display.
        System.out.println(myMap);

        // Delete.
        myMap.remove(7);

        // Display.
        System.out.println(myMap);

        // Replace.
        myMap.replace(9, new BigDecimal("1000000"));

        // Display.
        System.out.println(myMap);

        // Clear.
        myMap.clear();

    }
}
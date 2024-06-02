package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )    {

        String[] cities = {"London", "Lviv", "New York"};
        String searchString = "Malaga";

        boolean result = isElementInArray(cities, searchString);
        System.out.println("Is the city in the list? " + result);
    }

    public static boolean isElementInArray(String[] array, String searchString) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchString)) {
                return true;
            }
        }

        for (String element : array) {
            if (element.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

}




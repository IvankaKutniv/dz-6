package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App
{
//    public static void main( String[] args )    {
//
//        String[] cities = {"London", "Lviv", "New York"};
//        String searchString = "Malaga";
//
//        boolean result = isElementInArray(cities, searchString);
//        System.out.println("Is the city in the list? " + result);
//    }
//
//    public static boolean isElementInArray(String[] array, String searchString) {
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(searchString)) {
//                return true;
//            }
//        }
//
//        for (String element : array) {
//            if (element.equals(searchString)) {
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        List<String> cities = Arrays.asList("London", "Lviv", "Lviv", "New York", "London");

        System.out.println("Set of unique cities:");
        removeDuplicatesAndPrintSet(cities);
    }

    public static void removeDuplicatesAndPrintSet(List<String> list) {

        Set<String> uniqueSet = new HashSet<>(list);


        for (String element : uniqueSet) {
            System.out.println(element);
        }


        Iterator<String> iterator = uniqueSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}




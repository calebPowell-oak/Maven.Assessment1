package com.zipcodewilmington.assessment1.part2;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object word : objectArray) {
            if (word == objectToCount) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer[] a = (Integer[])objectArray;
        Integer r = (Integer)objectToRemove;

        ArrayList<Integer> work = new ArrayList<>(Arrays.asList(a));
        for(int i = 0; i < work.size();){
            if(work.get(i).equals(r)){
                work.remove(i);
            } else {
                i++;
            }
        }
        return work.toArray(new Integer[0]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        for(int i = 0; i < objectArray.length - 1; i++){
            if(getNumberOfOccurrences(objectArray, mostCommon) < getNumberOfOccurrences(objectArray, objectArray[i + 1])){
                mostCommon = objectArray[i + 1];
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        for(int i = 0; i < objectArray.length - 1; i++){
            if(getNumberOfOccurrences(objectArray, mostCommon) > getNumberOfOccurrences(objectArray, objectArray[i + 1])){
                mostCommon = objectArray[i + 1];
            }
        }
        return mostCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */

    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] a = (Integer[])objectArray;
        Integer[] b = (Integer[])objectArrayToAdd;

        Integer[] ans = new Integer[objectArray.length + objectArrayToAdd.length];
        for(int i = 0; i < objectArray.length; i++){
            ans[i] = a[i];
        }
        for(int i = objectArray.length; i < objectArray.length + objectArrayToAdd.length; i++){
            ans[i] = b[i - a.length];
        }
        return ans;
    }
}

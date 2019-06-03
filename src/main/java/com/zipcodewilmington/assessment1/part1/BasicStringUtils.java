package com.zipcodewilmington.assessment1.part1;

import javafx.beans.binding.StringBinding;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] arr = str.split("");
        arr[0] = arr[0].toUpperCase();
        StringBuilder n = new StringBuilder();
        for(String character:arr){
            n.append(character);
        }
        return n.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder n = new StringBuilder();
        n.append(str);
        n.reverse();
        return n.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String[] arr = str.split("");
        StringBuilder n = new StringBuilder();
        for(int i = 1; i < arr.length - 1; i++){
            n.append(arr[i]);
        }
        return n.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        Character[] arby = new Character[arr.length];
        for(int i = 0; i < arr.length; i++){
            arby[i] = arr[i];
        }
        for(int i = 0; i < arby.length; i++){
            if(Character.isUpperCase(arby[i])){
                arby[i] = Character.toLowerCase(arby[i]);
            } else if(Character.isLowerCase(arby[i])){
                arby[i] = Character.toUpperCase(arby[i]);
            }
        }
        StringBuilder n = new StringBuilder();
        for(Character letter : arby){
            n.append(letter);
        }
        return n.toString();
    }
}

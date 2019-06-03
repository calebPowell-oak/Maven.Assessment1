package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        return null;
    }

    public static boolean isPalindromic(String str) {
        StringBuilder x = new StringBuilder();
        char[] arr = str.toCharArray();
        for(char e : arr){
            x.append(e);
        }
        return str.equals(x.reverse().toString());
    }
}

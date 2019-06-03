package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public static Integer countPalindromes(String input){
        Integer count = 0;
        String result = "";
        for(int i = 1; i <= input.length(); i++){
            for(int j = 0; j <= input.length() - i; j++){
                if(isPalindromic(input.substring(j,j+i))){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindromic(String str) {
        StringBuilder x = new StringBuilder();
        char[] arr = str.toCharArray();
        for(char e : arr){
            x.append(e);
        }
        x.reverse();
        return str.equals(x.toString());
    }
}

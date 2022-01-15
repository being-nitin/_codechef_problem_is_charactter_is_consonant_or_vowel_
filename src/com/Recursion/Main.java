package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Write a program to take a character (C) as input and check whether the given character
	is a vowel or a consonant.
    NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

    Input:
    First line will contain the character C.
    Output:
    Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

    Constraints
    C will be an upper case English alphabet
    Sample Input:
    Z
    Sample Output:
    Consonant
	 */
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        System.out.println("Vowel");
    }
    else{
        System.out.println("Consonant");
    }
    }
}

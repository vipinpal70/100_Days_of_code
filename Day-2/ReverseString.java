
/*
 * In this problem i am using array.
 * firts we take an String from the user and after that we reverse the by using two method.
 * 1 byChar() -->  In this method we reverse string by characters.
 * Every characters will be reverser now.
 * 2 bywords() ---> In this method we reverse string by words.
 * Every words will be in  reverser order.
 * 
 * Examples -->
 *  1
 *  Hello I am arnav
 * 
 *  vanra ma i olleh
 *  arnav am i Hello
 *  2
 *  who are you?
 * 
 *  ?uoy era ohw
 *  you? are who
 */



//  code start here ------------------------------------------------------>

import java.util.Scanner;

public class ReverseString {
    void byChar(String str){   // Reverse by characters
        int l = str.length();  // for find lenght
        StringBuilder st = new StringBuilder("");   // declared a empty string
        while( l>0){
           st.append(str.charAt(l-1));   // adding every character in the string
           l--;
        }
        System.out.println(st);  // printing output

    }
    void byWords(String st){  // Reverse by words
        String[] words = st.split("\\s"); // make an array to take each word
        int length = words.length;
        for (int i = length-1; i >=0; i--) {
            System.out.print(words[i]+" ");    // printing output
        } 

    }
    public static void main(String[] args) {      //  Main funtion ---->S
        ReverseString arr = new ReverseString();  // creating object of class
        Scanner s = new Scanner(System.in);      // creating object of Scanner Class
        String str = s.nextLine();               // taking string from user
        arr.byChar(str);                         // calling method bychar
        arr.byWords(str);                        // calling method bywords
        s.close();                               // closeing Scanner object
    }
}

/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
It's time to test your knowledge of Static initialization blocks. You can read about it here.
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and H height . 
You should read the variables from the standard input.
If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
Input Format
There are two lines of input. The first line contains B : the breadth of the parallelogram. The next line contains H : the height of the parallelogram.
Constraints
-100<=B<=100
-100<=H<=100
Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
Sample input 1
1
3
Sample output 1
3
Sample input 2
-1
2
Sample output 2
java.lang.Exception: Breadth and height must be positive
*/

//CODE

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        if(b<=100 && b>=-100 && h<=100 && h>=-100)
        {
            if(b>0 && h>0)
            System.out.print(b*h);
            else
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

//TEST CASES

/*
TEST CASE 0
Input (stdin)
1
3
Expected Output
3
TEST CASE 1
Input (stdin)
-1
2
Expected Output
java.lang.Exception: Breadth and height must be positive
TEST CASE 2
Input (stdin)
100
-99
Expected Output
java.lang.Exception: Breadth and height must be positive
TEST CASE 3
Input (stdin)
-9
-8
Expected Output
java.lang.Exception: Breadth and height must be positive
TEST CASE 4
Input (stdin)
89
92
Expected Output
8188
TEST CASE 5
Input (stdin)
-100
99
Expected Output
java.lang.Exception: Breadth and height must be positive
*/

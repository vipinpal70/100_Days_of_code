/*Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)
Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.
This problem will test your knowledge on try-catch block.
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
Sample Input 0:
10
3
Sample Output 0:
3
Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException
Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero
Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException
*/

//CODE

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);

        try
        {
           int a=sc.nextInt();
           int b=sc.nextInt();
           System.out.println(a/b); 
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(java.lang.ArithmeticException ae)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

/*
TEST CASE 0

Input (stdin)

10
3
Expected Output
3

TEST CASE 1

Input (stdin)

10
Hello
Expected Output

java.util.InputMismatchException

TEST CASE 2

Input (stdin)

10
0
Expected Output

java.lang.ArithmeticException: / by zero

TEST CASE 3

Input (stdin)

Download
Hello
0
Expected Output

Download
java.util.InputMismatchException

TEST CASE 4

Input (stdin)

2147483648
2147483648
Expected Output

java.util.InputMismatchException

TEST CASE 5

Input (stdin)

2
-2147483649
Expected Output

java.util.InputMismatchException

TEST CASE 6

Input (stdin)

456
0
Expected Output

java.lang.ArithmeticException: / by zero

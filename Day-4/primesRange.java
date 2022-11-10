/*
In this problem I am checking a number is prime or not within a range.
if it's prime number then display that number.
basicaly it display all primes number within range

Input:
I am taking a int type input from the user to display the list of all  prime within that range.


Output:
In this section we are printing only the list of all  primes numbers on the screen.


For examples:
1.  number = 35  -----> 3 5 7 11 13 17 19 23 29 31

2.  number = 43 ------->  3 5 7 11 13 17 19 23 29 31 37 41 43

3.  number = 68 --------> 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67

*/


// code start here now ----------------------->

import java.util.Scanner;

public class primesRange {

    public static boolean prime(int n)
    {
        boolean  isPrime=true;
        if(n==2)
            return false;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            { return false;}
        }
        return  isPrime;
    }
    public static void primeRange(int n)
    {
        for(int i=2;i<=n;i++) {
            if (prime(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        primesRange(number);

    }
}

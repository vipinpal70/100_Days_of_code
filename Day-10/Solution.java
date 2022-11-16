import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void printCurrency(double x, Locale locale){  
        double dbl=x;  
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
        String currency=formatter.format(dbl);  
        System.out.print(": "+currency);  
    }
    public static void main(String[] args) throws IOException, ParseException {
        Scanner s = new Scanner(System.in);
        double py = s.nextDouble();
        System.out.print("US");
        printCurrency(py, Locale.US);
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String number = formatter.format(py);
        System.out.println("\nIndia: Rs." + number);
        System.out.print("China");
        printCurrency(py, Locale.CHINA);
        System.out.print("\nFrence");
        printCurrency(py, Locale.FRANCE);
        s.close();

    }
}

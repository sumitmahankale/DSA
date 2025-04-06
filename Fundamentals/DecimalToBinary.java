package Fundamentals;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        //Convert Decimal Number to Binary...
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal Number :");
        int num=sc.nextInt();
        String result="";
        while (num>0) {
            int rem=num%2;
            num=num/2;
            result=rem+result;
        }
        System.out.println("Binary Conversion is: "+result);
    }
}

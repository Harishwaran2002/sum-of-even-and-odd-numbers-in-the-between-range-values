import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=0;
        int sum1=0,sum2=0;
        if(a>=1&&a<100||b>=1&&b<=99)
        {       
            for(i=a;i<=b;i++)
                {
                    if(i%2==0)
                    {
                    sum1=sum1+i;
                    }
                    else
                    {
                        sum2=sum2+i;
                    }
            }
            System.out.printf("The Even Sum value is %.2f\n",(float)sum1); 
            System.out.printf("The Odd Sum value is %.2f\n",(float)sum2); 
        }
        else
        {
         System.out.println("Invalid Input");   
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

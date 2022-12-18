// Write the code to swap two numbers without using third variable.
import java.util.*;
public class Assis5 {
    public static void main(String args[]){

        System.out.println("Before Swapping the numbers");
        System.out.println("Enter first value");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("Enter second value");
        Scanner sb=new Scanner(System.in);
        int b=sb.nextInt();

         a=a+b;
         b=a-b;
         a=a-b;

         System.out.println("After swapping "+(a)+"  "+(b));




    }

    
}

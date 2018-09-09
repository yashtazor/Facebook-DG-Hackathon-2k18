import java.util.*;
import java.math.*;

public class Library{
    public static void library(){
            Scanner scr=new Scanner(System.in);
            double choice,num;
            System.out.println("Enter the number.");
            num=scr.nextInt();
            
            System.out.println("Enter the operation.");
            System.out.println("1.  sin");
            System.out.println("2.  cos");
            System.out.println("3.  tan");
            System.out.println("4.  asin");
            System.out.println("5.  acos");
            System.out.println("6.  atan");
            
            System.out.println("7.  Exponenet");
            System.out.println("8.  log");
            System.out.println("9.  ln");
            System.out.println("10. Square Root");
            
            choice=scr.nextInt();
            System.out.println("\f");
            
            double sinval=Math.sin(num);
            double cosval=Math.cos(num);
            double tanval=Math.tan(num);
            double asinval=Math.asin(num);
            double acosval=Math.acos(num);
            double atanval=Math.atan(num);
            double coshval=Math.cosh(num);
            double sinhval=Math.sinh(num);
            double expval=Math.exp(num);
            double logval=Math.log10(num);
            double lnval=Math.log(num);
            double sqval=Math.log(num);
            
            if(choice == 1)
            {
                System.out.println (sinval);
            }
            else if(choice == 2)
            {
                System.out.println (cosval);
            }
            else if(choice == 3)
            {
                System.out.println (tanval);
            }
            else if(choice == 4)
            {
                System.out.println (asinval);
            }
            else if(choice == 5)
            {
                System.out.println (acosval);
            }
            else if(choice == 6)
            {
                System.out.println (atanval);
            }
            else if(choice == 7)
            {
                System.out.println (expval);
            }
            else if(choice == 8)
            {
                System.out.println (logval);
            }
            else if(choice == 9)
            {
                System.out.println (lnval);
            }
            else if(choice == 10)
            {
                System.out.println (sqval);
            }
        }
    }
import java.util.*;
import java.math.*;

public class Basics{
    public static void basics()
    {
            Scanner sc=new Scanner(System.in);
            float a=sc.nextFloat();
            String operator=sc.next();
            float b=sc.nextFloat();
            
            System.out.print("Enter number");
            if(operator.equals("+"))
            {
                float sum=a+b;
                System.out.println(sum);
            }
            else if(operator.equals("-"))
            {
                float diff=a-b;
                System.out.println(diff);
            }
            else if(operator.equals("*"))
            {
                float prod=a*b;
                System.out.println(prod);
            }
            else if(operator.equals("/"))
            {
                float quo=a/b;
                System.out.println(quo);
            }
            else if(operator.equals("^"))
            {
            double power=Math.pow(a,b);
                System.out.println(power);
                if(a==10)
                {
                   power=Math.pow(a,b); 
                }
            }
    }
}

import java.util.*;

public class EQ{
    public static void equationsolver()
    {
            Scanner scr=new Scanner(System.in);
            int ukno;
            System.out.println("Number of unknowns? (2 or 3)");
            ukno=scr.nextInt();
            if(ukno == 2)
            {
                System.out.println("a1?");
                float a1=scr.nextFloat();
                System.out.println("b1?");
                float b1=scr.nextFloat();
                System.out.println("c1?");
                float c1=scr.nextFloat();
                System.out.println("a2?");
                float a2=scr.nextFloat();
                System.out.println("b2?");
                float b2=scr.nextFloat();
                System.out.println("c2?");
                float c2=scr.nextFloat();
                
                float x=(c1*b2-c2*b1)/(a1*b2-b1*a2);
                float y=(a1*c2-a2*c1)/(a1*b2-b1*a2);
                System.out.println("x = "+x);
                System.out.println("y = "+y);
            }
            
            else if(ukno == 3)
            {
                System.out.println("a1?");
                float a1=scr.nextFloat();
                System.out.println("b1?");
                float b1=scr.nextFloat();
                System.out.println("c1?");
                float c1=scr.nextFloat();
                System.out.println("d1?");
                float d1=scr.nextFloat();
                System.out.println("a2?");
                float a2=scr.nextFloat();
                System.out.println("b2?");
                float b2=scr.nextFloat();
                System.out.println("c2?");
                float c2=scr.nextFloat();
                System.out.println("d2?");
                float d2=scr.nextFloat();
                System.out.println("a3?");
                float a3=scr.nextFloat();
                System.out.println("b3?");
                float b3=scr.nextFloat();
                System.out.println("c3?");
                float c3=scr.nextFloat();
                System.out.println("d3?");
                float d3=scr.nextFloat();
                
                float x=(d1*(b2*c3-c2*b3) - b1*(d2*c3-c2*d3) + c1*(d2*b3-b2*d3))/(a1*(b2*c3-c2*b3) - b1*(a2*c3-a3*c2) + c1*(a2*b3-b2*a3));
                float y=(a1*(d2*c3-c2*d3) - d1*(a2*c3-c2*a3) + c1*(a2*d3-d2*a3))/(a1*(b2*c3-c2*b3) - b1*(a2*c3-a3*c2) + c1*(a2*b3-b2*a3));
                float z=(a1*(b2*d3-d2*b3) - b1*(a2*d3-d2*a3) + d1*(a2*b3-b2*a3))/(a1*(b2*c3-c2*b3) - b1*(a2*c3-a3*c2) + c1*(a2*b3-b2*a3));
                
                System.out.println("x = "+x);
                System.out.println("y = "+y);
                System.out.println("z = "+z);
            }
        }
    }
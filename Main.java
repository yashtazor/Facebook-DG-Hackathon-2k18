import java.io.*;
import java.util.*;
import java.math.*;


public class Main
{
     

    public static void main(String args[]) throws Exception
    {
        long startTime = System.currentTimeMillis();
        Date d=new Date();
        System.out.println(d);//date.
        Scanner sc = new Scanner(System.in);
        int ans=1;
        
        
        while(ans==1)
        {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mode");
        System.out.println("1. Basic");
        System.out.println("2. Scientific");
        System.out.println("3. Equation Solver");
        System.out.println("4. Matrix Operations");
        System.out.println("5. Complex Number Operations");
        
        
        String password;
        int mode;
        int i=0,j=0;
        mode=s.nextInt();
        System.out.println("\f");
        
        switch(mode)
        {
            case 1: //Basics.
            Basics basicobject=new Basics();
            basicobject.basics();
            break;
            
            case 2: // Basic math functions.
            Library libobject=new Library();
            libobject.library();
            break;
            
            case 3: //Equation Solver.
            EQ eqobject=new EQ();
            eqobject.equationsolver();
            break;
            
            case 4: //Matrix Operations.
            Matrix matobject=new Matrix();
            matobject.matrix();
            break;
            
            case 5:
            Complex compobject=new Complex();
            compobject.complex();
            break;
            
            default:
            
                
            System.out.println("Enter the password.");
            password = s.next();
            if(password.equals("abc"))
            {
                System.out.println("Exiting...");
                ans=0;
            } 
         
            
            else{
                System.out.println("\f");
                System.out.println("Wrong Password!\n\n");
            }
                
                    
            break;
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;
        if(elapsedMinutes > 90)
        {
            System.out.println("Time Up!");
        }
    
    
}
}
   }     
   



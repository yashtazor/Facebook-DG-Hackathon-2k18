import java.util.*;

public class Complex
{
    public static void complex()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter real part of first number");
    float a1=s.nextFloat();
    System.out.println("enter imaginary part of first number");
    float b1=s.nextFloat();
    System.out.println("Enter real part of second number");
    float a2=s.nextFloat();
    System.out.println("enter imaginary part of second number");
    float b2=s.nextFloat();
    System.out.println("choose operation");
    System.out.println("1.Addition");
    System.out.println("2.Subbtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Divison");
    int c=s.nextInt();
    switch(c)
    {
        case 1:
        float l=a1+a2;
        float i=b1+b2;
        System.out.println(l+"+"+i+"i");
        break;
        case 2 :
        
        float l1=a1-a2;
        float i1=b1-b2;
        System.out.println(l1+"+"+i1+"i");
        break;
        case 3:
        
        float l2=(a1*a2)-(b1*b2);
        float i2=(b1*a2)+(a1*b2);
        System.out.println(l2+"+"+i2+"i");
        break;
        
        case 4:
        
        float l3=((a1)/((a2*a2)+(b2*b2)));
        float i3=(b1)/((a2*a2)+(b2*b2));
        System.out.println(l3+"+"+i3+"i");
        break;
}
}    
}
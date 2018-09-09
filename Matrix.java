import java.io.*;
import java.util.*;

public class Matrix
{
public static void matrix()
{
  Scanner s=new Scanner(System.in);
  System.out.print("Enter order of matrixes.");
  int n=s.nextInt();
  int[][] m=new int[n][n];
  int[][] l=new int[n][n];
  int[][] p =new int[n][n];
  int det=0;
  int  c=0;
  int i,j;
  
  
  System.out.println("Enter first matrix.");
  for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++)
  {
      m[i][j]=s.nextInt();
    }
  }
  
  System.out.println("Enter second matrix.");
  for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++)
  {
      l[i][j]=s.nextInt();
    }
  }
  
  System.out.println("Enter process.");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  
  int g=s.nextInt();
  if(n==2)
  {
  switch(g)
  {
    case 1:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[i][j]=m[i][j] + l[i][j];
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
    case 2:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[i][j]=m[i][j] - l[i][j];
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
    case 3:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[0][0]=(m[0][0] * l[0][0]) + (m[0][1] * l[1][0]);
            p[0][1]=(m[0][0] * l[0][1]) + (m[0][1] * l[1][1]);
            p[1][0]=(m[1][0] * l[0][0]) + (m[1][1] * l[1][0]);
            p[1][1]=(m[1][0] * l[0][1]) + (m[1][1] * l[1][1]);
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
}
}

if(n==3)
  {
  switch(g)
  {
    case 1:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[i][j]=m[i][j] + l[i][j];
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
    case 2:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[i][j]=m[i][j] - l[i][j];
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
    case 3:
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            p[0][0]=(m[0][0] * l[0][0]) + (m[0][1] * l[1][0]) + (m[0][2] * l[2][0]);
            p[0][1]=(m[0][0] * l[0][1]) + (m[0][1] * l[1][1]) + (m[0][2] * l[2][1]);
            p[0][2]=(m[0][0] * l[0][2]) + (m[0][1] * l[1][2]) + (m[0][2] * l[2][2]);
            p[1][0]=(m[1][0] * l[0][0]) + (m[1][1] * l[1][0]) + (m[1][2] * l[2][0]);
            p[1][1]=(m[1][0] * l[0][1]) + (m[1][1] * l[1][1]) + (m[1][2] * l[2][1]);
            p[1][2]=(m[1][0] * l[0][2]) + (m[1][1] * l[1][2]) + (m[1][2] * l[2][2]);
            p[2][0]=(m[2][0] * l[0][0]) + (m[2][1] * l[1][0]) + (m[2][2] * l[2][0]);
            p[2][1]=(m[2][0] * l[0][1]) + (m[2][1] * l[1][1]) + (m[2][2] * l[2][1]);
            p[2][2]=(m[2][0] * l[0][2]) + (m[2][1] * l[1][2]) + (m[2][2] * l[2][2]);
        }
    
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.println(p[i][j]);
        }
    
    }
    break;
    
}
}
}
}
  
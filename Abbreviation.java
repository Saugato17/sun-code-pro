import java.lang.*;
import java.io.*;
import java.util.*;

class Abbreviation
{
    public static void main(String []args)
    {
        System.out.print("\f");
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.print("Enter your full name : ");
        s=sc.nextLine();
        int l= s.length();
        char hold, hold2;;
      
        for(int i=0;i<l;i++)
        {
            hold=s.charAt(i);
           
            if(i==1)
            {
                hold2= s.charAt(0);
                System.out.print(hold2+".");
            }
            else if(hold==' ')
            {
                char hold3= s.charAt(i+1);
                
                System.out.print(hold3+".");
            }
        }
    }
}
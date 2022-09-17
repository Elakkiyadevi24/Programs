# Programs
import java.util.*;
class amstrong
{
    public static void main(String args[]) throws Exception
    {
        int r,result=0, input;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=s.nextInt();
        input=number;
        while(number!=0)
        {
            
         r = number % 10;
         result = result+ (r*r*r);
         number = number/10;
        }
        if(input==result)
            System.out.println(result+"is the Amstrong number");
        else
            System.out.printf(result+"is not a Amstrong number");
        
     }   
        
    }

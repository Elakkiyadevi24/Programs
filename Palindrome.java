import java.util.*;
class palindrome
{
    public static void main(String args[]) throws Exception
    {
        int r,result=0,tem=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int Number = s.nextInt();
        tem = Number;
        while(Number!=0)
        {    
           
            r=Number%10;
            result=(result*10)+r;
            Number=Number/10;
        }
        if(tem == result)
            System.out.println(result+"\tis a Palindrome");
        else
            System.out.println(result+"\tis a not a Palindrome");
    }
}

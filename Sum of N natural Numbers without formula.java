import java.util.*;
class number
{
    void sum(int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum+"\tis the sum of N natural numbers");
    }
}
class m // main class
{
    public static void main(String args[]) throws Exception
    {
        Scanner s=new Scanner(System.in);
         System.out.println("Enter the number");
        int n=s.nextInt();
        number o=new number();
        o.sum(n);
    }
}

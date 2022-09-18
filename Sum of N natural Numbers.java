import java.io.*;
class number
{
    void sum() throws Exception
    {
        DataInputStream d=new DataInputStream(System.in);
        int n=Integer.parseInt(d.readLine());
        System.out.println("Enter the number");
        int Result=(n*(n+1))/2;
        System.out.println(Result+"\tis the sum of n natural numbers");
        
    }
}
class m // main class
{
    public static void main(String args[]) throws Exception
    {
        number o=new number();// object creation
        o.sum();//function call
    }
}

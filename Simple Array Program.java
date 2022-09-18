import java.io.*;
class arr
{
    public static void main(String args[]) throws Exception
    {
        int array[]=new int[10];
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the limit:");
        int n=Integer.parseInt(d.readLine());
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=Integer.parseInt(d.readLine());
        }
        System.out.print("The array elements are ");
        for(int i=0;i<n;i++)
        {
             System.out.print(array[i]);   
        }
        
        
    }
}

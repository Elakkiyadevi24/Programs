import java.io.*;
class HelloWorld {
    public static void main(String[] args) throws IOException {
    DataInputStream d=new DataInputStream(System.in);
    System.out.println("Enter the Integer");
    int a=Integer.parseInt(d.readLine());
    System.out.println(a);
    }
}

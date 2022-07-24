import java.io.*;

public class println {
    public static void main(String[] args) throws IOException
    {
        System.out.println("hey");
        System.out.println("hello");

        int a=10;
        int b=20;

        int c= a+b;
        
        System.out.println("the first no. is"+a+ "second no. is" +b);
        System.out.println("sum is"+c);

        System.out.println("we use buffered reader method");
        System.out.println("enter two numbers");

        BufferedReader suraj= new BufferedReader(new InputStreamReader(System.in));
        
        a=Integer.parseInt(suraj.readLine());
        b=Integer.parseInt(suraj.readLine());

        c=a+b;

        System.out.println("the sum is "+c+ "\n and value of b is "+b+"value of c is"+c);
    }
}

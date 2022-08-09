import java.net.SocketTimeoutException;
import java.util.*;

import javax.security.sasl.SaslException;

class n_NO_print{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a;
        System.out.println("enter no. upto which you want to print");
        a= sc.nextInt();
        sc.close();

        int i=1;
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
}
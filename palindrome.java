import java.util.*;
class palindrome {
    public static void main(String[] suraj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        int z= n;
        int rev=0;
        while(n>0){
        rev=(rev*10)+(n%10);
        n=n/10;

        }
        if(rev == z)
         System.out.println("It is palindrome");
        
        else
         System.out.println("Not palindrome");
    }
}

//Sum of N natural numbers:

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=i+sum;
        }
        System.out.println(sum);
    }
}

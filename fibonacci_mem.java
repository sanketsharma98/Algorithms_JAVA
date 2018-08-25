import java.util.Arrays;
import java.util.Scanner;

public class fibonacci_mem{
    long[] tm=new long[100];
    fibonacci_mem()
    {
        Arrays.fill(tm,-1);
        tm[0]=0;
        tm[1]=1;
    }

    long fib(int n)
    {
      if(n<2)
        return n;
      else
      {
        if((tm[n-1]!=-1)&&(tm[n-2]!=-1))
        {
          tm[n]=tm[n-1]+tm[n-2];
          return tm[n];
        }
        else if((tm[n-1]==-1)&&(tm[n-2]!=-1))
                return (fib(n-1)+tm[n-2]);
        else
            return (fib(n-1)+fib(n-2));
      }

    }

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  System.out.println("Which term do you want to find from Fibonacci Series ?");
  int term=sc.nextInt();
  fibonacci_mem fb=new fibonacci_mem();
  System.out.println("The Term is "+fb.fib(term));
}
}
//

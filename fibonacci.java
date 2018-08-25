import java.util.Scanner;

public class fibonacci{
    long fib(int n)
    {
      if(n<2)
        return n;
      return fib(n-1)+fib(n-2);
    }

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  System.out.println("Which term do you want to find from Fibonacci Series ?");
  int term=sc.nextInt();
  fibonacci fb=new fibonacci();
  System.out.println("The Term is "+fb.fib(term));
}
}

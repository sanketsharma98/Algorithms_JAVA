import java.util.Scanner;

public class stack{

  int MAX=20;
  int[] array=new int[MAX];
  int top;

  stack()
  {
    this.top=-1;	
  }		
  
  void insert(int num)
  {
    if(top==(MAX-1))
    	System.out.println("Stack is Full");
    else
    {
      top++;
      array[top]=num;
    }
  }
  void pop()
  {
    if(top==-1)
      System.out.println("Stack is empty");
    else
      top--;
  }
  void peek()
  {
    for(int i=top;i>=0;i--)
      System.out.print(array[i]+" ");
    System.out.println();
  }
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    stack stk=new stack();
    stk.insert(1);
    stk.insert(2);
    stk.insert(3);
    stk.pop();
    stk.peek();

}
}

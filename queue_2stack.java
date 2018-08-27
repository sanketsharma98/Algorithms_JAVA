import java.util.Scanner;
//Code for class STACK should be written inside another file as STACK.java or inside queue_2stack.java class in same file...
class STACK{
  int MAX=20;
  int[] array=new int[MAX];
  int top;
  STACK()
  {
    this.top=-1;
  }
  boolean isempty()
  {
    if(top==-1)
      return true;
    return false;
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
  int remove()
  {
    if(top==-1)
      System.out.println("Stack is empty");
    else
      top--;
      return array[top+1];
  }
  void peek()
  {
    for(int i=top;i>=0;i--)
      System.out.print(array[i]+" ");
    System.out.println();
  }
}
//End of class STACK...
public class queue_2stack{

      STACK s1=new STACK();
      STACK s2=new STACK();

      void push(int num)
      {
          s1.insert(num);
      }
      void pop()
      {
        while(!s1.isempty())
          s2.insert(s1.remove());
        s2.remove();
        while(!s2.isempty())
          s1.insert(s2.remove());
      }
      void display()
      {
        while(!s1.isempty())
          s2.insert(s1.remove());
        s2.peek();
      }

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    queue_2stack qu= new queue_2stack();
    qu.push(1);
    qu.push(2);
    qu.push(3);
    qu.push(4);
    qu.pop();
    qu.display();

}
}

import java.util.Scanner;
import java.util.Arrays;

public class jobsequencing{
  int swap;
  char swap1;
  //int reward;
  int time;

  jobsequencing()
  {
    this.time=0;
  }
  void sequence(char[] jobid,int[] deadline,int[] profit)
  {
    int len=jobid.length;
    for(int i=0;i<len;i++)
    {
      for(int j=i;j<len;j++)
      {
        if(profit[i]<profit[j])
        {
          swap=profit[i];
          profit[i]=profit[j];
          profit[j]=swap;

          swap=deadline[i];
          deadline[i]=deadline[j];
          deadline[j]=swap;

          swap1=jobid[i];
          jobid[i]=jobid[j];
          jobid[j]=swap1;
        }
      }
    }

    for(int i=0;i<len;i++)
    {
        if(time<deadline[i])
        {
            time++;
            System.out.print(jobid[i]+" ");
        }
    }
  }


public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total no of jobs");
    int count=sc.nextInt();
    char[] jobid=new char[count];
    int[] deadline=new int[count];
    int[] profit=new int[count];
    System.out.println("Enter jobid,deadline,profit");
    for(int i=0;i<count;i++)
    {
      jobid[i]=sc.next().charAt(0);
      deadline[i]=sc.nextInt();
      profit[i]=sc.nextInt();
    }
    jobsequencing jb=new jobsequencing();

    jb.sequence(jobid,deadline,profit);
}
}

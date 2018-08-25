import java.util.Scanner;


public class fknapsack{

	int byprofit(int[] profit,int [] weight,int max)
	{
		int len=profit.length;
		//boolean[] flag=new boolean[len];

		int swap;
		int reward=0;	
		for(int i=0;i<len;i++)
			for(int j=i;j<len;j++)
			{	if(profit[i]<profit[j])
				{
					swap=profit[i];
					profit[i]=profit[j];
					profit[j]=swap;

					swap=weight[i];
					weight[i]=weight[j];
					weight[j]=swap;
				}
				if((profit[i]==profit[j])&&(weight[i]>weight[j]))
				{
					swap=weight[i];
					weight[i]=weight[j];
					weight[j]=swap;
				}
			}
		for(int i=0;i<len;i++)
		{
			if(weight[i]<max)
			{
				reward+=profit[i];
				max-=weight[i];
			}
			else
			{
				reward+=(max*(profit[i]/weight[i]));
				break;
			}
		}

	return reward;	 
	}

	int profitbyweight(int[] profit,int [] weight,int max)
	{
		int len=profit.length;
		int[] pbywt=new int[len];
		int swap;
		int reward=0;	
		for(int i=0;i<len;i++)
		{	
			pbywt[i]=profit[i]/weight[i];
			for(int j=i;j<len;j++)
			{
				//pbywt[i]=profit[i]/weight[i];
				pbywt[j]=profit[j]/weight[j];
				if(pbywt[i]<pbywt[j])
				{
					swap=profit[i];
					profit[i]=profit[j];
					profit[j]=swap;

					swap=weight[i];
					weight[i]=weight[j];
					weight[j]=swap;
				
					swap=pbywt[i];
					pbywt[i]=pbywt[j];
					pbywt[j]=swap;
			
				
				}
				
			}
		}	
		for(int i=0;i<len;i++)
		{
			if(weight[i]<max)
			{
				reward+=profit[i];
				max-=weight[i];
			}
			else
			{
				reward+=(max*pbywt[i]);
				break;
			}
		}

	return reward;	 
	}	
	
public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total no of elements");
	int num=sc.nextInt();
	int[] profit=new int[num];
	int[] weight=new int[num];
	System.out.println("Now enter the profit and respective weight");
	for(int i=0;i<num;i++)
	{
		profit[i]=sc.nextInt();
		weight[i]=sc.nextInt();
	}
	System.out.println("Enter the maximum size");
	int max=sc.nextInt();
	fknapsack fk=new fknapsack();
	int maxprofit=fk.byprofit(profit,weight,max);
	int bestratio=fk.profitbyweight(profit,weight,max);
	System.out.println("Reward by profit : "+maxprofit);
	System.out.println("Reward by profit/weight : "+bestratio);

	
}}

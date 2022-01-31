package unit5;

import java.util.Scanner;

public class Part5 
{
	public static int findInt(int[] arr,int search) 
	{
		for (int i=0;i<arr.length;i++)
		{
			if(search==arr[i])
				return i;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String prompt;
		int[] nums=new int[0];
		int num;
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		
		do
		{
		System.out.print("Please enter the number of integers you would like to enter: ");
		num=input.nextInt();
		if(num<3)
			System.out.println("Please enter a number that is 3 or larger");
		else
			nums=new int[num];
		}
		while(num<3);
		for(int i=0;i<num;i++)
		{
			System.out.print("Please enter integer "+(i+1)+": ");
			nums[i]=input.nextInt();
			
		}
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
			{
				secondMax=max;
				max=nums[i];
				
			}	
			else if(nums[i]>secondMax)
			{
				thirdMax=secondMax;
				secondMax=nums[i];
			}
			else if(nums[i]>thirdMax)
			{
				thirdMax=nums[i];
			}
		}
		System.out.println("The largest number entered was "+max+" at index "+findInt(nums,max));
		System.out.println("The second largest number entered was "+secondMax+" at index "+findInt(nums,secondMax));
		System.out.println("The third largest number entered was "+thirdMax+" at index "+findInt(nums,thirdMax));

	}

}

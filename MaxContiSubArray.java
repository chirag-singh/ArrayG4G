/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	static int findma(int arr[]){
		
		int ma=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>ma){
				ma=arr[i];
			}
		}
		
		return ma;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		System.out.println("Enter the Size of the Array");
		
		Scanner sc=new Scanner(System.in);
		
		int si=sc.nextInt();
		
		int arr[]=new int[si];
		
			System.out.println("Enter the Elements of Array");
			
			int xo=0;
		
		for(int i=0;i<si;i++){
			arr[i]=sc.nextInt();
		//	xo^=arr[i];
		}
		
		int maxsum=arr[0];
		//int maxi=0;
	//	int maxj=0;
		
		int sum=arr[0];
	//	int i=0;
	//	int j=0;
		
		for(int k=1;k<si;k++){
			
			if(sum>maxsum){
				maxsum=sum;
			}
			if(sum<=0){
				sum=0;
			}
			
			sum+=arr[k];
			
		}
		
		if(sum>maxsum){
				maxsum=sum;
			}
		if(sum<=0){
				sum=0;
			}
			
		if(maxsum<=0){
			//none is positive
			maxsum=findma(arr);
		}
		
		System.out.println("The Largest Sum Contiguos array is "+maxsum);
		
	
		

	}
}

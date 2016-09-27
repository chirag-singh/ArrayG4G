/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void quick(int arr[],int hi,int lo){
		
		if(hi<=lo){
			return;
		}
		
		int piv=getpi(arr,hi,lo);
		
		quick(arr,piv-1,lo);
		quick(arr,hi,piv+1);
		
	}
	
	
	static void swap(int arr[],int lo,int hi){
		int temp=arr[lo];
		arr[lo]=arr[hi];
		arr[hi]=temp;
	}
	
	
	static int getpi(int arr[],int hi,int lo){
		
		int las=hi;
		
		hi--;
		
		while(hi>lo){
			if(arr[lo]>arr[las]){
				swap(arr,lo,hi);
				hi--;
			}
			else{
				lo++;
			}
		}
		
		if(arr[hi]>arr[las]){
			swap(arr,hi,las);
			return hi;
		}
		else{
			swap(arr,hi+1,las);
			return hi+1;
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int arr[]={9,12,3,24,5,76,8};
		
		quick(arr,arr.length-1,0);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"   ");
		}
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int lo=0;
		int hi=arr.length-1;
		
		while(hi>lo){
			if(sum==(arr[hi]+arr[lo])){
				System.out.println(arr[hi]+" + "+arr[lo]+" = "+sum);
				break;
			}
			else if(sum<(arr[hi]+arr[lo])){
				hi--;
			}
			else{
				lo++;
			}
		}
		
		if(hi==lo){
			System.out.println("Hey its not possible ");
		}
		
		
	}


}


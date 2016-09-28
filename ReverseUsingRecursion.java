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
	
	static int max(int a,int b){
		return a>b?a:b;
	}
	
	static int min(int a,int b){
		return a<b?a:b;
	}
	
	static int findpivot(int arr[],int lo,int hi){
		
		if(hi<lo){
			return -1;
		}
		
		int mid=(lo+hi)/2;
		
		if(mid<hi&&arr[mid]>arr[mid+1]){
			return mid;
		}
		
		if(mid>lo&&arr[mid]<arr[mid-1]){
			return mid-1;
		}
		
		if(arr[lo]>arr[mid]){
			return findpivot(arr,lo,mid-1);
		}
		else{
			return findpivot(arr,mid+1,hi);
		}
		
		
	}
	
	static int binsearch(int arr[],int lo,int hi,int k){
		
		if(hi<lo){
			return -1;
		}
		
		int mid=(hi+lo)/2;
		
		if(arr[mid]==k){
			return mid;
		}
		else if(arr[mid]>k){
		return 	binsearch(arr,lo,mid-1,k);
		}
		else{
		return	binsearch(arr,mid+1,hi,k);
		}
		
	}
	
	static void reverse(int arr[],int lo,int hi){
		
		if(hi<=lo){
			return ;
		}
		
		int temp=arr[lo];
		arr[lo]=arr[hi];
		arr[hi]=temp;
		
		reverse(arr,lo+1,hi-1);
		
	}
	
	static void printarr(int arr[]){
		
		int si=arr.length;
		System.out.println();
		for(int i=0;i<si;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		System.out.println("Enter the Size of the Array");
		
		Scanner sc=new Scanner(System.in);
		
		int si=sc.nextInt();
		
		int arr[]=new int[si];
		
			System.out.println("Enter the Elements of Array");
			
		//	int xo=0;
		
		for(int i=0;i<si;i++){
			arr[i]=sc.nextInt();
		//	xo^=arr[i];
		//	xo^=(i+1);
		}
		
		//reverse the array using recursiuon
		
		printarr(arr);
		
		reverse(arr,0,arr.length-1);
		
		printarr(arr);
		
	
		

	}
}

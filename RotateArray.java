import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	

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
		System.out.println("Enter the elements to be rotated by");
		//rotate the array by 2
		int k=sc.nextInt();
		
		printarr(arr);
		
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		printarr(arr);
		
	
		

	}
}

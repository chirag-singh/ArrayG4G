import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
     static int maxsum=Integer.MIN_VALUE;
	
	static void findmaxsum(int arr[],int n,int sum){
		
		if(n>=arr.length){
			if(sum>maxsum){
				maxsum=sum;
			}
		
			return;
		}
		
		findmaxsum(arr,n+2,sum+arr[n]);
		
		findmaxsum(arr,n+3,sum+arr[n]);
		
		
		
		
	}
	
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test-->0){
		int si=sc.nextInt();
		
		int arr[]=new int[si];
		
		//	System.out.println("Enter the Elements of Array");
			
		//	int xo=0;
		
		for(int i=0;i<si;i++){
			arr[i]=sc.nextInt();
		//	xo^=arr[i];
		//	xo^=(i+1);
		}
		
	    //dp
	    
	    int t[]=new int[si];
	    
	    t[0]=arr[0];
	    if(si>1)
	    t[1]=Math.max(arr[0],arr[1]);
	    
	    for(int i=2;i<si;i++){
	        
	        t[i]=Math.max(t[i-2]+arr[i],t[i-1]);
	        
	    }
		
		System.out.println(t[si-1]);
		
	}
	
	}
}

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
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
			xo^=arr[i];
		}
		
	//one which occurs odd number of times will be only one left after XORing all
	
		System.out.println("The odd times occuring element is "+xo);
		
	
		

	}
}

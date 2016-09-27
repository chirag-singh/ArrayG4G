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
		
		for(int i=0;i<si;i++){
			arr[i]=sc.nextInt();
		}
		
		int co=1;
		int it=arr[0];
		
		for(int i=1;i<si;i++){
			if(arr[i]==it){
				co++;
			}
			else{
				co--;
				if(co==0){
					it=arr[i];
					co=1;
				}
			}
		}
	
		System.out.println("The Majority Element is "+it);
		

	}
}

package ejagruti.pfl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DemoClass {
	
	
	
	
	
	
	public static void main(String[] agrs) {
	
	
	/*{
		int i;
		int total=0;
		for(i=1;i<=100;i++) {
			total=total+i;
			
		}
		System.out.println(total);
	}*/
	
	
	
/*	for(int i=1;i<=4;i++) 
	{
	for(int j=1;j<=i;j++) 
	{
		System.out.print("*");
	}
	System.out.println();
    }
    
for(int i=1;i<=4;i++) {
	for(int j=3;j>=i;j--) {
		System.out.print("*");
	}
	System.out.println();
}  */
		
		
	/*	for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int R=1;R<=i;R++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
	/*	for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
	/*	for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
		for(int k=1;k<=i;k++) 
		{
			System.out.print(" *");
		}
		
		System.out.println(" ");
	} */
		
	/*	for (int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--)
			{
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print(" *");
				}
				
			}
			System.out.println();
		}*/
	
		
	/*	for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		} */
		
	/*	for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=3;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
	 /*	for(int i=1;i>=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i>=2 && j<=i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}  */
		
		
	/*	for(int i=0;i<=5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i+j==5-1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
		*/
		
	/*	for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>=2 && j>=2 && i<=3 && j<=3 ) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
		}
			System.out.println();
		} */
		
		
		//Number pattern
		
		
	/*	for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}  */
		
	/*	int count =0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				count=count+1;
				System.out.print(count);
			
		}
			System.out.println();
			
			}*/
		
	/*	for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			*/
		
		
	/*	for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}  */
		
		
	/*	//Reverse string
		
		String str="ABCD";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
			System.out.println(rev);
		
		
		//Using string buffer class
		 * 
			String st="GHJS";
			String re="";
			StringBuffer sb=new StringBuffer(st);
			System.out.println(sb.reverse());
		*/
		
		
		//String is palindrome string
		
		
	/*	String st="MADAM";
		String re="";
		String org_str=st;
		int len=st.length();
		for(int i=len-1;i>=0;i--) {
			re=re+st.charAt(i);
		}
		if(org_str.equals(re)) {
			System.out.println("string is palindrome string");
		}
		else {
			System.out.println("string is not palindrome string");
		}*/
		
	/*	int num=1234;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("number of even number:"+even_count);
		System.out.println("number of odd number:"+odd_count);
		
		*/
		
		//sum of digits
		
	/*	int num=1234;
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num/=10;
			
		}
		
		System.out.println(sum);
		 */
		
		//fibonacci series
	/*	int n1=0; int n2=1; int sum=0;
		
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		*/
		
		//Sum of array
	/*	int a[]= {5,5,5,5};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		} 
		
		//enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}
		
		System.out.println("Sum of array elements is:" +sum);
		
		*/
		
		//Even and Odd from array
	/*	int a[]= {4,5,7,8,9,30};
		System.out.println("Even numbers");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
				}
		
		System.out.println("Odd numbers");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}  */
		
		
		//Even and Odd number from array by using Enhanced for loop
	/*	int a[]= {1,2,3,4,5,6,7,8};
		System.out.println("Even numbers");
		for(int value:a) {
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd numbers");
		
		for(int value:a) {
			if(value%2!=0)
				System.out.println(value);
		}
		*/
		//Check Arrays are equal
	/*	int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,6};
		 boolean status=Arrays.equals(a1, a2);
		 if(status==true) {
			 System.out.println("arrays are equal");
		 }
		
		 else {
			 System.out.println("arrays are not equal");
		 }
		 */
		
		//Missing number in array
	/*	int a[]= {1,2,4,5,};
		int sum1=0;
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array:"+sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
			
		}
		System.out.println("Sum of range of elements:"+sum2);
		
		System.out.println("missing number in array:"+(sum2-sum1));
		
	*/
		
		//Max elements in array
		
	/*	int a[]= {10,20,100,40,50};
		int max=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if (a[i]>max) 
			{
				max=a[i];
			}
			
		}
		System.out.println("max element in array is:"+max);  */
	
		//Min element in array
	/*	int a[]= {10,20,5,40,50};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("minimun elements in array is:"+min);
		*/
		
		//duplicate values in array
	/*	String arr[]= {"C++","java","C","python","java"};
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("duplicate element:"+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) 
		{
			System.out.println("duplicate value is not found");
		}
		
		*/
		
		
		
		
		
		
		
}
}

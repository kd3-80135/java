package com.sunbeam.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("BOB");

		StringBuffer str2 = str.reverse();
		
		if(str2 == str)
		{
			System.out.println("It is a Pallindrome!!!");
		}
		else
		{
			System.out.println("Not a Pallindrome!!!");
		}
	}

}




//package com.sunbeam.string;
//
//import java.util.Scanner;
//
//public class DuplicateArray {
//
//	public static void main(String[] args) {
//		String arr[]= {"Saurabh","sandesh","karad","Sunbeam"};
//		String arr1[]={"Sunbeam","sandesh","karad","Saurabh"};
//		
//
//
//	for(int j=0;j<3;j++)
//	{
//		for(int k=0;k<3;k++)
//		{
//			if(arr[j].equals(arr1[k]))
//			{
//				System.out.println("Duplicate String found = " +arr[k]);
//			}
//		}
//	}
// }
//}


//
//package com.sunbeam.reverse;
//
//public class ReverseString {
//
//	public static void main(String[] args) {
//		String s="SAURABH";
//		String rs="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//		rs=rs+s.charAt(i);
//		}
//		System.out.println("Original String is "+s);
//		System.out.println("Reverse String is "+rs);
//		}
//
//
//	}



package com.test.java;
import java.util.Arrays;
import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any string:");
		String st=scan.nextLine();
		String starray[]=st.split(" ");
		char charray[];
		for(int i=0;i<starray.length;i++)
		{
			String word=starray[i];
			 
			charray=word.toCharArray();
			Arrays.sort(charray);
			starray[i]=String.valueOf(charray);
			
		}
		
		
		Arrays.sort(starray);
		
		for(int i=0;i<starray.length;i++)
		{
			System.out.print(starray[i]+" ");
		}
	}													

}

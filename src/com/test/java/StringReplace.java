package com.test.java;

public class StringReplace {

	

		public static void main(String[] args) {
			 String str = new String("Welcome to java ");
			 String str1 = "";
			 
			 for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				 str1+= ",";
			 }
			str1+=str.charAt(i);
	       
		}
			 str = str1;
			 System.out.println(str);

	}

	}



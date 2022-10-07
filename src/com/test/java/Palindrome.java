package com.test.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome{

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string :");
        String st=br.readLine();
        String reverse="";
        st=st.toLowerCase();  // Madam
        
        for(int i=st.length()-1;i>=0;i--)
        {
            reverse+=st.charAt(i);
        }
        
        
        if(st.equals(reverse))//Madam == madaM
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Non palindrome string");
        }


    }
}
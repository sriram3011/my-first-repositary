package com.test.java;


public class StringBuilderExample {

    public static void main(String[] args) {
        
        StringBuilder st=new StringBuilder();
        StringBuilder st1=new StringBuilder("This is StringBuilder Object ");
        String s="Welcome to STring";
        StringBuilder st2=new StringBuilder(s);
        StringBuilder st3=new StringBuilder(20);
        
        st.append("This is append method");
        st.append(st1);
        System.out.println(st);
        System.out.println(st.length());
        
        
        
    }

}
package com.test.java;


public class StringBufferExample {

    public static void main(String...args )
    {
        StringBuffer st=new StringBuffer("Java Programming");
        StringBuffer st1=new StringBuffer();//new capacity=oldcapacity*2+2;
        //System.out.println(st1.capacity());
        st1=st1.append("Java Programming in 2022");
        //System.out.println(st1.capacity());
        
        st1.ensureCapacity(100);
        System.out.println(st1.capacity());
        st.append(" in 2022");
        
        
        //System.out.println(st.capacity());
        //System.out.println(st.length());
        st.setLength(30);
        System.out.println(st);
        //System.out.println(st.capacity());   //0 -9 (48-57)
        st.append("sa");
        System.out.println(st.charAt(0));
        
        StringBuffer x=new StringBuffer("Bat");
        StringBuffer y=new StringBuffer("Ball");
       
        System.out.println(x.indexOf("at"));
        x.insert(3, " & Ball");
        x.insert(10, " ");
        x.insert(11, true);
        System.out.println(x);
        
        
    }
}

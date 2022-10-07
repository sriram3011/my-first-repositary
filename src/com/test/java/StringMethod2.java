package com.test.java;


public class StringMethod2 {

    int a=50;
    String s="Hello World";
    
    
    
    @Override
    public String toString() {
        return "a=" + a + ", s=" + s ;
    }



    public static void main(String[] args) {
        
        
        System.out.println(new StringMethod2().toString());
        //toString() method
        Integer v=90;
        int l=90;
        //Wrapper class
        String x=Integer.toString(v);
        System.out.println(x);
        
        Float f=56.89f;
        float g=3453;
        String y=Float.toString(g);
        System.out.println(y);
        
        int c=89;
        Integer d=Integer.valueOf(c);
        int p=(int)d;
        System.out.println(p);
        
        
        int k=78;
        String i=String.valueOf(k);
        
        if(c==d)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("not ok");
        }
                
        String s="34";
        Integer d1=Integer.valueOf(s);
        
        
    }

}
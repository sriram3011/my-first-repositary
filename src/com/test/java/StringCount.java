package com.test.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCount {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //welcome to Java 
        System.out.println("Please enter a string:");
        String st=br.readLine();
        String st1=st+" ";
        String a="",v="",c="",d="",s="";
        int words=0,alpha=0,vowels=0,consonants=0,digit=0,special=0;
        
        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)==' ')
            {
                words=words+1;
            }
            
            else if((st1.charAt(i)>='a' && st1.charAt(i)<='z') || (st1.charAt(i)>='A' && st1.charAt(i)<='Z'))
            {
                a=a+st1.charAt(i)+",";
                alpha=alpha+1;
                if(st1.charAt(i)=='a'
                        ||st1.charAt(i)=='A'
                        ||st1.charAt(i)=='e'
                        ||st1.charAt(i)=='E'
                        ||st1.charAt(i)=='i'
                        ||st1.charAt(i)=='I'
                        ||st1.charAt(i)=='o'
                        ||st1.charAt(i)=='O'
                        ||st1.charAt(i)=='u'
                        ||st1.charAt(i)=='U'
                        )
                    
                {
                    vowels=vowels+1;
                    v=v+st1.charAt(i)+",";
                    
                    
                }
                else
                {
                    consonants=consonants+1;
                    c=c+st1.charAt(i)+",";
                }
            }
            
            else if(st1.charAt(i)>='0' && st1.charAt(i)<='9')

            {
                d=d+st1.charAt(i)+",";
                digit=digit+1;
            }
            else
            {
                s=s+st1.charAt(i)+",";
                special=special+1;
            }
                
        }
        
        System.out.println("Words:"+words);
        System.out.println("Alphabets:"+alpha+" "+a);
        System.out.println("Vowels:"+vowels+" "+v);
        System.out.println("consonants:"+" "+c);
        System.out.println("Digits:"+digit+" "+d);
        System.out.println("Special Characters:"+special+" "+s);

    }

}

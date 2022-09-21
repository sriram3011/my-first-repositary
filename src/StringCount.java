
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
        int words=0,alpha=0,vowels=0,consonants=0;
        
        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)==' ')
            {
                words=words+1;
            }
            
            if((st1.charAt(i)>='a' && st1.charAt(i)<='z') || (st1.charAt(i)>='A' && st1.charAt(i)<='Z'))
            {
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
                }
                else
                {
                    consonants=consonants+1;
                }
            }
                
        }
        
        System.out.println("Words:"+words);
        System.out.println("Alphabets:"+alpha);
        System.out.println("Vowels:"+vowels);
        System.out.println("consonants:"+consonants);
        

    }

}
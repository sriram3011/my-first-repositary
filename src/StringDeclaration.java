
public class StringDeclaration {

	public static void main(String[] args) {
		
		String st=new String("Java programming");//heap memory
		String st4=new String("Java programming");
		String st1="Java programming"; //string constant pool
		String st3="Java programming";
		
		System.out.println(st==st4);//false
		System.out.println(st1==st3);//false
		
		System.out.println(st.equals(st3));
		System.out.println(st==st4);
		


	}

}

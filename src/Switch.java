
public class Switch {

	public static void main(String[] args) {
        String st="x";
        
        switch(st)
        {
        case "x":System.out.println("Welcome to Java"); //multiple values per case
              break;
              
        case "b":System.out.println("Welcome to Python");
              break;
          
        case "c":System.out.println("Welcome to C++");
              break;
          
        case "d":System.out.println("Welcome to Java");
              break;
              
         default:System.out.println("Wrong input!!");                 
        }

	}

}

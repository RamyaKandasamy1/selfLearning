package selfLearning;
import java.util.*;


public class UserInput1 {
	public static void main(String[] args) {
		
		Scanner input1= new Scanner(System.in);
		System.out.println("Enter your name :");
	    String name=input1.nextLine(); 
	  
	    System.out.println("Enter your age");
	    int age=input1.nextInt();
	    input1.nextLine();
	   
	    
	    //
	    System.out.println("Enter your favourite color");
	    String color=input1.nextLine();// will not take user input and goes to next line 
	    /* make sure to add nextline comment after getting age
	     * Refer step input1.nextLine() in the above 
	     * statement
	     */
	   
	    
	    
	    System.out.println("Your Name is"+name);
	    System.out.println("You are "+age+" years old");
	    System.out.println("Your Favourite color is"+color);
		input1.close();
		
		
	}

}

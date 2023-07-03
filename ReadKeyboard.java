//Default package
import java.lang.*;
//To use Scanner
import java.util.*;

public class ReadKeyboard
{
	// method //args can be anything
	public static void main(String args[])
	{
		String name;
		//For reading from a keyboard we need a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("May I know your Name? ");
		//To read user input // nextLine reads multiple words
		name = sc.nextLine();

		System.out.println("Welcome " + name);
	}



}
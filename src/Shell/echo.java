package Shell;

import java.util.Scanner;

public class echo {
	public static void echo()
	{
		String inData;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter the data:");
	    inData = scan.nextLine();

	    System.out.println("You entered:" + inData );
	}

}

package Shell;

import java.io.File;
import java.util.Scanner;

public class mkdir {

	public static void mkdir()
	{
		
		String inData;
	    Scanner scan = new Scanner( System.in );

	    System.out.println("Enter the Directory name:");
	    inData = scan.nextLine();
		  File f = null;
	      boolean bool = false;
	      
	      try{      
	         // returns pathnames for files and directory
	         f = new File("C:"+inData);
	         
	         // create
	         bool = f.mkdir();
	         
	         // print
	         System.out.println("Directory " + inData+ " created!");
	         
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	}
	
}

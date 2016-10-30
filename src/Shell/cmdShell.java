package Shell;



import java.io.*;
import java.util.*;

public class cmdShell

{
	private static Commands prompt;

 public static void main(String[] args) throws java.io.IOException, InterruptedException {

  String commandLine;
  prompt =new Commands();

  BufferedReader console = new BufferedReader

    (new InputStreamReader(System.in));
try{
while (true) {

  // read what the user entered
  System.out.print("BadiiShell>");
 // System.out.println();

  commandLine = console.readLine(); 

  /** if the user entered a return, just loop again**/
	  	switch(commandLine){
	  	
	  		case "" :
	  			continue;
	

	  		case "exit":
	  			
	  	System.out.println("Goodbye");

	  	System.exit(0);
	  			break;
	  			
	  		case "cal":   //IO Error
	  			cal.cal();
	  		
	  		break;
	  		
	  		
	  		
	  		case "echo":
		  		echo.echo();
		  		break;
	  		case "pwd":
		  		pwd.pwd();
		  		break;
		  		
	  		case "wc":
		  		wc.wc();
		  		break;
		  		
				
	  		case "mkdir":
		  		mkdir.mkdir();
		  		break;
	  		
		  		
	  		case "ls":
		  		ls.ls();
		  		break;
		  		
	  		case "dir":
		  		ls.ls();
		  		break;
		  		
	  		case "grep":
		  		grep.grep(args);
		  		break;
		  		
	  		case "cp":
		  		cp.cp(args);
		  		break;


}
	  
	  
  // Split the string into a String Array

   

  ArrayList<String> parms = new ArrayList<String>();

  String[] lineSplit = commandLine.split(" ");

  int size = lineSplit.length;

  for (int i=0; i<size; i++)  {

  parms.add(lineSplit[i]);

  //System.out.println(lineSplit[i]);  // testing, wanted to make sure its working

    }

 

  ProcessBuilder pb = new ProcessBuilder(parms);

  Process proc = pb.start();


   // obtain the input stream

   InputStream is = proc.getInputStream();

   InputStreamReader isr = new InputStreamReader(is);

   BufferedReader br = new BufferedReader(isr);

   // read what is returned by the command

   String line;

   while ( (line = br.readLine()) != null)
    System.out.println(line);
   br.close();
 

    }

   
}

catch(IOException e)
{
	System.out.println("simpleshell-30% done");
	
	//hide error
}
  }

 }
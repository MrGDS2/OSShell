package Shell;

import java.util.Calendar;

public class Commands {
//
	public void Call(String cmd)
	{
	switch(cmd.toLowerCase())
	{
	case "cal":
		date();
		break;
		
	case "wc":
		
	/**	String[] wcCommand = new String[]{"/usr/bin/wc","-l" , filePath};
		Process wcProcess=Runtime.getRuntime().exec(wcCommand);
		wcProcess.waitFor();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( wcProcess.getInputStream()));
		String numberOfRowsline;
		while((numberOfRowsline = bufferedReader.readLine()) != null) {
		      System.out.print(numberOfRowsline);
		}
		**/
		break;
	
	
	}
	
	
	
	
	
	}
	public int date()
	{
		int month= Calendar.getInstance().get(Calendar.MONTH);
		
		return month;
		
		//get month translator
	}
	
}

package Shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wc {

	public static void wc() throws InterruptedException, IOException
	{
		String[] wcCommand = new String[]{"/usr/bin/wc","-l" , System.getProperty("user.dir")};
		Process wcProcess=Runtime.getRuntime().exec(wcCommand);
		wcProcess.waitFor();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( wcProcess.getInputStream()));
		String numberOfRowsline;
		while((numberOfRowsline = bufferedReader.readLine()) != null) {
		      System.out.print(numberOfRowsline);
		}
		
		
	}
	
	
}

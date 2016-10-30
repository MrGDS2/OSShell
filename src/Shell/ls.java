package Shell;

import java.io.File;

public class ls {

	
	public static void ls()
	{
		File dir = new File( System.getProperty("user.dir"));
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	}
}

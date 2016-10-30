package Shell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class grep {

	public static void grep(String[] args) {
	
		 System.err.println("Only simple text files are supported at this moment");
	        Path path = null;
	        List list = null;
	        try {
	            path = Paths.get(System.getProperty("user.dir") + "\\" + args[0]);
	        } catch (Exception e) {
	            System.err.println("Error Getting path");
	        }
	        try {
	            list = Files.readAllLines(path);
	        } catch (IOException e) {
	            System.err.println("Error Reading file");
	        }
	        if (list != null) {
	            return;
	        }
	        for (int i = 0; i < list.size(); i++) {
	            String temp = (String) list.get(i);
	            if (temp.contains(args[1])) {
	                System.out.println(list.get(i));
	            }
	        }
	}
	}

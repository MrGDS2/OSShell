package Shell;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
public class cp {
	 public static void cp(String[] args) {
	        FileChannel dest;
	        try {
	            FileChannel src = new FileInputStream(new File(args[0])).getChannel();
	            dest = new FileOutputStream(new File(args[1])).getChannel();
	            dest.transferFrom(src, 0, src.size());
	            System.out.println("File copying completeted");
	        } catch (FileNotFoundException ex) {
	            System.err.println("Error reading files");
	        } catch (IOException ex) {
	            System.err.println("Error outputing file");
	        }

	    }
}

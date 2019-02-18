package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TextfileCopy1 
{
	 public static void main(String[] args) {
	      FileInputStream in = null;
	      FileOutputStream out = null;
	      try {
	         File infile = new File("C:\\Users\\Shiva Chaudhary\\Desktop\\File Handling\\test file.txt");
	         File outfile = new File("C:\\Users\\Shiva Chaudhary\\Desktop\\File Handling\\Copy Data text file.txt");
	         in = new FileInputStream(infile);
	         out = new FileOutputStream(outfile);
	         byte[] buffer = new byte[1024];
	         int length;
	         while ((length = in.read(buffer)) > 0) 
	         {
	            out.write(buffer, 0, length);
	         } 
	         in.close();
	         out.close();
	         System.out.println("File copied successfully!!");
	      } 
	      catch(IOException ioe) 
	      {
	         ioe.printStackTrace();
	      } 
	   }
}

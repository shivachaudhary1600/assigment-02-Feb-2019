package pkg1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextfileCopy 
{
	public static void main(String[] args)
	{
		try {
			FileReader fr = new FileReader("C:\\Users\\Shiva Chaudhary\\Desktop\\File Handling\\test file.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\Shiva Chaudhary\\Desktop\\File Handling\\Copy Data text file.txt", true);
			String s;
			while ((s = br.readLine()) != null) 
			{ 
				fw.write(s); 
				fw.flush();
			}
			br.close();
			fw.close();
           System.out.println("File copied successfully!!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

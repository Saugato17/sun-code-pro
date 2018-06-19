import java.io.*;

public class ReadFile
{
	FileReader fr;
	BufferedReader br;

	ReadFile(String fpath)
	{
		try{	
		fr=new FileReader (new File(fpath));
		br=new BufferedReader(fr);
		}
		catch(FileNotFoundException fnf){
			System.out.println("Target file not found.");
		}
	}

	void readFile()
	{
		String tempString;
		try
		{
			while ((tempString=br.readLine())!=null)
			{
				System.out.println(tempString);
			}
		}
		catch(IOException io){
			System.out.println("Error while reading the file.");
		}
	}

	public static void main(String[] args)
	{
		ReadFile r=new ReadFile("testfile.txt");
		r.readFile();
	}
}
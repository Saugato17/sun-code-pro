import java.io.*;

public class WriteFile
{
	FileWriter fr;
	BufferedWriter br;

	WriteFile(String fpath)
	{
		try{	
		fr=new FileWriter (new File(fpath), false); //filepath, whether append mode (if true, existing contents remains else gets replaced) -> true, false
		br=new BufferedWriter(fr);
		}
		catch(FileNotFoundException fnf) {
			System.out.println("Target file not found.");
		}
		catch(IOException ie) {
			System.out.println("Error while opening the file");
		}
	}

	void writeFile()
	{
		String tempString="This is an added content from java file.";
		try
		{
			br.write(tempString);
			br.close();
		}
		catch(IOException io){
			System.out.println("Error while writing the file.");
		}
	}

	public static void main(String[] args)
	{
		WriteFile r=new WriteFile ("testfile.txt");
		r.writeFile();
	}
}
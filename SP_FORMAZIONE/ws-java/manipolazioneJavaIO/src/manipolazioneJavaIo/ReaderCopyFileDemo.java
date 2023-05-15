package manipolazioneJavaIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReaderCopyFileDemo {
	
	private File inputFile;
	private File outputFile;
	
	public ReaderCopyFileDemo(File inputFile, File outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}
	
	public String copyFile() {
		String s= "";
		String bufferString = "";
		
		try {
			FileReader fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);
			
			while((s=br.readLine())!=null) {
				bufferString += (String)s+"\n";
			}
			br.close();
			
			PrintWriter pw = new PrintWriter(outputFile);
			pw.append(bufferString);
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bufferString;
	}
	
	public String metodiFile() {
		String inFile = inputFile.getAbsolutePath() + " " + inputFile.getName()+" Lunghezza: " +inputFile.length();
		String outFile = outputFile.getAbsolutePath() + " " + outputFile.getName()+" Lunghezza: " +outputFile.length();
		return inFile+ "\n" + outFile;
	}
	

}

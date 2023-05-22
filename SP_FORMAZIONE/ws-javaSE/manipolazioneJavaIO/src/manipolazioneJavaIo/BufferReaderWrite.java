package manipolazioneJavaIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferReaderWrite {
	final static int EOF =-1;
	BufferedReader br;
	FileWriter fw;
	BufferedWriter bw;
	String input;
	
	public String bufferWrite() {
		br= new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while (!line.equals("BOM")) {
			try {
				line = br.readLine();
				if(line.equalsIgnoreCase("bom")) {
					break;
				}if(line.isEmpty()) {
					continue;
				}
				fw = new FileWriter(new File("dataBuffer.txt"));
				bw = new BufferedWriter(fw);
				fw.write(line);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("bom digitato - fine elaborazione");
		
		//chiudo il buffer e il writer
		try {
			fw.flush();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		}
		
		return line;
	}
	
	
	
	
	

}

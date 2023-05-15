package manipolazioneJavaIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderFileDemo {
	
	static final int EOF= -1;
	static final char CR= '\r';//char di ritorno
	static final char LF= '\n';//end line
	
	public String readFileChar() {
		int c= 0;
		String bufferString = "";
		File path = new File("data.txt");
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			while((c=br.read()) != EOF) {
				if (c==CR) {
					continue;
				}
				if (c==LF) {
					continue;
				}
				bufferString += (char)c;
			}
			br.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(bufferString);
		return bufferString;
	}
	
	public String readFileRow() {
		String s= "";
		String bufferString = "";
		File path = new File("data.txt");
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			while((s=br.readLine())!=null) {
				bufferString += (String)s;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(bufferString);
		return bufferString;
	}

}

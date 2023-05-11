package manipolazioneJavaIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainDemo {
	
	public static void main(String[] args) {
		MainDemo mJIO = new MainDemo();
		mJIO.run();
	}
	
	private void run() {
		/*
		ReaderFileDemo rd = new ReaderFileDemo();
		rd.readFileChar();
		rd.readFileRow();
		
		ReaderCopyFileDemo rcf = new ReaderCopyFileDemo(new File("data.txt"),new File("dataOut.txt"));
		
		rcf.copyFile();
		
		System.out.println(rcf.metodiFile());
		
		BufferReaderWrite brw = new BufferReaderWrite();
		brw.bufferWrite();
		 */
		
		FileCreaDataOutputStreamDemo creaData = new FileCreaDataOutputStreamDemo();
		try {
			//creaData.creaOutputStream(new FileOutputStream("fileStrano.txt"));
			creaData.leggiOutputStream(new FileInputStream("fileStrano.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	} 
	
	

}

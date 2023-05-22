package manipolazioneJavaIo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCreaDataOutputStreamDemo {
	
	final static int EOF= -1;
	char c=' ';
	
	public void creaOutputStream(FileOutputStream filePath) {
		char lineSep = System.getProperty("line.separator").charAt(0);
		
		try {
			DataOutputStream dos = new DataOutputStream(filePath);
			
			double[] prices = {19.99,9.99,15.99,3.99,4.99};
			int[] units = {12,8,13,29,50};
			String[] descs = {"T-shirt","mug","duke","pin","key-chain"};
			for (int i = 0; i < prices.length; i++) {
				dos.writeDouble(prices[i]);
				dos.writeInt(units[i]);
				dos.writeChars(descs[i]);
				dos.writeChar('\n');
				dos.writeChar(lineSep);;
			}
			System.out.println("File creato");
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void leggiOutputStream(FileInputStream filePath) {
		char lineSep=System.getProperty("line.separator").charAt(0);
		try {
			
			DataInputStream ind=new DataInputStream(new FileInputStream("fileStrano.txt"));
			double d;
			int i;
			//double total;
			char chr=' ';
			StringBuilder s =new StringBuilder();
			while(true) {
				if(chr==EOF) {
					break;
				}
				d=ind.readDouble();
				i=ind.readInt();
				
				while((chr=ind.readChar())!=lineSep) {
					s.append(chr);
					
				}
				
				System.out.println(d+" "+i+" "+s);
				s =new StringBuilder();
				
				
			}
			//ind.close();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	

}

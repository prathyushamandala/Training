package com.visam.javatraining.FileStreams;

import java.io.FileInputStream;
import java.io. FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

public class FileinputstreamExample {
	public static void main(String args[])  {
		try { 
		FileInputStream fis =new FileInputStream("D:\\Test Java Files\\abc.txt");
		 InputStreamReader isr = new InputStreamReader(fis);
		 
		 
		 //int data = isr.read();
		 int data = 0;
		 while((data =isr.read())!= -1) {
			 char c1 = (char) data;
			 
		 System.out.print(""+c1);	 
	}
		}
		
	/* FileOutputStream fos =new  FileOutputStream ("D:\\Test Java Files\\abc1.txt");
		 SequenceInputStream sis = new SequenceInputStream(fis);

		 data1;
		 while((sis.read())!= -1){
			 fos.write(data1);
			 
		 }
		// System.out.println("printed");
		 
		 
		}*/
		
		catch(Exception e) {
		}
		}
}


package com.visam.javatraining.FileStreams;

import java.io.*;

public class FilterinputstreamExample {
	  
	public static void main(String args[]) throws IOException  {
		FileInputStream fis = new FileInputStream("D:\\Test Java Files\\abc.txt");
		FilterInputStream filter = new BufferedInputStream(fis);
		try {
			
		  int i;
		  while((i=filter.read())!=-1) {
			  char c1= (char) i;
			 // System.out.println(""+c1);
			  
			  i = filter.available();
			
			  System.out.println(c1 +" no:of bytes available:  "  +i);
		  }
		}
		catch(Exception e) {
		}
		 fis.close();
		  filter.close();
	
}
}

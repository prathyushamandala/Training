package com.visam.javatraining.FileStreams;

import java.io.File;
import java.io.IOException;

public class FileCreation  {
	public static void main(String args[])  throws IOException {
	 File file = new File("D:\\Test Java Files\\abc1.txt");
	 if(file.createNewFile()) {
		 System.out.println("file created");
	 }
		 else {
			 System.out.println("file already exits");
		 }
		 
	 }
	
	}


 
	 

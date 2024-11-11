package com.javaclass.files.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteDemo {
	
	public static void main(String args[]) {
		
		try(FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo.txt")) {
			String str1 = "This is a sample code to demonstrate the file output stream\n";
			String str2 = "Learned during the udemy class";
			fos.write(str1.getBytes());
			byte []content = str2.getBytes();
			for(byte b: content) fos.write(b);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	

}

package com.javaclass.files.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteDemo {
	
	public static void main(String args[]) {
		
		// create a file using output stream.
//		try(FileOutputStream fos = new FileOutputStream("D:\\Java\\FileDemo.txt")) {
//			String str1 = "This is a sample code to demonstrate the file output stream\n";
//			String str2 = "Learned during the udemy class";
//			fos.write(str1.getBytes());
//			byte []content = str2.getBytes();
//			for(byte b: content) fos.write(b);
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		
		// Read the file using input stream
//		try(FileInputStream fis = new FileInputStream("D:\\Java\\FileDemo.txt")) {
//			byte b[] = new byte[fis.available()]; // gives no.of bytes available in file
////			b = fis.readAllBytes();
////			for(byte b1: b) System.out.print((char)b1);
//			fis.read(b);
//			String str = new String(b);
//			System.out.println(str);
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
		// Write a File using Writer
		try(FileWriter fw = new FileWriter("D:\\Java\\FileCharDemo.txt")) {
			String str1 = "Now the Reader and writer class uses char array instead of byte\n";
			String str2 = "That's the only difference.";
			fw.write(str1);
			fw.write(str2);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// read file using the reader
		try(FileReader fr = new FileReader("D:\\Java\\FileCharDemo.txt")) {
			int x;
			while((x=fr.read())!=-1) {
				System.out.print((char)x);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	

}

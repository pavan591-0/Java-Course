package com.javaclass.multithreading;

class MyThread extends Thread {
	
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("Hello " + i);
			i++;
		}
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		int i = 0;
		while(i < 10) {
			System.out.println("World " + i);
			i++;
		}
		
		

	}

}

package com.javaclass.multithreading;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("Hello " + i);
			i++;
		}
	}

	public static void main(String[] args) {

		RunnableTest t = new RunnableTest();
		Thread t1 = new Thread(t);
		t1.start();
		int i = 0;
		while(i < 10) {
			System.out.println("World " + i);
			i++;
		}

	}

}

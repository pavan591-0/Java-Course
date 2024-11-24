package com.javaclass.multithreading;

class Count{
	int count1 = 0;
	int count2 = 0;
	public void withoutSync() {
		count1++;
	}
	public synchronized void withSync() {
		count2++;
	}
}
public class Increment {

	public static void main(String[] args) throws InterruptedException {
		
		Count c = new Count();
		Runnable r1 = () -> {
			for(int i=0;i < 10000; i++) c.withoutSync();
		};
		Runnable r2 = () -> {
			for(int i=0;i < 10000; i++) c.withoutSync();
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count1);
		
		// with synchronized method
		
		Runnable r3 = () -> {
			for(int i=0;i < 10000; i++) c.withSync();
		};
		Runnable r4 = () -> {
			for(int i=0;i < 10000; i++) c.withSync();;
		};
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		System.out.println(c.count2);
		
		System.out.println("The first count will rarely becomes 20k but the second one will become 20k");
		
		

	}

}

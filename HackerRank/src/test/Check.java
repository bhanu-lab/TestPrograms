package test;

public class Check {

	public static void main(String[] args){
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		
		t3.setName("Thread1");
		t4.setName("Thread2");
		
		System.out.println("Starting Thread 1....");
		t3.start();
		System.out.println("Starting Thread 2....");
		t4.start();
		
		
	}
}

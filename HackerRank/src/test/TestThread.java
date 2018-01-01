package test;

public class TestThread implements Runnable{
	Object lock = new Object();
	boolean unlocked = false;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("Thread1")){
			synchronized(lock){
				for(int i=1; i<10; i++){
					if(unlocked){
						try {
							System.out.println("Thread 1 waiting ....");
							lock.wait();
							System.out.println("Thread 1 completed waiting");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					//System.out.println("in thread 1");
					printNumber(i);
					//System.out.println("completed printing 1");
					unlocked = true;
					lock.notify();
					System.out.println("Thread1 notifying ....");
				}
			}
			
		}else if(Thread.currentThread().getName().equals("Thread2")){
			synchronized(lock){
				for(int j=9; j>0; j--){
					if(!unlocked){
						try {
							System.out.println("Thread 2 waiting ....");
							lock.wait();
							System.out.println("Thread 2 completed waiting");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					//System.out.println("in thread 2");
					printNumber(j);
					//System.out.println("completed printing 2");
					unlocked = false;
					lock.notify();
					System.out.println("Thread2 notifying ...");
				}
				
			}
			
		}
		
	}
	
	public void printNumber(int a){
			System.out.println(a);
	}

}

package MultiThreading;

public class StateOfThreads extends Thread{
	public static void main(String []args)
	{
   StateOfThreads t=new StateOfThreads()
  {
	   public void run()
	   {
		  
	   	StateOfThreads t1=new StateOfThreads();
	   StateOfThreads t2=new StateOfThreads();
	   t1.setName("t1");
	   t2.setName("t2");
	   	
	   	System.out.println("After creation State of Thread t1 is: "+t1.getState());
	   	System.out.println("After creation state of Thread t2 is: "+t2.getState());
	   	t1.start();
	   	t2.start();
	   	System.out.println("State Of Thread t1 after calling start method: "+t1.getState());
	   	System.out.println("State Of Thread t2 after calling start method: "+t2.getState());
	   	try {
	   		t1.sleep(100);
	   		
	   	} catch (InterruptedException e) {
	   		System.out.println("sleep Exception!");
	   	}
	   	System.out.println("State Of Thread t1 after calling sleep method: "+t1.getState());
	   	try {
	   		t2.join();
	   	}catch(InterruptedException e)
	   	{
	   		System.out.println("Join Exception!");
	   	}
	   	if(!t1.isAlive()) {
	   	System.out.println("State of Thread t2 after join: "+t2.getState());
	   	}
	   	
	   	  Thread.currentThread().yield();
	   	   System.out.println("State of Currently Running Thread :"+Thread.currentThread().getName()+" After Calling yield is :"+Thread.currentThread().getState()); 
	   	   t1.suspend();
	   	 System.out.println("State of Thread t1 after calling suspend: "+t1.getState());  
	   	 t1.resume();
	   	 System.out.println("State of Thread t1 after calling resume on it: "+t1.getState());
	   }

   };
   t.setName("t");
   t.start();
}

}

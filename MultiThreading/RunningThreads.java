package MultiThreading;

public class RunningThreads {

public static void main(String[]args)
{
	Demo t1=new Demo();
	Demo t2=new Demo();
	Demo t3=new Demo();
	Demo t4=new Demo();
	t1.setName("first");
	t2.setName("second");
	t3.setName("Third");
	t4.setName("Fourth");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
class Demo extends Thread{
	public void run()
	{
		System.out.println("Running Thread name is: "+Thread.currentThread().getName());
	}
}

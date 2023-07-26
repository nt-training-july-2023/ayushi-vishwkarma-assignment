package MultiThreading;

class ReadingThreads extends Thread{
	String Ack;
public ReadingThreads(String ack) {
		this.Ack=ack;
	}
public void run()
{
	System.out.println("The name of thread which is reading is " +Thread.currentThread().getName()+" and the acknowledgement : "+Ack);
}
}
public class ReadingThread{
	public static void main(String []args)
	{
		ReadingThreads obj=new ReadingThreads("Hello, this is form first thread object ");
		ReadingThreads obj2=new ReadingThreads("Hello, this is form second thread object ");
		ReadingThreads obj3=new ReadingThreads("Hello, this is form third thread object ");
		ReadingThreads obj4=new ReadingThreads("Hello, this is form fourth thread object ");
		ReadingThreads obj5=new ReadingThreads("Hello, this is form fifth thread object ");
		obj.setName("First Thread");
		obj2.setName("Second Thread");
		obj3.setName("Third Thread");
		obj4.setName("Fourth Thread");
		obj5.setName("Fifth Thread");
		obj.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
	}
}

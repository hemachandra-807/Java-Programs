package Array;

@FunctionalInterface
interface interf{
	void evenOdd(int num);
}
class EvenOdd{
	public void evenOdd(int num) 
	{
		for(int i=0;i<num;i++)
		{
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
				
			}
			if(i % 2 == 0)
			{
				System.out.println("Even: "+i);
			}else {
				System.out.println("Odd :"+i);
			}
		}
	}
}
class MyThread extends Thread{
	EvenOdd e1 = new EvenOdd();
	interf inter1 = e1::evenOdd;
	
	
	int num;
	MyThread(int n)
	{
		this.num=n;
	}
	public void run()
	{
		inter1.evenOdd(num);
	}
}
public class EvenOddUsingThreading {

	public static void main(String[] args) {
		
		MyThread t = new MyThread(10);
		t.start();
	}
}

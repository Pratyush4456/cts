package MyFirstThread;

public class MyMainThread {

	public static void main(String[] args){
	MyThread t1 = new MyThread();
	t1.start();
	System.out.println("main ends ....");
	}

}
class MyThread extends Thread{
	public void run() {
		for(int i =0;i<10;i++)
		{
		    try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Here i am... "+i);
		}
	}
}

package matrix;
import java.util.*;

class EvenNum implements Runnable{
	int a;
	EvenNum(int a){
		this.a = a;
	}
	public void run() {
		System.out.println(a+" is even and its square is: "+a*a);
	}
}

class OddNum implements Runnable{
	int a;
	OddNum(int a){
		this.a = a;
	}
	public void run() {
		System.out.println(a+" is odd and its cube is "+a*a*a);
	}
}

class RandomGen extends Thread{
	public void run() {
		int n=0;
		Random rand = new Random();
		try {
			for(int i=1; i<11; i++) {
				n = rand.nextInt(20);
				if(n%2==0) {
					Thread th1 = new Thread(new EvenNum(n));
					th1.start();
				}
				else {
					Thread th2 = new Thread(new OddNum(n));
					th2.start();
				}
				Thread.sleep(1000);
				System.out.println("--------------------------------");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		RandomGen random_num = new RandomGen();
		random_num.start();
	}
}

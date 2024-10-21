package matrix;
import java.io.*;

class Table extends Thread{
	public void printTable(int n) {
		synchronized(this) {
			for(int i=1; i<11; i++) {
				System.out.println(n+" x "+i+" = "+n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println();	
		}
	}
}

class MyTab1 extends Thread{
	Table t;
	int n;
	MyTab1 (Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(n);
	}
}

class MyTab2 extends Thread{
	Table t;
	int n;
	MyTab2 (Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(n);
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Table t1 = new Table();
			MyTab1 th1 = new MyTab1(t1);
			MyTab2 th2 = new MyTab2(t1);
			System.out.print("Enter the table you want to print first: ");
			th1.n = Integer.parseInt(br.readLine().trim());
			System.out.print("Enter the table you want to print second: ");
			th2.n = Integer.parseInt(br.readLine().trim());
			th1.start();
			th2.start();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}

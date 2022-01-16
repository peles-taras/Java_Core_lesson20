package ua.lviv.lgs;

import java.util.Scanner;

public class Application {
@SuppressWarnings("resource")
public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Fibonacci numbers amount to print");
	int valuesAmount = sc.nextInt();
	
	MyThread mt = new MyThread(valuesAmount);
	mt.start();
	mt.join();
	RunnableThread rt = new RunnableThread(valuesAmount);
	Thread thread = new Thread(rt);
	thread.start();
	;
}
}

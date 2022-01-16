package ua.lviv.lgs;

public class MyThread extends Thread {

	int a = 1;
	int b = 1;
	int sum;
	int valuesCount;

	public MyThread(int valuesCount) {
		this.valuesCount = valuesCount;
	}

	public void run() {
		System.out.print("Thread: ");
		System.out.print(a + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.print(b + " ");
		for (int i = 3; i < valuesCount + 1; i++) {
			sum = a + b;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}

	}

}

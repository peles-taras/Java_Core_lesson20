package ua.lviv.lgs;

public class RunnableThread implements Runnable {

	int valuesCount;

	public RunnableThread(int valuesCount) {
		this.valuesCount = valuesCount;
	}

	@Override
	public void run() {
		int[] a = new int[valuesCount];
		a[0] = 1;
		a[1] = 1;
		System.out.println("");
		System.out.print("Runnable: ");
		for (int i = 2; i < valuesCount; i++) {
			a[i] = a[i - 1] + a[i - 2];

		}
		for (int i = valuesCount - 1; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(a[i] + " ");

		}
	}

}

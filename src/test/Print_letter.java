package test;

public class Print_letter implements Runnable {
	char ch = 97;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				notify();
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (ch < 123) {
					if ("元音".equals(Thread.currentThread().getName())
							&& ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch)) {
						System.out.println(Thread.currentThread().getName() + " ----->" + ch);
						ch++;
					} else if ("其他".equals(Thread.currentThread().getName())) {
						System.out.println(Thread.currentThread().getName() + " " + ch);
						ch++;
					}
					
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Print_letter t = new Print_letter();
		Thread t1 = new Thread(t, "元音");
		Thread t2 = new Thread(t, "其他");
		t1.start();
		t2.start();
	}
}

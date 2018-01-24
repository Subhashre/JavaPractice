package main.com.subha.concept.thread;

public class ThreadInterferenceExample {

	public static void main(String[] args) {
		ThreadInterferenceExample ti = new ThreadInterferenceExample();
		Counter c = ti.new Counter();

		Thread a = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Get the value A :" + c.value());
				c.increment();
				System.out.println("Store the value again A:" + c.value());
			}
		});

		Thread b = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Get the value B :" + c.value());
				c.decrement();
				System.out.println("Store the value again B:" + c.value());
			}
		});

		a.start();
		b.start();
	}
	private class Counter {
		private int c = 0;

		public void increment() {
			c++;
		}

		public void decrement() {
			c--;
		}

		public int value() {
			return c;
		}

	}

}

/*class Counter {
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}*/
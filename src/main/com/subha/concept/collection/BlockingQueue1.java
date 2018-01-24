package main.com.subha.concept.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Provides waiting thread-safe access to a java.util.Queue instance.
 *
 * Requirements: - Usage of API from java.util.concurrent packageis prohibited.
 * - Limit the amount of additional consumed memory to O(1). - The
 * implementation is supposed to be acceptable for usage in a highly
 * multi-thread environment.
 *
 * Useful tips a.k.a. common pitfalls: - Please note that you do not need to
 * implement java.util.Queue. - Readiness to accept or provide elements is
 * solely dependent on the underlying queue. Any additional queue capacity
 * limitations break contract defined in the javadoc.
 */
public class BlockingQueue1<E> {
	// implement code here ...
	private Queue<E> queue;
	int currentSize = 10;

	/**
	 * @param queue
	 *            The underlying "wrapped" queue.
	 */
	public BlockingQueue1(Queue<E> queue) {
		// implement code here ...
		this.queue = queue;
	}

	/**
	 * Inserts the specified element into the underlying queue, waiting if necessary
	 * for the underlying queue to be ready to accept new elements.
	 * 
	 * @param e
	 *            the element to insert.
	 * @throws InterruptedException
	 */
	public void push(E e) throws InterruptedException {
		// implement code here ...
		synchronized (this.queue) {
			while (this.queue.size() == this.currentSize) {
				System.out.println("Inside Wait state" + Thread.currentThread().getName());
				wait();
			}
			if (this.queue.size() == 0) {
				System.out.println("All thread notified" + Thread.currentThread().getName());
				notify();
			}
			// this.currentSize++;
			this.queue.offer(e);
			System.out.println("One element is inserted into the queue");
			System.out.println("The queue is :" + queue);
		}
	}

	/**
	 * Retrieves and removes the head of the underlying queue, waiting if necessary
	 * until it is capable of providing an element.
	 * 
	 * @return the retrieved element
	 * @throws InterruptedException
	 */
	public E pull() throws InterruptedException {
		// implement code here ...
		synchronized (this.queue) {
			while (this.queue.size() == 0) {
				System.out.println("Inside Wait state" + Thread.currentThread().getName());
				wait();
			}
			if (this.queue.size() == this.currentSize) {
				System.out.println("All thread notified" + Thread.currentThread().getName());
				notify();
			}
			// this.currentSize--;
			System.out.println("One element is removed into the queue");
			return this.queue.poll();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Queue queue = new LinkedList();
		BlockingQueue1 bq1 = new BlockingQueue1<>(queue);
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// Queue queue = new LinkedList();
				// BlockingQueue bq1 = new BlockingQueue<>(queue);
				try {
					for (int i = 10; i < 20; i++)
						bq1.push(i);
					for (int i = 10; i < 25; i++)
						System.out.println(bq1.pull());
					// System.out.println(bq1.pull());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// Queue queue = new LinkedList();
				// BlockingQueue bq1 = new BlockingQueue<>(queue);
				try {
					for (int i = 20; i < 30; i++)
						bq1.push(i);
					for (int i = 10; i < 25; i++)
						System.out.println(bq1.pull());
					// System.out.println(bq1.pull());
					// System.out.println(bq1.pull());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		// Thread.sleep(10000);
		t2.start();

	}
}

package main.com.subha.concept.collection;

import java.util.Date;
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
public class BlockingQueue<E> {
	// implement code here ...
	Queue<E> queue;
	int elementCount =3;

	/**
	 * @param queue
	 *            The underlying "wrapped" queue.
	 */
	public BlockingQueue(Queue<E> queue) {
		// implement code here ...
		this.queue = queue;
		//this.elementCount = 2;
	}

	/**
	 * Inserts the specified element into the underlying queue, waiting if necessary
	 * for the underlying queue to be ready to accept new elements.
	 * 
	 * @param e
	 *            the element to insert.
	 * @throws InterruptedException 
	 */
	public void push(E e)  {
		// implement code here ...
//		while (true) {
			synchronized (this) {
				while (queue.size() == elementCount) {
					try {
						System.out.println("Waiting for :producer");
						wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println("Producer produced :: " + e);
			//	elementCount++;
				queue.offer(e);
				notify();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
//		}
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
//		while (true) {
			synchronized (this) {
				while (queue.size() == 0) {
					try {
						System.out.println("Waiting for :Consumer");
						wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				//elementCount--;
				System.out.println("Consumer consumed:: " + queue.peek());
				
				notify();
				Thread.sleep(200);
				return queue.poll();
			}
//		}
	}
	
	public static void main(String[] args) throws InterruptedException {
 		Queue<Long> queue = new LinkedList<Long>();
 		final BlockingQueue<Long> blockingQueue = new BlockingQueue<Long>(queue);
 		
 		Thread consumer = new Thread(new Runnable() {
 			@Override
 			public void run() {
 				try {
 					for(int i = 1 ; i <=5 ;i++) 
 					blockingQueue.pull();
 				} catch (InterruptedException e) {
 					e.printStackTrace();
 				}
 			}
 		});
 		
 		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1 ; i <=5 ;i++) {
				blockingQueue.push(System.currentTimeMillis());
				}
			}
		});
 		producer.start();
 		consumer.start();
 	}
}

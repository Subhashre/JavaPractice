package main.sg.test;

import java.util.Queue;

/**
 * 
 * @author subhashree
 * 
 *         Provides waiting thread-safe access to a java.util.Queue instance.
 *
 *         Requirements: - Usage of API from java.util.concurrent packageis
 *         prohibited. - Limit the amount of additional consumed memory to O(1).
 *         - The implementation is supposed to be acceptable for usage in a
 *         highly multi-thread environment.
 *
 *         Useful tips a.k.a. common pitfalls: - Please note that you do not
 *         need to implement java.util.Queue. - Readiness to accept or provide
 *         elements is solely dependent on the underlying queue. Any additional
 *         queue capacity limitations break contract defined in the javadoc.
 */
public class BlockingQueue<E> {
	Queue<E> queue;
	int maxElement;

	/**
	 * @param queue
	 *            The underlying "wrapped" queue.
	 */
	public BlockingQueue(Queue<E> queue) {
		this.queue = queue;
		this.maxElement = 5;
	}

	/**
	 * Inserts the specified element into the underlying queue, waiting if
	 * necessary for the underlying queue to be ready to accept new elements.
	 * 
	 * @param e
	 *            the element to insert.
	 */
	public void push(E e) {
		synchronized (this) {
			while (queue.size() == maxElement) {
				try {
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			queue.add(e);
			notify();
		}
	}

	/**
	 * Retrieves and removes the head of the underlying queue, waiting if
	 * necessary until it is capable of providing an element.
	 * 5
	 * @return the retrieved element
	 */
	public E pull() {
		synchronized (this) {
			E result = null;
			while (queue.size() == 0) {
				try {
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			result = queue.remove();
			notify();
			return result;
		}
	}

}

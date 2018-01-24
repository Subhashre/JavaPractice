package test.main.com.subha.concept.collection;

import static org.junit.Assert.*;

import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.com.subha.concept.collection.BlockingQueue;

@RunWith(JUnit4.class)
public class BlockingQueueTest {

	private String result = null;

	@Test
	public void test_Push_Success() {
		Queue<String> queue = new LinkedList<>();
		BlockingQueue<String> blkQueue = new BlockingQueue<String>(queue);
		try {
			blkQueue.push("element1");
			assertEquals("element1", blkQueue.pull());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(State.RUNNABLE, Thread.currentThread().getState());
	}

	@Test
	public void test_Push_withThread_Success() {
		final Queue<String> queue = new LinkedList<>();
		BlockingQueue<String> blkQueue = new BlockingQueue<String>(queue);
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				blkQueue.push("element1");
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					result = blkQueue.pull();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		consumer.start();
		assertEquals(State.WAITING, consumer.getState());

		producer.start();
		assertEquals(State.RUNNABLE, producer.getState());
		assertEquals(result, "element1");
	}

	@Test
	public void test_Push_Failure() {
		Queue<String> queue = new LinkedList<>();
		BlockingQueue<String> blkQueue = new BlockingQueue<String>(queue);
		try {
			blkQueue.pull();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(State.WAITING, Thread.currentThread().getState());
	}

}

package test.sg.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.sg.test.BlockingQueue;
/**
 * @author subhashree
 * 
 */

@RunWith(JUnit4.class)
public class BlockingQueueTest {


	@Test
	public void test_Push_Success() {
		Queue<String> queue = new LinkedList<>();
		final BlockingQueue<String> blkQueue = new BlockingQueue<String>(queue);
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				blkQueue.push("element1");
			}
		});
		producer.start();
		assertEquals("element1", blkQueue.pull());
	}

	
	@Test
	public void test_Push_withThread_Success() throws InterruptedException {
		final Queue<String> queue = new LinkedList<>();
		final BlockingQueue<String> blkQueue = new BlockingQueue<String>(queue);
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1 ;i<=6 ;i++)
				blkQueue.push("element"+i);
			}
		});
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1 ;i<5 ;i++)
					blkQueue.pull();
			}
		});
		producer.start();
		consumer.start();
		consumer.join();
		assertEquals(blkQueue.pull(), "element5");
	}
}
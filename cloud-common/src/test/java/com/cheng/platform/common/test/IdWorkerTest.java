package com.cheng.platform.common.test;

import com.cheng.platform.common.utils.IdWorker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * IdWorker 并发测试
 * </p>
 * 
 * @author lufengc
 * @version 2017-03-26
 */
public class IdWorkerTest {

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		int count = 1000;
		ExecutorService executorService = Executors.newFixedThreadPool(count);
		for (int i = 0; i < count; i++) {
			executorService.execute(new IdWorkerTest().new Task());
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		String s = IdWorker.randomBase62(32);
		System.out.println(s);

		long l = IdWorker.randomLong();
		System.out.println(l);
	}

	public class Task implements Runnable {

		public void run() {
			try {
				long id = IdWorker.getId();
				System.err.println(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

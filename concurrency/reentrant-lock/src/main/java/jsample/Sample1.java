package jsample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Sample1 {

	private Map<String, String> map = new HashMap<>();

	private ReentrantLock renLock = new ReentrantLock();

	/*
	 * Since same ReentrantLock object is used in all methods, it means only one
	 * thread can access these methods. No other thread will be allowed to access
	 * any of the method.
	 * 
	 */

	public void put(String key, String value) {
		try {
			renLock.lock();
			sleep();
			System.out.println(Thread.currentThread().getName());
			map.put(key, value);
		} finally {
			renLock.unlock();
		}

	}

	public void delete(String key) {
		try {
			renLock.lock();
			sleep();
			System.out.println(Thread.currentThread().getName());
			map.remove(key);
		} finally {
			renLock.unlock();
		}
	}

	public String get(String key) {
		try {
			renLock.lock();
			sleep();
			System.out.println(Thread.currentThread().getName());
			return map.get(key);
		} finally {
			renLock.unlock();
		}
	}

	public void update(String key, String value) {
		try {
			renLock.lock();
			sleep();
			System.out.println(Thread.currentThread().getName());
			delete(key);
			put(key, value);
		} finally {
			renLock.unlock();
		}
	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
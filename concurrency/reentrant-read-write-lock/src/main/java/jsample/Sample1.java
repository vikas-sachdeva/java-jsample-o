package jsample;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Sample1 {

	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

	private final StringBuilder message = new StringBuilder("jsample");

	public void read() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				if (lock.isWriteLocked()) {
					System.out.println("No thread has write lock.");
				}
				lock.readLock().lock();
				System.out.println(
						"read() method, thread name - " + Thread.currentThread().getName() + " message - " + message);

			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.readLock().unlock();
			}
		}
	}

	public void writeA() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				lock.writeLock().lock();
				message.append("A" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.writeLock().unlock();
			}
		}
	}

	public void writeB() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				lock.writeLock().lock();
				message.append("B" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.writeLock().unlock();
			}
		}
	}
}

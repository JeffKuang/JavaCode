/**
 * 
 */
package com.jeffkuang.study01;

/**
 * @author Jeff Kuang
 *
 */
public class PrintServer implements Runnable {
	public PrintServer() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new PrintServer(), "test");
		t1.start();
	}
}

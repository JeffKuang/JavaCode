/**
 * 
 */
package com.jeffkuang.study01;

/**
 * @author Administrator
 *
 */
public class DisplayMainName extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			printMsg();
	}

	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = " + name);
	}

	public static void main(String[] args) throws InterruptedException {
		DisplayMainName t1 = new DisplayMainName();
		t1.start();

		sleep(1);
		for (int i = 0; i < 10; i++) {
			t1.printMsg();
		}
	}
}

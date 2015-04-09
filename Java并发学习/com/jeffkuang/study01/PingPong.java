/**
 * 
 */
package com.jeffkuang.study01;

/**
 * @author Administrator
 *
 */
public class PingPong extends Thread {
	private String word;
	private int delay;

	public PingPong(String whatToSay, int delayTime) {
		word = whatToSay;
		delay = delayTime;
	}

	@Override
	public void run() {
		try {
			for (;;) {
				System.out.println(word + " ");
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {
		new PingPong("ping", 33).start();
		new PingPong("PONG", 100).start();
	}
}

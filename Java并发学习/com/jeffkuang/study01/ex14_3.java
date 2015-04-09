package com.jeffkuang.study01;

class Test implements Runnable {

	@Override
	public void run() {
	}

}

class Test1{
	private int count = 0;

	public void add() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		count++;
		System.out.println(name + ": " + count);
	}	
}

public class ex14_3 {

	public static void main(String[] args) {
		Runnable t1 = new Test();
		Runnable t2 = new Test();

		new Thread(t1).start();
		new Thread(t2).start();

	}
}

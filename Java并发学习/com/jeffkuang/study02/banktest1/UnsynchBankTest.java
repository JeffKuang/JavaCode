/**
 * 
 */
package com.jeffkuang.study02.banktest1;

/**
 * This program shows data corruption when multiple thread access a data
 * structure.
 * @author Jeff Kuang
 * @version 0.10 2015-04-15
 */
public class UnsynchBankTest {
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;

	public static void main(String[] args) {
		Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
		int i;
		for (i = 0; i < NACCOUNTS; i++) {
			TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
			Thread t = new Thread(r);
			t.start();
		}
	}
}

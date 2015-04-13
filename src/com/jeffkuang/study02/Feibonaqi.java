/**
 * 
 */
package com.jeffkuang.study02;

/**
 * @author Jeff Kuang
 *
 */
public class Feibonaqi {
	private int a;

	public long fun(int n){
		if (n <= 2){
			return 1;
		}
		return fun(n - 1)+fun(n - 2);
	}
	
	public static void main(String[] args){
		Feibonaqi t1 = new Feibonaqi();
		long b = t1.fun(2);
		System.out.println(b);
	}
}

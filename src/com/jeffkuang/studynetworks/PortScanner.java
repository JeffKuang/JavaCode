/**
 * 扫描主机上从1到1024之间的端口，判断端口是否已经被服务器程序监听。
 */
package com.jeffkuang.studynetworks;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Jeff Kuang
 *
 */
public class PortScanner {
	public static void main(String args[]){
		String host = "localhost";
		if (args.length > 0)
			host = args[0];
		new PortScanner().scan(host);
	}
	
	public void scan(String host){
		Socket socket = null;
		for (int port = 1; port < 1024; port++){
			try{
				socket = new Socket(host, port);
				System.out.println("There is a server on port " + port);
			}catch (IOException e){
				System.out.println("Can't connect to port " + port);
			}finally{
				try{
					if (socket != null)
						socket.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}

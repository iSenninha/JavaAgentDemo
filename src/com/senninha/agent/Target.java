package com.senninha.agent;

public class Target {
	public static boolean flag = true;
	public static void main(String[] args) {
		while(flag) {
			System.out.println("继续");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("结束");
	}

}

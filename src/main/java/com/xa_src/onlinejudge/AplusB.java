package com.xa_src.onlinejudge;

import java.util.Scanner;

/**
 * 
 * @Description 问题编号:1000
 * @author CaiXiaoHui E-mail: 1061594797@qq.com
 * @version
 * @date 2019年5月19日下午5:37:55
 *
 */
public class AplusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		}
	}
}

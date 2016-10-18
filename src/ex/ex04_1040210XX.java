package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x^2				若 x < -1
 * y = x^3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3				若 x > 1
 * Date: 2016/10/12
 * Author: 105021086 曾瀅謜
 */

import java.util.Scanner;

public class ex04_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in) ;
		int x;
		System.out.print("請輸入X值 : ");
		x = scn.nextInt();
		int n1,n2,n3;
		n1 = 3*(x*x);
		n2 = (x*x*x)+3*x-3;
		n3 = 2*x+3;
		System.out.print("計算y值輸出"+"\n"+"1.y = 3*x2= "+n1
				+"\n"+"2.y = x3+3*x-3= "+n2
				+"\n"+"3.y=2*x+3= "+n3);
	}

}

package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)
 * Date: 2016/10/12
 * Author: 105021086 曾瀅謜
 */

import java.util.Scanner;

public class ex03_1040210XX {

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

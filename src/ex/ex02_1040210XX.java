package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一正整數，判斷其奇偶數
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

public class ex02_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一正整數：");
		test = scn.next();
		int i = Integer.parseInt(test);
		if(i%2==0){
			System.out.print("是偶數!!");
		}
		else if(i%2!=0)
		{
			System.out.print("是奇數!!");
		}
	}

}

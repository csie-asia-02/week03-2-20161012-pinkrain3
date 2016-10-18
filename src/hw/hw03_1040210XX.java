package hw;

import java.util.Scanner;

/*
 * Topic: 閰行撖思��������霈��銝��� 4 雿���嚗誨銵刻正瘣�僑隞踝�敺���僑隞賣����僑嚗��僑銝�����撟港�����撟港������正��� 1900 �� 4 ���嚗�鋡� 100 ��嚗�隞乩���僑嚗���� 2000 撟湔��僑嚗�鋡� 400 ��嚗�� 2004 ��銋��僑嚗�隞亥◤ 4 ��嚗�
 * Date: 2016/10/12
 * Author: 105021086 曾瀅謜
 */
public class hw03_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String Input;
		for(int i=0;i<1;i=0) 
		{
			System.out.println("請輸入西元年分：");
			Input = scn.nextLine();
			int Output = Integer.parseInt(Input);

			if (Output<1) 
					System.out.println("資料有誤"); 
			else
				{
					if (Output%400==0 || ((Output%4==0)&&(Output%100!=0)))  
							System.out.println(Input+"是閏年");
					else
							System.out.println(Input+"非閏年");
					
					for(int j=0;j<1;j=0) 
						{
							System.out.println("是否繼續?(Y/N)");
							Input = scn.nextLine();
							if (Input.charAt(0)=='N' || Input.charAt(0)=='n')
									 System.exit(0); 
							else
								{
									if (Input.charAt(0)=='Y' || Input.charAt(0)=='y')
											break; 
									else
											continue; 
								}
						}
				}	
		}
	}
}
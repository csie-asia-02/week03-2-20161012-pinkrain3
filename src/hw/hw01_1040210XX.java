package hw;

import java.util.Scanner;

/*
 * Topic: �閰勗����祥�撘 600���誑銝����0.5����	600~1200���閰梯祥隞�9������1200���誑銝閰梯祥隞�79������蝙��撓����蝙������(����)嚗��閰梯祥(���)
 * Date: 2016/10/12
 * Author: 105021086 曾瀅謜
 */
public class hw01_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in) ;
		System.out.println("請輸入單月使用時間(/分)：");
		int min = scn.nextInt();
		float a,b,c;
		float a1 = (float) (min *0.5);
		float b1 = (float) (min*0.9);
		float c1 = (float) (min*0.79);
		if(min <600){
			if(min >=600 && min <1200)
			System.out.println("此月的總電話費為："+ a1);
		}
		if(min > 1200){
			System.out.println("此月的總電話費為："+ b1);
		}else{
			System.out.println("此月的總電話費為："+ c1);
		}
	}

}

package Software_Construction;

import java.util.Scanner;

public class Method {
		
	public int Random_Number (int lower , int upper) {//随机数：lower<=Number<upper
		int Number=0;
		Number = (int)((Math.random()*(upper-lower+1))+lower);
		return Number;		
	}

///////////////////////////////////////////////////////////////////////
	//给习题输入答案
///////////////////////////////////////////////////////////////////////
	public void Answer_CSV_Book () {
		Scanner sc=new Scanner(System.in);
		int [][] f = new int [50][1];
		for (int i = 0;i<50;i++) {
			String str=null;
			str=sc.nextLine();
			int b = Integer.valueOf(str).intValue();
			f[i][0]= b;
		}
	}
	public void Display_head(String s){//显示表头。
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("                                                 "+s);
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//随机符号方法
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int Random_Symbols (int Symbols1,int Symbols2) {//随机输入的2个符号
		while(true) {
			int Symbols = Random_Number (42 , 48);
			if(Symbols == Symbols1) {
				return Symbols1;
			}
			else if(Symbols == Symbols2) {
				return Symbols2;
			}
		}
	}
	public int Random_Symbols (int Symbols1,int Symbols2,int Symbols3) {//随机输入的3个符号
		while(true) {
			int Symbols = Random_Number (42 , 48);
			if(Symbols == Symbols1) {
				return Symbols1;
			}
			else if(Symbols == Symbols2) {
				return Symbols2;
			}
			else if(Symbols == Symbols3) {
				return Symbols3;
			}
		}
	}
	public int Random_Symbols (int Symbols1,int Symbols2,int Symbols3,int Symbols4) {//随机输入的4个符号
		while(true) {
			int Symbols = Random_Number (42 , 48);
			if(Symbols == Symbols1) {
				return Symbols1;
			}
			else if(Symbols == Symbols2) {
				return Symbols2;
			}
			else if(Symbols == Symbols3) {
				return Symbols3;
			}
			else if(Symbols == Symbols4) {
				return Symbols4;
			}
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public int Identify_Symbols_And_Calculate (int Left_Number ,int Symbols ,int Right_Number ) {//识别多种符号并计算结果
		int Answer = 0;
		if(Symbols == 43) {//如果为加法。
			Answer = Left_Number + Right_Number;
			return Answer;
		}
		else if(Symbols == 45) {//如果为减法。
			Answer = Left_Number - Right_Number;
			return Answer;
		}
		return 0;
	}
	
	public boolean Make_sure_the_answer_is_correct(int Left_Number ,int Symbols ,int Right_Number,int Answer ) {//判断算式答案是否正确
		int answer = Identify_Symbols_And_Calculate (Left_Number ,Symbols ,Right_Number );
		if(answer==Answer)
			return true;
		else
			return false;
	}
}

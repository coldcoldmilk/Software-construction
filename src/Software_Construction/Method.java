package Software_Construction;

import java.util.Scanner;

public class Method {
		
	public int Random_Number (int lower , int upper) {//�������lower<=Number<upper
		int Number=0;
		Number = (int)((Math.random()*(upper-lower+1))+lower);
		return Number;		
	}

///////////////////////////////////////////////////////////////////////
	//��ϰ�������
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
	public void Display_head(String s){//��ʾ��ͷ��
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("                                                 "+s);
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//������ŷ���
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int Random_Symbols (int Symbols1,int Symbols2) {//��������2������
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
	public int Random_Symbols (int Symbols1,int Symbols2,int Symbols3) {//��������3������
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
	public int Random_Symbols (int Symbols1,int Symbols2,int Symbols3,int Symbols4) {//��������4������
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
	public int Identify_Symbols_And_Calculate (int Left_Number ,int Symbols ,int Right_Number ) {//ʶ����ַ��Ų�������
		int Answer = 0;
		if(Symbols == 43) {//���Ϊ�ӷ���
			Answer = Left_Number + Right_Number;
			return Answer;
		}
		else if(Symbols == 45) {//���Ϊ������
			Answer = Left_Number - Right_Number;
			return Answer;
		}
		return 0;
	}
	
	public boolean Make_sure_the_answer_is_correct(int Left_Number ,int Symbols ,int Right_Number,int Answer ) {//�ж���ʽ���Ƿ���ȷ
		int answer = Identify_Symbols_And_Calculate (Left_Number ,Symbols ,Right_Number );
		if(answer==Answer)
			return true;
		else
			return false;
	}
}

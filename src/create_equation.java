public class create_equation {
	public int[][] create(){
		int number1=0;
		int number2=0;
		int answer=0;
		int symbol=0;
		int data[][] = new int [50][4]; //50����ʽ�⣬�� ����һ �����ţ����ֶ�����  �ĸ�����
		
		for(int count1=0;count1<50;count1++) {
				while(true) {
				symbol = (int)(Math.random()*2+43);
				if(symbol==43) {//���Ϊ�ӷ�
					break;
				}
				else if(symbol==45){//���Ϊ����
					break;
				}
			}
			
			while(true) {
				number1 =(int)(Math.random()*100);
				number2 =(int)(Math.random()*100);
				answer=number1+number2;
				if((symbol==43)&&(answer<=100)) {//Ϊ�ӷ��ҽ��������100 &&(answer<=100)
					break;
				}
				else if((symbol==45)&&(answer>0)) {//Ϊ�����ҽ������0 &&(answer>0)
					break;
				}
				
			}

			data[count1][0]=number1;
			data[count1][1]=symbol;
			data[count1][2]=number2;
			data[count1][3]=answer;
			
			for(int count2=count1-1;count2>=0;count2--) {//��ʽ����أ��Ȳ��ش𰸣��ٶԱȼӼ������Ƿ���ͬ���������һ�����ֶ�������ظ����������
				if(data[count1][3]==data[count2][3]) {//�Աȴ�
					if(data[count1][1]==data[count2][1])//�Աȷ���
						if((data[count1][0]==data[count2][0])||(data[count1][2]==data[count2][2])) {//�Ա�����һ����������������ظ������COUNT1���������������
							count1--;
							break;
						}
				}
			}
			
			
		}
		return data;//����50�������⵽������
	}
	
}

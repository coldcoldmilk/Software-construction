public class create_equation {
	public int[][] create(){
		int number1=0;
		int number2=0;
		int answer=0;
		int symbol=0;
		
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
		
		//System.out.println(number1+" "+(char)symbol+" "+number2+" "+"="+answer+" ");
		int data[][] = new int [1][4];
		data[0][0]=number1;
		data[0][1]=symbol;
		data[0][2]=number2;
		data[0][3]=answer;
		
		return data;
		
	}
	
}


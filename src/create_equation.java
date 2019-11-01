
public class create_equation {
	public int[][] create(){
		int number1=0;
		int number2=0;
//		int answer=0;
		int symbol=0;
		
		while(true) {
			symbol = (int)(Math.random()*2+43);
			if(symbol==43) {//随机为加法
				break;
			}
			else if(symbol==45){//随机为减法
				break;
			}
		}
		
		while(true) {
			number1 =(int)(Math.random()*100);
			number2 =(int)(Math.random()*100);
			answer=number1+number2;
			if((symbol==43)) {//为加法且结果不超过100
				break;
			}
			else if((symbol==45)) {//为减法且结果大于0
				break;
			}
			
		}
		
		//System.out.println(number1+" "+(char)symbol+" "+number2+" "+"="+answer+" ");
		int data[][] = new int [1][4];
		data[0][0]=number1;
		data[0][1]=symbol;
		data[0][2]=number2;
//		data[0][3]=answer;
		
		return data;
		
	}
	
}

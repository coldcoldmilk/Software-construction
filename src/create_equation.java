public class create_equation {
	public int[][] create(){
		int number1=0;
		int number2=0;
		int answer=0;
		int symbol=0;
		int data[][] = new int [50][4]; //50道算式题，存 数字一 ；符号；数字二；答案  四个整形
		
		for(int count1=0;count1<50;count1++) {
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
				if((symbol==43)&&(answer<=100)) {//为加法且结果不超过100 &&(answer<=100)
					break;
				}
				else if((symbol==45)&&(answer>0)) {//为减法且结果大于0 &&(answer>0)
					break;
				}
				
			}

			data[count1][0]=number1;
			data[count1][1]=symbol;
			data[count1][2]=number2;
			data[count1][3]=answer;
			
			for(int count2=count1-1;count2>=0;count2--) {//算式题查重，先查重答案，再对比加减符号是否相同，最后数字一和数字二，如果重复则重新随机
				if(data[count1][3]==data[count2][3]) {//对比答案
					if(data[count1][1]==data[count2][1])//对比符号
						if((data[count1][0]==data[count2][0])||(data[count1][2]==data[count2][2])) {//对比数字一二，如果均符合则重复，则第COUNT1道算术题重新随机
							count1--;
							break;
						}
				}
			}
			
			
		}
		return data;//返回50道算术题到主函数
	}
	
}

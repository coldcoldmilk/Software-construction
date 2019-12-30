package Software_Construction;

public abstract class Arithmetic_class_abstract {
	public int Add_upper=100;
	public int Subtraction_floor= 0;
	public int Left_Number_lower = 0;
	public int Left_Number_upper = 100;
	public int Right_Number_lower = 0;
	public int Right_Number_upper = 100;
	public int answer_lower = 0;
	public int answer_upper = 100;
	public int data[][] = new int [1][7];//存放一条算式数据的数组
	public int Question_Number = 0;
	public int Left_Number = 0;
	public int Symbols = 43;
	public int Right_Number = 0;
	public int Answer = 0;
	public int Right_Answer = 0;
	Method method = new Method();
	
	public  int[][] RandomCreate(int Symbols){
		
		while(true) {
			Left_Number = method.Random_Number(Left_Number_lower, Left_Number_upper);
			Right_Number = method.Random_Number(Right_Number_lower,Right_Number_upper);
			Right_Answer = method.Identify_Symbols_And_Calculate(Left_Number, Symbols, Right_Number);
			if((Right_Answer>=answer_lower)&&(Right_Answer<=answer_upper)) {//为加法且结果不超过100 &&(answer<=100)
				break;
			}
			
		}
		
	//	data[0][0]=Question_Number;
		data[0][1]=Left_Number;
		data[0][2]=Symbols;
		data[0][3]=Right_Number;
		data[0][4]=Answer;
		data[0][5]=0;//0为错，1为对
		data[0][6]=Right_Answer;
		return data;
	}
	
	public int[][] RandomCreate(int Left_Number_lower,int Left_Number_upper,int Symbols,int Right_Number_lower,int Right_Number_upper,int answer_lower,int answer_upper){//终极无敌可移植性超高算式
		
		while(true) {
			Left_Number = method.Random_Number(Left_Number_lower, Left_Number_upper);
			Right_Number = method.Random_Number(Right_Number_lower,Right_Number_upper);
			Right_Answer = method.Identify_Symbols_And_Calculate(Left_Number, Symbols, Right_Number);
			if((answer_lower<=Answer)&&(Answer<=answer_upper)) {//为加法且结果不超过100 &&(answer<=100)
				break;
			}
			
		}
		
	//	data[0][0]=Question_Number;
		data[0][1]=Left_Number;
		data[0][2]=Symbols;
		data[0][3]=Right_Number;
		data[0][4]=Answer;
		data[0][5]=0;//0为错，1为对
		data[0][6]=Right_Answer;
		
		return data;
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//以下为觉得demo里不错的代码copy过来的。
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int getLeftOperand(){return Left_Number;}
	public int getRightOperand(){return Right_Number;}
	public char getSymbols(){return (char)Symbols;}
	public int getAnswer(){return Answer;}
	
	public String toString(){
		return ""+Left_Number+getSymbols()+Right_Number;
	}
	public String asString(){
		return toString()+"=";
	}
	public String fullString(){
		return toString()+"="+getAnswer();
	} 
}

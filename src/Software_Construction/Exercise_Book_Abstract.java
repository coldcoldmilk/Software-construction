package Software_Construction;

public abstract class Exercise_Book_Abstract {
	public static int ExerciseNumber= 50; //默认题目数量
	public static int Exercise[][]=new int[ExerciseNumber][7];//题目数组
	public int Symbols=0;
	public int Display_Number = 4;
	Method method = new Method();
//输出随机题目指定数量 不指定数量默认50
//输出减法题目指定数量
//输出加法题目
	public void Create_Random_Problems() {//重新输出后数组不变
		for(int Number=0;Number<ExerciseNumber;Number++) {
			int data[][] = new Arithmetic_class_Rondom().RandomCreate(method.Random_Symbols('+', '-'));
			Exercise[Number][0]=Number+1;//题号
			Exercise[Number][1]=data[0][1];
			Exercise[Number][2]=data[0][2];
			Exercise[Number][3]=data[0][3];
			Exercise[Number][4]=data[0][4];
			Exercise[Number][5]=data[0][5];
			Exercise[Number][6]=data[0][6];
		}
	}
	
	public void Create_Random_Problems(int ExerciseNumber) {
		this.ExerciseNumber=ExerciseNumber;
		for(int Number=0;Number<ExerciseNumber;Number++) {
			int data[][] = new Arithmetic_class_Rondom().RandomCreate(method.Random_Symbols('+', '-'));
			Exercise[Number][0]=Number+1;//题号
			Exercise[Number][1]=data[0][1];
			Exercise[Number][2]=data[0][2];
			Exercise[Number][3]=data[0][3];
			Exercise[Number][4]=data[0][4];
			Exercise[Number][5]=data[0][5];
			Exercise[Number][6]=data[0][6];
		}
	}
	
	public void Create_Problems(int Symbols) {
		for(int Number=0;Number<ExerciseNumber;Number++) {
			int data[][] = new Arithmetic_class_Rondom().RandomCreate(Symbols);
			Exercise[Number][0]=Number+1;//题号
			Exercise[Number][1]=data[0][1];
			Exercise[Number][2]=data[0][2];
			Exercise[Number][3]=data[0][3];
			Exercise[Number][4]=data[0][4];
			Exercise[Number][5]=data[0][5];
			Exercise[Number][6]=data[0][6];
		}
	}
	
	public void Create_Problems(int Symbols,int ExerciseNumber) {
		this.ExerciseNumber=ExerciseNumber;
		for(int Number=0;Number<ExerciseNumber;Number++) {
			int data[][] = new Arithmetic_class_Rondom().RandomCreate(Symbols);
			Exercise[Number][0]=Number+1;//题号
			Exercise[Number][1]=data[0][1];
			Exercise[Number][2]=data[0][2];
			Exercise[Number][3]=data[0][3];
			Exercise[Number][4]=data[0][4];
			Exercise[Number][5]=data[0][5];
			Exercise[Number][6]=data[0][6];
		}
	}
	
	public void Display_Output_Exercise (){
		for(int count=0;count<ExerciseNumber;count++) {
			String s1 = "["+Exercise[count][0]+"]"+" ";
			String s2 = Exercise[count][1]+" "+(char)Exercise[count][2]+" "+Exercise[count][3]+" = ";
			System.out.printf("%-5s",s1);
			System.out.printf("%-15s",s2);
			if(((count+1)%Display_Number)==0) {//换行
				System.out.println();
			}
		}
		
	}
	
	public void Display_Output_Exercise (int Display_Number){
		for(int count=0;count<ExerciseNumber;count++) {
			String s1 = "["+Exercise[count][0]+"]"+" ";
			String s2 = Exercise[count][1]+" "+(char)Exercise[count][2]+" "+Exercise[count][3]+" = ";
			System.out.printf("%-5s",s1);
			System.out.printf("%-15s",s2);
			if(((count+1)%Display_Number)==0) {//换行
				System.out.println();
			}
		}
		
	}
	
	public abstract void Display_head();
}

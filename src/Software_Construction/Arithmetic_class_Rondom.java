package Software_Construction;

public class Arithmetic_class_Rondom extends Arithmetic_class_abstract{
	public int [][] Rondom_Problem (int Symbols1,int Symbols2) {
		Symbols= method.Random_Symbols(Symbols1, Symbols2);
		return RandomCreate(Symbols);
	}
	public int [][] Rondom_Problem (int Symbols1,int Symbols2,int Symbols3) {
		Symbols= method.Random_Symbols(Symbols1, Symbols2,Symbols3);
		return RandomCreate(Symbols);
	}
	public int [][] Rondom_Problem (int Symbols1,int Symbols2,int Symbols3,int Symbols4) {
		Symbols= method.Random_Symbols(Symbols1, Symbols2,Symbols4);
		return RandomCreate(Symbols);
	}
}

package Software_Construction;

public class Work_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Arithmetic_class_add arithmetic_class_add = new Arithmetic_class_add();
		Exercise_Book_Add exercise_Book_Add = new Exercise_Book_Add();
		Exercise_Book_Subtraction exercise_Book_Subtraction = new Exercise_Book_Subtraction();
		Exercise_Book_Rondom exercise_Book_Rondom = new Exercise_Book_Rondom();
		csvIO CsvIO = new csvIO();
//		exercise_Book_Add.Display_head();
		exercise_Book_Add.Addition_Exercise_Book();
//		exercise_Book_Add.Display_Output_Exercise();
//		exercise_Book_Subtraction.Display_head();
//		exercise_Book_Subtraction.Subtraction_Exercise_Book();
//		exercise_Book_Subtraction.Display_Output_Exercise();
//		exercise_Book_Rondom.Display_head();
//		exercise_Book_Rondom.Rondom_Exercise_Books();
//		exercise_Book_Rondom.Display_Output_Exercise();
//	//	CsvIO.CsvWriter(Exercise[][], "test", 2);
	//	CsvIO.CsvWriter(exercise_Book_Add.Exercise, "Test01", "exercise");
		CsvIO_Method method = new  CsvIO_Method();
		method.Creat_CSV_Book("test03");
	}

}

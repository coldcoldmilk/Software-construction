package Software_Construction;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class CsvIO_Method {
		public static String Name1 ;
		public static String Name2 ;
		public static String Name3 ;
		

		
	public void Creat_CSV_Book (String name) {//输入套题名称，生成三套题（加法、减法、混合加减法）
		csvIO csvio = new csvIO();
		Exercise_Book_Add exercise_Book_Add = new Exercise_Book_Add();
		Exercise_Book_Subtraction exercise_Book_Subtraction = new Exercise_Book_Subtraction();
		Exercise_Book_Rondom exercise_Book_Rondom = new Exercise_Book_Rondom();
		exercise_Book_Add.Addition_Exercise_Book();
		csvio.CsvWriter_exercise(exercise_Book_Add.Exercise, name+"_Add");
		exercise_Book_Subtraction.Subtraction_Exercise_Book();
		csvio.CsvWriter_exercise(exercise_Book_Subtraction.Exercise, name+"_Subtraction");
		exercise_Book_Rondom.Rondom_Exercise_Books();
		csvio.CsvWriter_exercise(exercise_Book_Rondom.Exercise, name+"_Rondom");
		
	}
	
	public String Set_Name (String name) {
		Name1= name;
		return name;
	}
	public String Set_Name2 (String name) {
		Name2= name;
		return name;
	}
	public String Set_Name3 (String name) {
		Name3= name;
		return name;
	}
	public String Retuen_Name1() {
		return Name1;
	}
	public String Retuen_Name2 () {
		return Name2;
	}
	public String Retuen_Name3 () {
		return Name3;
	}
	public String Return_Name_operation (String name,String type) {//输入套题名称，在名称后面加上加法或减法，返回这个套题名称
		String name2=name+"_"+type+"_";
		Name2=name2;
		return name2;
	}
	public String Return_Name_type (String name,String type) {//输入套题名称，在名称后面加上是习题集还是练习还是批改，返回这个套题名称
		String name2=name+type;
		Name3=name2;
		return name2;
	}

	
}

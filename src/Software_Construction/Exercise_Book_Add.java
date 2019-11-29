package Software_Construction;

public class Exercise_Book_Add extends Exercise_Book_Abstract{
	public void Addition_Exercise_Book() {//默认50道加法题。
		Create_Problems('+');
	}
	public void Addition_Exercise_Book(int ExerciseNumber) {
		Create_Problems('+',ExerciseNumber);
	}
	@Override
	public void Display_head() {
		// TODO Auto-generated method stub
		String s = "加法习题册";
		method.Display_head(s);
	}


}

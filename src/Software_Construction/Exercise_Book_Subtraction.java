package Software_Construction;

public class Exercise_Book_Subtraction extends Exercise_Book_Abstract{
	public void Subtraction_Exercise_Book() {//默认50道减法题。
		Create_Problems('-');
	}
	public void Subtraction_Exercise_Book(int ExerciseNumber) {
		Create_Problems('-',ExerciseNumber);
	}
	@Override
	public void Display_head() {
		// TODO Auto-generated method stub
		String s = "减法习题册";
		method.Display_head(s);
	}
}

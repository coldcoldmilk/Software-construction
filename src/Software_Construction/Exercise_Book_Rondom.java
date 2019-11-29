package Software_Construction;

public class Exercise_Book_Rondom extends Exercise_Book_Abstract{
	public void Rondom_Exercise_Books() {
		Create_Random_Problems();
	}
	public void Rondom_Exercise_Books(int ExerciseNumber) {
		Create_Random_Problems(ExerciseNumber);
	}
	@Override
	public void Display_head() {
		// TODO Auto-generated method stub
		String s = "Ëæ»úÏ°Ìâ²á";
		method.Display_head(s);
	}
}

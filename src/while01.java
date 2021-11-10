
public class while01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}
}

//はじめに条件式を評価してから、ブロック処理を行う
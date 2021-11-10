
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}
}
//ブロック処理をはじめに行ってから、条件式を評価する
//はじめから条件式がfalseでもブロック処理は行われる
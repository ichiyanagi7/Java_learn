package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100÷0は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラムが終了");
		}
	}
}

//　tryブロック：例外が発生する可能性がある処理
//　catchブロック：例外が発生した時に実行する処理
//　finallyブロック：例外発生有無に関わらず実行する処理

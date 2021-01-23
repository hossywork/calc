package task.Dentaku;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// 標準入力を受け取り、式を表示
        Scanner sc = new Scanner(System.in);
        System.out.println("式を入力してください");
        System.out.print("式：");
        String formula = sc.nextLine();
        System.out.println(formula);
        // 1 ＋、ーの演算子を除外する、優先する要素を抜き取る（subFormula)
        String[] semiFormula = formula.split("[¥+-]");
        // 2 ＋、－の演算子の配列を作る(addSub)
        String[] addSub = formula.split("[0-9¥/¥*]+");
        System.out.println(Arrays.deepToString(addSub));
        // 3 優先要素を繰り返し計算する　// a for文で条件式をつくる
        Double[] semiResult = new Double[semiFormula.length];
        for (int b = 0; b < semiFormula.length; b++){
            // b 優先要素の中から数値だけを取り出し、double型に変換
            String[] numerals = semiFormula[b].split("[*¥/]");
            Double[] numbers = new Double[numerals.length];


    }
}

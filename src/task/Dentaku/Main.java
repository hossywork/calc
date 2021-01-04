package task.Dentaku;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// 標準入力を受け取り、式を表示
        Scanner sc = new Scanner(System.in);
        System.out.println("式を入力してください");
        System.out.print("式：");
        String formula = sc.nextLine();
        System.out.println(formula);
    // 演算子を抜き取り、数値を変換
        String[] numerals = formula.split("[¥+/*-]");
        double[] numbers = new double[numerals.length];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Double.parseDouble(numerals[i]);
        }
        System.out.println(numbers[0]);
    //　演算子をそれぞれ計算に組み込んでいく
        String[] operators = formula.split("[0 - 9]+");
        System.out.println(operators[1]);


    }
}

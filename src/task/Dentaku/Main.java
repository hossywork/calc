package task.Dentaku;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// 1 標準入力を受け取り、式を表示
        Scanner sc = new Scanner(System.in);
        System.out.println("式を入力してください");
        System.out.print("式：");
        String formula = sc.nextLine();
        System.out.println(formula);
    // 2 演算子を抜き取り、数値を変換
        String[] numerals = formula.split("[¥+/*-]");
        double[] numbers = new double[numerals.length];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Double.parseDouble(numerals[i]);
        }
    //　3 演算子を配列に分割
        String[] operators = formula.split("[0-9]+");
    //  4 演算子と数値を計算式に組み込む（ 数値は「numbers」、演算子は「operators」）
        int i = 1;
        Double firstNumber = numbers[0];
        for (i = 1; i < operators.length;i++){
            if (operators[i].contains("+")) {
                firstNumber = firstNumber + numbers[i];
            } else if (operators[i].contains("-")) {
                firstNumber = firstNumber - numbers[i];
            } else if (operators[i].contains("*")) {
                firstNumber = firstNumber * numbers[i];
            } else if (operators[i].contains("/") && numbers[i] != 0) {
                firstNumber = firstNumber / numbers[i];
            } else if (operators[i].contains("/") && numbers[i] == 0) {
                System.out.println("この計算機はゼロ除算できません！");
            }
            System.out.println(firstNumber);
        }
    }
}

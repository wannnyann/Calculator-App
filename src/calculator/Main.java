package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean y = true;
        boolean n = false;
            Scanner scanner = new Scanner(System.in);
            //Calculator(クラス名)、calc(変数名・自由に決められる)
            //new Calculator()(Calculator の実体（オブジェクト）を作る処理)
            Calculator calc = new Calculator();

        while (y) {
            System.out.print("1️つ目の数字を入力して下さい：");
            int a = scanner.nextInt();

            System.out.print("演算子を入力して下さい(+,-,*,/,%)：");
            String op = scanner.next();

            System.out.print("2つ目の数字を入力して下さい：");
            int b = scanner.nextInt();

            int result = 0;

            switch (op) {
                case "+":
                    result = calc.add(a, b);
                    break;
                case "-":
                    result = calc.subtract(a, b);
                    break;
                case "*":
                    result = calc.multiply(a, b);
                    break;
                case "/":
                    result = calc.div(a, b);
                    break;
                case "%":
                    result = calc.mod(a, b);
                    break;
                default:
                    System.out.println("無効な演算子です😹");
                    break;
            }
            System.out.println("結果：" + result);

            System.out.print("続けますか？(y/n)：");
            String answer =scanner.next();

            if (answer.equals("y")){
                y = true;
            }else {
                y = false;
            }
        }
    }
}
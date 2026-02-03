package calculator;

public class Main {
    public static void main(String[] args){
        //Calculator(クラス名)、calc(変数名・自由に決められる)
        //new Calculator()(Calculator の実体（オブジェクト）を作る処理)
        Calculator calc = new Calculator();
        //初期化＋代入
        int result1 = calc.add(3, 5);
        System.out.println("足し算結果：" + result1);

        int result2 = calc.subtract(6, 2);
        System.out.println("引き算結果：" + result2);

        int result3 = calc.multiply(4, 7);
        System.out.println("掛け算結果："+ result3);

        int result4 = calc.div(9, 3);
        System.out.println("割り算結果："+ result4);
    }
}

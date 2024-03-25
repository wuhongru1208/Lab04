package Lab04;

import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("請輸入學生人數:");
        int a = n.nextInt();

        double[] scores = new double[a];
        double sum = 0;

        for (int i = 0; i < a; i++) {
            System.out.printf("第%d個學生的成績:", i + 1);
            scores[i] = n.nextDouble();
            sum += scores[i];
        }

        System.out.printf("人數:%d\n", a);
        System.out.printf("總分:%.2f\n", sum);
        System.out.printf("平均:%.6f", (sum / a));
    }
}
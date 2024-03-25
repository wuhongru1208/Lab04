package Lab04;

import java.util.Scanner;

public class JPA401 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        int a = 0;

        System.out.println("請輸入10個整數:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("請輸入%d個整數:", i + 1);
            num[i] = n.nextInt();
            if (num[i] > 60) {
                sum += num[i];
                a++;
            }
        }
        System.out.printf("陣列中大於60的有%d個\n", a);
        System.out.printf("綜合為%d\n", sum);
        System.out.printf("平均值為%.7f", ((double) sum / a));
    }
}

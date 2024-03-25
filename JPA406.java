package Lab04;

public class JPA406 {
    public static void main(String[] args) {
        int[] parkingHours = { 2, 3, 5, 8 };

        for (int hours : parkingHours) {
            int parkingFee = money(hours);
            System.out.println("停車時數:" + hours + "小時");
            System.out.println("應繳費用:" + parkingFee + "元整");
            System.out.println("--------------------");
        }
    }

    public static int money(int hours) {
        int a = 0;
        if (hours <= 2) {
            a = hours * 30;
        } else if (hours <= 4) {
            a = 2 * 30 + (hours - 2) * 50;
        } else if (hours <= 6) {
            a = 2 * 30 + 2 * 50 + (hours - 4) * 80;
        } else {
            a = 2 * 30 + 2 * 50 + 2 * 80 + (hours - 6) * 100;
        }
        return a;
    }
}

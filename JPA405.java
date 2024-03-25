package Lab04;

public class JPA405 {
    public static void main(String[] args) {
        String[] A = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        System.out.print("反轉陣列資料之前: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i != A.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            String temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }

        System.out.print("反轉陣列資料之後: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i != A.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}

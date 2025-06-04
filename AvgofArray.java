import java.util.Scanner;

public class AvgofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int len = sc.nextInt();
        System.out.print("Average : " + Avg(len));
    }

    public static int Avg(int len) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Element : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        return (sum / len);
    }
}

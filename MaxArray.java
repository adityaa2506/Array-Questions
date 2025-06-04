import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (temp<=arr[i]){
                temp=arr[i];
            }

        }
        System.out.println(temp);




    }
}


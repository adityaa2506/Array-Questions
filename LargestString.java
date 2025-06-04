import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int arr_len = sc.nextInt();
        String[] arr = new String[arr_len];
        for (int i = 0; i < arr_len; i++) {
            System.out.println("Enter String");
            arr[i]=sc.next();
        }
        int temp = arr[0].length();
        String big =arr[0] ;
        for (int i = 0; i < arr_len; i++) {
            if (arr[i].length()>=temp){
                temp = arr[i].length();
                big = arr[i];
            }
        }
        System.out.println(big);
    }
}

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to search : ");
        int search = sc.nextInt();
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (search  == arr[i]){
                index = i;
            }
        }
        System.out.print("your index is : "+index);
    }
}

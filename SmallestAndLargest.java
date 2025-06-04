import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++)

        {
            System.out.print("Enter Element : ");
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int biggest = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i]<smallest){
                smallest = arr[i];
            }
            if(arr[i]>biggest){
                biggest = arr[i];
            }
        }
        System.out.println("Diffrence between Smallest and Biggest element : " +(biggest-smallest) );

    }
}

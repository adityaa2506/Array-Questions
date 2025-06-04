import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int no_of_elements = sc.nextInt();
        int max = 0;
        int count = 0;
        int[] arr = new int[no_of_elements];
        for (int i = 0; i < no_of_elements; i++) {
            System.out.print("Enter Elements : ");
            arr[i]= sc.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < no_of_elements; i++) {
            if (arr[i]<max){
                max = arr[i];
            }
        }
        for (int i = 0; i < no_of_elements; i++) {
            if(arr[i]<max || arr[i]>max){
                arr[i] = max;
                count ++;
            }

        }
        System.out.println("Smallest number in array : "+max);
        System.out.println("Number of Steps : "+count);
    }
}


import java.util.Scanner;

class SearchAnElementInAnArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int arr_len = sc.nextInt();

        System.out.println(search(arr_len));
    }
     public static boolean search(int arr_len){
         Scanner sc = new Scanner(System.in);
         boolean found = false;
         int[] arr = new int[arr_len];

         for (int i = 0; i < arr_len; i++) {
             System.out.print("Enter "+i+" Element of Array : ");
              arr[i] = sc.nextInt();
         }
         System.out.print("Enter element to search : ");
         int find = sc.nextInt();
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]==find) {
                 found = true;
             }
             else{
                 found = false;
             }
         }
         return found;
     }
}


//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int X = scanner.nextInt();
//
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        boolean found = false;
//        for (int i = 0; i < N; i++) {
//            if (arr[i] == X) {
//                found = true;
//                break;
//            }
//        }
//
//        if (found) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}
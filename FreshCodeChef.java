import java.util.Scanner;

public class FreshCodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int arr_len = sc.nextInt();
        System.out.print("Enter the freshness chef accepts : ");
        int freshness = sc.nextInt();
        int[]items = new int[arr_len];
        int[]cost = new int[arr_len];
        int totalCost = 0;
        for (int i = 0; i < arr_len; i++) {
            System.out.print("Enter Element : ");
            items[i]=sc.nextInt();
        }
        for (int i = 0; i < arr_len; i++) {
            System.out.print("Enter cost of items : ");
            cost[i]=sc.nextInt();
        }
        for(int i = 0 ; i<arr_len;i++){
            if (items[i]>= freshness){
                totalCost = cost[i]+totalCost;
            }
        }
        System.out.print("Total Amount of fresh vegetable : " + totalCost);
    }
}

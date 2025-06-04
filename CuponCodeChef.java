import java.util.Scanner;

public class CuponCodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int no_of_items = sc.nextInt();
        int[] item = new int[no_of_items];
        int[] discounter_price = new int[no_of_items];
        int total_sum = 0;
        int discounted_sum = 0;

        for (int i = 0; i < no_of_items; i++) {
            System.out.print("Enter item price: ");
            item[i] = sc.nextInt();
            total_sum += item[i];
        }

        System.out.print("Enter Cupon Price: ");
        int cupon_price = sc.nextInt();

        System.out.print("Enter Discount Per Item: ");
        int discount_per_item = sc.nextInt();

        for (int i = 0; i < no_of_items ; i++) {
            discounter_price[i] = Math.max(0, item[i] - discount_per_item);
            discounted_sum += discounter_price[i];
        }

        System.out.println();
        if (cupon_price + discounted_sum < total_sum){
            System.out.println("Chef will use coupon.");
        } else {
            System.out.println("Chef will not use any coupon.");
        }

        System.out.println("\nOriginal Item Prices:");
        for (int price : item) {
            System.out.print(price + "  ");
        }

        System.out.println("\nDiscounted Item Prices:");
        for (int price : discounter_price) {
            System.out.print(price + "  ");
        }

        System.out.println("\n\nOriginal Total: " + total_sum);
        System.out.println("Total After Discount + Coupon Cost: " + (cupon_price + discounted_sum));
    }
}

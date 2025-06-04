public class MergeArraySpecifiedIndex {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int[] b = {5, 6, 7};
        int index = 2;

        // Validate inputs

        // Create merged array
        int[] aAndb = new int[a.length + b.length];

        // Copy elements from a before index
        for (int i = 0; i < index; i++) {
            aAndb[i] = a[i];
        }

        // Copy elements from b at index
        for (int i = 0; i < b.length; i++) {
            aAndb[index + i] = b[i];
        }

        // Copy remaining elements from a after b
        for (int i = index; i < a.length; i++) {
            aAndb[index + b.length] = a[i];
        }

        // Print merged array
        for (int value : aAndb) {
            System.out.print(value + " ");
        }
    }
}
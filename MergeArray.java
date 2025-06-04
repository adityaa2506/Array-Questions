public class MergeArray {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int[]b = {5,6,7};
        int[] aAndb = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            aAndb[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            aAndb[a.length+i] = b[i];
        }

        for (int i = 0; i < aAndb.length; i++) {
            System.out.print(aAndb[i]+" ");
        }
    }


}

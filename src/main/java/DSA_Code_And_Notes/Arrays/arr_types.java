package DSA_Code_And_Notes.Arrays;

public class arr_types {

    public static int sum(int[] x) {
        int total = 0;
        for (int x1 : x) {
            total = total + x1;
        }
        return total;
    }

    public static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }

    // Array Declaration
    public static void main(String[] arg) {
        // 1-d Array
        int[] a = new int[4];
        System.out.println(a[0]); // 0
        System.out.println(a[1]); // 0
        System.out.println(a[2]); // 0
        System.out.println(a[3]); // 0
        System.out.println(a); // [I@2c7b84de

        // 2-d Array
        int[][] b = new int[2][2];
        System.out.println(b[0][0]); // 0
        System.out.println(b[0][1]); // 0
        System.out.println(b[1][0]); // 0
        System.out.println(b[1][1]); // 0
        System.out.println(b[0]); // [I@2c7b84de
        System.out.println(b[1]); // [I@3fee733d
        System.out.println(b); // [[I@1f32e575

        // 3-d Array
        int[][][] c = new int[2][2][2];
        System.out.println(c[0][0][0]); // 0
        System.out.println(c[0][0][1]); // 0
        System.out.println(c[0][1][0]); // 0
        System.out.println(c[0][1][1]); // 0
        System.out.println(c[0][0]); // [I@5acf9800
        System.out.println(c[0][1]); // [I@4617c264
        System.out.println(c[1][0]); // [I@36baf30c
        System.out.println(c[1][1]); // [I@7a81197d
        System.out.println(c[0]); // [[I@5ca881b5
        System.out.println(c[1]); // [[I@24d46ca6
        System.out.println(c); // [[[I@2a84aee7

        // Multidimensional Array
        int[][] d = new int[2][];
        d[0] = new int[3];
        d[1] = new int[2];

        // Example of 3-d array
        int[][][] e = new int[2][][];
        e[0] = new int[3][];
        e[0][0] = new int[1];
        e[0][1] = new int[2];
        e[0][2] = new int[3];
        e[1] = new int[2][2];

        // Example of 2-d array
        int[][] a1, b1;
        a1 = new int[4][4];
        b1 = new int[6][5];
        System.out.println(a1[0][0]); // 0
        System.out.println(b1[0][0]); // 0

        System.out.println(a1.length); // 4
        System.out.println(a1[0].length); // 4

        System.out.println(b1.length); // 6
        System.out.println(b1[0].length); // 5

        // Anonymous Arrays
        System.out.println(sum(new int[] { 10, 20, 30, 40 }));
        int[] f = new int[] { 10, 20, 30, 40 }; // (valid)
        display(f);
        System.out.println(sum(f));

        // int[][] f1 = new int[][]{{10,20},{30,40}}; // (valid)
    }

}

package DSA_Code_And_Notes.Arrays;

public class arr_creation_and_initialization {

    // Array Construction [ Creation ]
    /*
     * public static void main(String[] args) {
     * // int[] a = new int[]; // [invalid] array dimension missing
     * // int[] x = new int{10,20,30}; // wrong declaration
     * // int[] a1,[]b1; // invalid ---> []b1
     * 
     * int[] x = new int[0]; // [valid] With size zero
     * System.out.println(x.length); // 0
     * 
     * // int y = new int[10l]; // [invalid - possible loss of precision] long value
     * can't be stored in arrary
     * // int y1 = new int[10.5]; // [invalid - possible loss of precision] float
     * value can't be stored in arrary
     * // only - byte, short, char, int
     * 
     * // int[][] a=new int[][4]; // [invalid] --> ']' expected
     * // int[][][] a=new int[3][][5]; // [invalid] --> ']' expected(invalid)
     * 
     * int[][] f = new int[2][];
     * System.out.println(f); // [[I@3e25a5
     * System.out.println(f[0]); // null
     * System.out.println(f[0][0]); // R.E:NullPointerException
     * }
     */

    // Array Initialization
    public static void main(String[] args) {

        arr_creation_and_initialization obj = new arr_creation_and_initialization();
        System.out.println(obj.hashCode());
        int[] a = new int[3];
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println("a[0] = " + a[0] + " " + "a[1] = " + a[1] + " " + "a[2] = " + a[2]);

        int[] x = new int[1];
        int[][] y = new int[2][3];
        int[][][] z = new int[3][4][5];
        System.out.println("x= " + x + " " + "Y= " + y + " " + "Z= " + z);

        int[] x1 = { 10, 20, 30 };
        System.out.println("x1[0] = " + x1[0] + " " + "x1[1] = " + x1[1] + " " + "x1[2] = " + x1[2]);

    }
}
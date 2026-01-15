package DSA_Code_And_Notes.Arrays;

public class arr_problems {
    public static void main(String[] args) {
        double[] d = new double[3]; // read as double one dimensional array
        System.out.println(d);

        // int a[] = new int[0]; // read as integer one dimensional array
        int[] a = { 1, 3, 5, 7, 9 };
        System.out.println(a);

        // int b[][] = new int[2][2]; // read as integer two dimensional array
        int[][] b = { { 10, 20 }, { 30, 40 } };
        System.out.println(b);

        // int[][][] c = new int[2][2][2]; // read as integer three dimensional array
        int[][][] c = { { { 5, 15 }, { 25, 35 } }, { { 45, 55 }, { 65, 75 } } };
        System.out.println(c);

        System.out.println("\n");
        System.out.println(c);
        // (3-D Array)
        System.out.println(c[0]);
        System.out.println(c[1]);

        // (2-D Array)
        System.out.println(c[0][0]);
        System.out.println(c[0][1]);
        System.out.println(c[1][0]);
        System.out.println(c[1][1]);

        // (1-D Array)
        System.out.println(c[0][0][0]);
        System.out.println(c[0][0][1]);
        System.out.println(c[0][1][0]);
        System.out.println(c[0][1][1]);

        System.out.println(c[1][0][0]);
        System.out.println(c[1][0][1]);
        System.out.println(c[1][1][0]);
        System.out.println(c[1][1][1]);

        // int[] e = new int[-1]; // run-time exception

        // CTM POINT

        /*
         * 
         * int[] x = { 10 , 20 , 30 , 40 , 50 , 60 , 70 };
         * int[] y = { 80 , 90 };
         * 
         * x=y; //(valid)
         * System.out.println( x[0] + " " + x[1] );
         * System.out.println( x[2] ); // Index 2 out of bounds for length 2
         * 
         * y=x; //(valid)
         * System.out.println( y[0] + " " + y[1] + " " + y[2] + " " + y[3] + " " + y[4] + " " + y[5] + " " + y[6] );
         * System.out.println( y[7] ); // Index 7 out of bounds for length 7
         * 
         */
    }
}
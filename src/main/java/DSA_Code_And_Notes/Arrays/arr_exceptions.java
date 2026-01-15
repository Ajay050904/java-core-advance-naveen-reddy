package DSA_Code_And_Notes.Arrays;

public class arr_exceptions {
    public static void main(String[] args) {
        int[][][] A = { { { 10, 20, 30 }, { 40, 50 } }, { { 60 }, { 70, 80 }, { 90, 100, 110 } } };

        System.out.println(A[0]); // { {10,20,30},{40,50} }
        System.out.println(A[1]); // { {60},{70,80},{90,100,110} }

        System.out.println(A[0][0]); // {10,20,30}
        System.out.println(A[0][1]); // {40,50}
        System.out.println(A[1][0]); // {60}
        System.out.println(A[1][1]); // {70,80}
        System.out.println(A[1][2]); // {90,100,110}

        System.out.println(A[0][0][0]); // 10
        System.out.println(A[0][0][1]); // 20
        System.out.println(A[0][0][2]); // 30
        // System.out.println(A[0][0][3]); // ArrayIndexOutOfBoundsException

        System.out.println(A[0][1][0]); // 40
        System.out.println(A[0][1][1]); // 50
        // System.out.println(A[0][1][2]); // ArrayIndexOutOfBoundsException

        System.out.println(A[1][0][0]); // 60
        // System.out.println(A[1][0][1]); // ArrayIndexOutOfBoundsException

        System.out.println(A[1][1][0]); // 70
        System.out.println(A[1][1][1]); // 80
        // System.out.println(A[1][1][2]); // ArrayIndexOutOfBoundsException

        System.out.println(A[1][2][0]); // 90
        System.out.println(A[1][2][1]); // 100
        System.out.println(A[1][2][2]); // 110
        // System.out.println(A[1][2][2]); // ArrayIndexOutOfBoundsException

    }

}

package Day_01;

public class TypeCastingDemo {

    public static void main(String[] args) {

        // Widening Casting (small → large)
        int num = 10;
        double doubleNum = num;

        System.out.println("Widening Casting:");
        System.out.println("int value: " + num);
        System.out.println("double value: " + doubleNum);

        // Narrowing Casting (large → small)
        double decimalValue = 99.99;
        int intValue = (int) decimalValue;

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + decimalValue);
        System.out.println("int value: " + intValue);
    }
}

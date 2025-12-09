@FunctionalInterface
interface A {
    void showNumber(int n);
}

public class Demo3 {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void showNumber(int n) {
                System.out.println(n);
            }
        };
        obj.showNumber(5);
    }
}

@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

class Demo2 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show();

        // If we don't want to create a class B
        A obj2 = new A() {
            @Override
            public void show() {
                System.out.println("In new show");
            }
        };
        obj2.show();

        // By using lambda expression - [only used in functional interface]
        A obj3 = () -> {
            System.out.println("In new new show");
        };
        obj3.show();

        // If only one statement inside a method then we can remove {}
        A obj4 = () -> System.out.println("In new new new show");
        obj4.show();
    }
}
package interfaces;

class Parent {
    // Parent() {
    // System.out.println("Parent class 0 param constructor" );
    // }
    Parent(int i) {
        System.out.println("Parent class 1 param constructor");
    }
}

class Child extends Parent {
    Child() {
        super(5);
        System.out.println("Child class 0 param constructor");
    }
}

class Test {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Child c = new Child();
    }
}

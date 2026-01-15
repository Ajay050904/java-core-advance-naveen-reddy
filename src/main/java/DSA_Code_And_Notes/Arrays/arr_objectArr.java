package DSA_Code_And_Notes.Arrays;

class student {
    public void studentobject() {
        System.out.println("StudentObject");
    }
}

class customer {
    public void customerobject() {
        System.out.println("CustomerObject");
    }
}

public class arr_objectArr {

    public static void main(String[] args) {

        Object[] ob = new Object[50];

        // for (int i = 0; i < 20; i++) {
        // ob[i] = new student();
        // // System.out.println(ob[i]);
        // student s1 = new student();
        // s1.studentobject(); // 20 times print hoga [StudentObject]
        // }

        // for (int j = 0; j < 30; j++) {
        // ob[j] = new customer();
        // // System.out.println(ob[j]);
        // customer s1 = new customer();
        // s1.customerobject(); // 30 times print hoga [CustomerObject]
        // }

        // for(int k=0; k<20; k++) {
        // student s1 = new student();
        // s1.studentobject();
        // }

        // for(int l=0; l<30; l++) {
        // customer s1 = new cutomer();
        // s1.cutomerobject();
        // }

        // for(int m = 0; m < 60; m++) {
        // ob[m] = new customer(); // ArrayIndexOutOfBoundsException: Index 50 out of
        // bounds for length 50
        // ob[m] = new student(); // ArrayIndexOutOfBoundsException: Index 50 out of
        // bounds for length 50
        // }

        for (int n = 0; n < 50; n++) {
            ob[n] = new customer();
            ob[n] = new student();
        }
    }
}

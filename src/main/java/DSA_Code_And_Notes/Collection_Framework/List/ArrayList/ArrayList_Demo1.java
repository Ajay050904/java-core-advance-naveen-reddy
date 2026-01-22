package DSA_Code_And_Notes.Collection_Framework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);

        System.out.println(list); // [10, 20, 10]
        System.out.println(list.get(1)); // 20
    }
}
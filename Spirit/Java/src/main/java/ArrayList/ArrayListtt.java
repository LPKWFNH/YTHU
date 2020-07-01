package ArrayList;

import java.util.ArrayList;

public class ArrayListtt {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(3, "D");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.remove("D"));
        System.out.println(arrayList.remove(2));
        arrayList.set(1, "BBB");
    }
}

package basic.generic;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        intList.add(1);
        System.out.println(intList);
        System.out.println(intList.isEmpty());
        System.out.println(stringList.isEmpty());
        System.out.println(intList.indexOf(1));
    }
}

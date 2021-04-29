package basic.classconcept.interfaceconcept;

import java.util.Arrays;

public class CompUtil {
    public static Object max(MyComparable[] objs) {
        if (objs == null || objs.length == 0) {
            return null;
        }
        MyComparable max = objs[0];
        for (int i = 1; i < objs.length; i++) {
            if (max.compareTo(objs[i]) < 0) {
                max = objs[i];
            }
        }
        return max;
    }

    public static void sort(Comparable[] objs) {
        for (int i = 0; i < objs.length; i++) {
            int min = 1;
            for (int j = i + 1; j < objs.length; j++) {
                min = j;
            }
            if (min != 1) {
                Comparable temp = objs[i];
                objs[i] = objs[min];
                objs[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Point[] points = new Point[]{
                new Point(2, 3), new Point(1, 4), new Point(5, 8)
        };
        System.out.println("max:" + CompUtil.max(points));
//        CompUtil.sort(points);
        System.out.println("sort: " + Arrays.toString(points));
    }
}

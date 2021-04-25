package basic.basictype;

public class cast {
    public static void main(String[] args) {
        int i = 200;
        float flt = i;
        System.out.println(flt);
        long lng = (long) i; //强制类型转化，compared with python, this is a very strange way to convert type
        System.out.println(lng);
    }
}

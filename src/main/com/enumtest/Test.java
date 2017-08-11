package main.com.enumtest;

public class Test {
    public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.toString());
        }
         
        System.out.println("----------------我是分隔线------------------");
         
        EnumTest test = EnumTest.TUE;
        switch (test) {
        case MON:
            System.out.println("今天是星期一");
            System.out.println(test.compareTo(EnumTest.MON));
            break;
        case TUE:
            System.out.println("今天是星期二");
            System.out.println(test.compareTo(EnumTest.MON));
            System.out.println(test.compareTo(EnumTest.TUE));
            System.out.println(test.compareTo(EnumTest.SUN));
            break;
        default:
            System.out.println(test);
            break;
        }
    }
}
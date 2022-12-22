public class Main {
    public static void main(String[] args) {
        test ();
        task1 ();
        task2 ();
        task3 ();
    }
    public static void test () {System.out.println("Тест");
        float sugar =3;
        float onePortion = sugar/4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг.");
        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);
        byte a1 = 1;
        float g = a1 + 1f;
        System.out.println(g);
    }
    public static void task1 () {System.out.println("Задача 1");
        byte firstList = -128;
        short twoList = -32768;
        int tripleList = 2147483647;
        long bigList = -9223372036854775807L;
        float masterList = -3.4E+38f;
        double mvpList = -1.7E+308;

    }
    public static void task2 () {System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {System.out.println("Задача 3");

    }
}
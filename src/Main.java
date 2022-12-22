public class Main {
    public static void main(String[] args) {
        test ();
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
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
        System.out.println(firstList+twoList+tripleList+bigList+masterList+mvpList);

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
        byte ludmilaPa = 23;
        byte annaSe = 27;
        byte ekaterinaAn = 30;
        short sheet = 480;
        short sheetOneStudent = (short) (sheet / (ludmilaPa + annaSe + ekaterinaAn));
        System.out.println("На одного ученика уходит по " + sheetOneStudent + " листов.");
    }
    public static void task4 () {System.out.println("Задача 4");
        byte powerMachine = 16;
        byte timePowerMachine = 2;
        byte timeHour = 60;
        byte timeDay = 12;
        byte timeMonth = 30;
        short powerTwentyMinutes = (short) (20/timePowerMachine*powerMachine);
        System.out.println("За 20 минут работы, машина произведет: " + powerTwentyMinutes + " штук бутылок.");
        short powerDay = (short) (timeDay * timeHour / timePowerMachine * powerMachine);
        System.out.println("За сутки работы, машина произведет: " + powerDay + " штук бутылок.");
        short powerThereDay = (short) (3 * timeDay * timeHour / timePowerMachine * powerMachine);
        System.out.println("За трое суток работы, машина произведет: " + powerThereDay + " штук бутылок.");
        int powerMonth = timeMonth * timeDay * timeHour / timePowerMachine * powerMachine;
        System.out.println("За месяц работы, машина произведет: " + powerMonth + " штук бутылок.");
    }
    public static void task5 () {System.out.println("Задача 5");
        byte whiteColor = 2;
        byte brownColor = 4;
        byte allColor = 120;
        short allClass = (short) (allColor / (whiteColor+brownColor));
        short allWhiteColor = (short) (allClass * whiteColor);
        short allBrownColor = (short) (allClass * brownColor);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteColor + " банок белой краски и " + allBrownColor + " банок коричневой краски");
    }
    public static void task6 () {System.out.println("Задача 6");
        byte banans = 5;
        byte weightGramOneBananas = 80;
        short milk = 200;
        byte weightAHundreadGramMilkMl = 105;
        byte iceCream = 2;
        byte weightGramOneIceCream = 100;
        byte egg = 4;
        byte weightGramOneEgg = 70;
        short allWeightGramm = (short) ((banans*weightGramOneBananas) +
                        (milk/100*weightAHundreadGramMilkMl) +
                        (iceCream * weightGramOneIceCream) +
                        (egg*weightGramOneEgg));
        System.out.println(allWeightGramm);
        float inOmeKgGramm = 1000f;
        float allKg = allWeightGramm / inOmeKgGramm;
        System.out.println("По итогу завтрак будет весить: " + allKg + " кг.");
    }
    public static void task7 () {System.out.println("Задача 7");
        byte weight = 7;
        short inOneKgGramm = 1000;
        short fromGram = 250;
        short toGram = 500;
        short howManyDayFromMin = (short) (weight*inOneKgGramm/fromGram);
        short howManyDayFromMax = (short) (weight*inOneKgGramm/toGram);
        short howManyDayFromVerage = (short) ((howManyDayFromMax+howManyDayFromMin)/2);
        System.out.println("Если спортсмену нужно сбросить 7кг, то теряя по 250 грамм спортсмен похудеет за "
                + howManyDayFromMin + " дней, если будет терять по 500 грамм, то похудеет за "
                + howManyDayFromMax + " дней. В среднем спортмен потратит " + howManyDayFromVerage + " дней.");
    }
    public static void task8 () {System.out.println("Задача 8");
        byte oneYearInMonth = 12;
        float s10 = 1.1f;
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int rasingM = (int) (masha*s10);
        int rasingD = (int) (denis*s10);
        int rasingK = (int) (kristina*s10);
        int allYearM = masha * oneYearInMonth;
        int allYearUpM = rasingM * oneYearInMonth;
        int allYearD = denis * oneYearInMonth;
        int allYearUpD = rasingD * oneYearInMonth;
        int allYearK = kristina * oneYearInMonth;
        int allYearUpK = rasingK * oneYearInMonth;
        int verageM = allYearUpM - allYearM;
        int verageD = allYearUpD - allYearD;
        int verageK = allYearUpK - allYearK;
        System.out.println("Маша теперь получает " + rasingM + " рублей. Годовой доход вырос на " + verageM + " рублей.");
        System.out.println("Денис теперь получает " + rasingD + " рублей. Годовой доход вырос на " + verageD + " рублей.");
        System.out.println("Кристина теперь получает " + rasingK + " рублей. Годовой доход вырос на " + verageK + " рублей.");
    }
}
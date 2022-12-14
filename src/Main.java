public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int one = 111;
        byte two = 22;
        short three = 654;
        long four = 999434L;
        float five = 123.456f;
        double six = 321.987;
        System.out.println("Значение переменной int с типом one равно " + one);
        System.out.println("Значение переменной byte с типом two равно " + two);
        System.out.println("Значение переменной short с типом three равно " + three);
        System.out.println("Значение переменной long с типом four равно " + four);
        System.out.println("Значение переменной float с типом five равно " + five);
        System.out.println("Значение переменной double с типом six равно " + six);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short ss = -159;
        int i = 27897;
        byte b = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int studentsLp = 23;
        int studentsAc = 27;
        int studentsEa = 30;
        int totalPaper = 480;
        int paperForStudent = totalPaper / (studentsAc+studentsEa+studentsLp);
        System.out.println("На каждого ученика рассчитано: " + paperForStudent + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int mpTwoMin = 16; // Производительность машины за 2 минуты
        int mpOneMin = mpTwoMin / 2; // Производительность машины за 1 минуту
        int mpTwentyMin = mpOneMin * 20; // Производительность машины за 20 минут
        int mpOneDay = mpOneMin * 60 * 24; // Производительность машины за 24 часа
        int mpThreeDay = mpOneDay * 3; // Производительность машины за 3 дня
        int mpOneMonth = mpOneDay * 31; // Производительность машины за 31 дней
        System.out.println("За 1 минуту машина произвела " + mpOneMin + " бутылок.");
        System.out.println("За 2 минуты машина произвела " + mpTwoMin + " бутылок.");
        System.out.println("За 20 минуты машина произвела " + mpTwentyMin + " бутылок.");
        System.out.println("За 24 часов машина произвела " + mpOneDay + " бутылок.");
        System.out.println("За 3 дня машина произвела " + mpThreeDay + " бутылок.");
        System.out.println("За 1 месяц машина произвела " + mpOneMonth + " бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int allPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int allClasses = allPaint / oneClass;
        int allWhitePaint = whitePaint * allClasses;
        int allBrownPaint = brownPaint * allClasses;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhitePaint + " банок белой краски и "
                + allBrownPaint + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int breakfastGram = weightBanana * 5 + weightMilk * 2 + weightIceCream * 2 + weightEgg * 4;
        double  breakfastKg = breakfastGram*0.001;
        System.out.println("Завтрак спортсмена: " + breakfastGram + " грамм");
        System.out.println("Завтрак спортсмена: " + breakfastKg + "кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int totalLoseWeightKg = 7;
        int minLoseWeightDay = 250;
        int maxLoseWeightDay = 500;
        int minDayAll = totalLoseWeightKg *1000/ minLoseWeightDay;
        int maxDayAll = totalLoseWeightKg *1000/ maxLoseWeightDay;
        int averageDayAll = (minDayAll+ maxDayAll)/2;
        System.out.println("Спортсмен сбросит вес при минимуме через " + minDayAll + " дней" );
        System.out.println("Спортсмен сбросит вес при максимуме через " + maxDayAll + " дней" );
        System.out.println("Спортсмен сбросит вес при среднем через "+ averageDayAll +" дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67670;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int increaseSalary = 10;
        int mashaNewSalary = mashaSalary + mashaSalary*increaseSalary/100;
        int denisNewSalary = denisSalary + denisSalary*increaseSalary/100;
        int kristinaNewSalary = kristinaSalary + kristinaSalary*increaseSalary/100;
        int mashaYearSalary = mashaSalary * 12;
        int mashaNewYearSalary = mashaNewSalary *12;
        int denisYearSalary = denisSalary * 12;
        int denisNewYearSalary = denisNewSalary * 12;
        int kristinaYearSalary = kristinaSalary * 12;
        int kristinaNewYearSalary = kristinaNewSalary * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaNewYearSalary-mashaYearSalary) + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisNewYearSalary-denisYearSalary) + " рублей");
        System.out.println("Маша теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaNewYearSalary-kristinaYearSalary) + " рублей");
    }

}

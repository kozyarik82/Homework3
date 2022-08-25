public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte book = 2;
        System.out.println(" Значение переменной book с типом byte равно " + book);
        int words = 39257;
        System.out.println(" Значение переменной words с типом int равно " + words);
        short pages = 350;
        System.out.println(" Значение переменной pages с типом short равно " + pages);
        long letters = 2000L;
        System.out.println(" Значение переменной letters с типом long равно " + letters);
        float elephantWeight = 527.5f;
        System.out.println(" Значение переменной elephantWeight с типом float равно " + elephantWeight + " кг");
        double insectWeight = 0.003;
        System.out.println(" Значение переменной insectWeight с типом double равно " + insectWeight + " кг");

        // Задача 2
        float ropeLenght = 27.12f;
        System.out.println(" Длина веревки - " + ropeLenght + " метров ");
        long bacteria = 987678965549L;
        System.out.println(" Колличество бактерий на 1 см кожи - " + bacteria + " штук");
        byte house = 2;
        System.out.println(" За год построили " + house + " новых дома");
        int workers = 786;
        System.out.println(workers + " работников принято на работу");
        boolean city = house > 20;
        System.out.println(city);
        short citizen = 569;
        System.out.println(" В доме живет " + citizen + " человек");
        double money = -159;
        System.out.println(" На вашем счету: " + money + " рублей");
        int number = 27897;
        System.out.println(" Ваша очередь № " + number + " не приходите больше! ");
        byte books = 67;
        System.out.println("Если все же ждете очередь, то сможете прочитать " + books + " книг");
        char symbol = 36;
        System.out.println(symbol);

        // Задача 3
        byte peopleClassOne = 23;
        byte peopleClassTwo = 27;
        byte peopleClassThree = 30;
        int papers = 480;
        int totalPeoples = peopleClassOne + peopleClassTwo + peopleClassThree;
        int paperOnePeople = papers / totalPeoples;
        System.out.println(" На каждого ученика рассчитано " + paperOnePeople + " листов бумаги");

        // Задача 4
        short bottlesTwoMinutes = 16;
        int bottlesOneMinut = bottlesTwoMinutes / 2;
        int bottles20Minut = bottlesOneMinut * 20;
        int bottlesHour = bottlesOneMinut * 60;
        int bottlesDay = bottlesHour * 24;
        int bottlesThreeDay = bottlesDay * 3;
        long bottlesMonth = bottlesDay * 30;
        System.out.println(" За 20 минут машина произвела бутылок: " + bottles20Minut + " штук ");
        System.out.println(" За сутки машина произвела бутылок: " + bottlesDay + " штук ");
        System.out.println(" За 3 дня машина произвела бутылок: " + bottlesThreeDay + " штук ");
        System.out.println(" За 1 месяц машина произвела бутылок: " + bottlesMonth + " штук ");

        // Задача 5
        short totalPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        int totalClass = totalPaint / (whitePaintClass + brownPaintClass);
        int totalWhitePaint = totalClass * whitePaintClass;
        int totalBrownPaint = totalClass * brownPaintClass;
        System.out.println(" В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски ");

        // Задача 6
        float bananaWeight = 80f;
        float bananasPortion = bananaWeight * 5;
        float milkWeight = 105f;
        float milkPortion = milkWeight * 2;
        float creamWeight = 100f;
        float creamPortion = creamWeight * 2;
        float eggWeight = 70f;
        float eggsPortion = eggWeight * 4;
        float mealGrams = bananasPortion + milkPortion + creamPortion + eggsPortion;
        double mealKg = mealGrams / 1000;
        System.out.println(" Один прием пищи одного спортсмена весит : " + mealKg + " кг");

        // Задача 7
        int loseWeightKg = 7;
        int loseWeightGram = loseWeightKg * 1000;
        int loseWeightDayA = 250;
        int loseWeightDayB = 500;
        int totalDaysA = loseWeightGram / loseWeightDayA;
        int totalDaysB = loseWeightGram / loseWeightDayB;
        int averageDays = (totalDaysA + totalDaysB) / 2;
        System.out.println(" Чтобы сбросить " + loseWeightKg + " кг веса, спортсмену потребуется " + totalDaysA + " дней, если он будет терять по " + loseWeightDayA + " гр. ежедневно, и " + totalDaysB + " дней, если он будет терять по " + loseWeightDayB + " гр. ежедневно, в среднем диета может занять " + averageDays + " день");

        // Задача 8
        float incomeMonthMarie = 67760f;
        float incomeMonthDenis = 83690f;
        float incomeMonthKris = 76230f;
        float increaseMonthMarie = (incomeMonthMarie /100 * 10) + incomeMonthMarie;
        float increaseMonthDenis = (incomeMonthDenis / 100 * 10) + incomeMonthDenis;
        float increaseMonthKris = (incomeMonthKris / 100 * 10) + incomeMonthKris;
        float incomeYearMarie = incomeMonthMarie * 12;
        float incomeYearDenis = incomeMonthDenis * 12;
        float incomeYearKris = incomeMonthKris * 12;
        float increaseYearMarie = increaseMonthMarie * 12;
        float increaseYearDenis = increaseMonthDenis * 12;
        float increaseYearKris = increaseMonthKris * 12;
        float differenceYearMarie = increaseYearMarie % incomeYearMarie;
        float differenceYearDenis = increaseYearDenis % incomeYearDenis;
        float differenceYearKris = increaseYearKris % incomeYearKris;
        System.out.println(" Маша теперь получает " + increaseMonthMarie + " рублей. Годовой доход вырос на " + differenceYearMarie + " рублей");
        System.out.println(" Денис теперь получает " + increaseMonthDenis + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей");
        System.out.println(" Кристина теперь получает " + increaseMonthKris + " рублей. Годовой доход вырос на " + differenceYearKris + " рублей");



    }
}
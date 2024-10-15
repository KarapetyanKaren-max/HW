public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int egg = 121;
        System.out.println("Значение переменной egg с типом int = 121");
        byte box = 20;
        System.out.println("Значение переменной box с типом byte = 20");
        short banana = 40;
        System.out.println("Значение переменной Short с типом short = 40");
        long stick = 2342340000L;
        System.out.println("Значение переменной stick с типом Long = 2342340000L");
        float degree = 23.0325F;
        System.out.println("Значение переменной degree с типом Float = 23.0325f");
        double pen = 35.2;
        System.out.println("Значение переменной pen с типом Double = 35.2");


        double a = 27.12;
        System.out.println("double 27.12");
        long b = 987678965549L;
        System.out.println("long 987678965549L");
        float c = 2.786F;
        System.out.println("float 2.786F");
        int d = 569;
        System.out.println("int 569");
        short e = -159;
        System.out.println("short -159");
        int f = 27897;
        System.out.println("int 27897");
        byte g = 67;
        System.out.println("byte 67");

        int studentsOfClass1 = 23;
        System.out.println(23);
        int studentsOfClass2 = 27;
        System.out.println(27);
        int studentsOfClass3 = 30;
        System.out.println(30);
        int totalSheets = 480;
        System.out.println(480);

        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;
        System.out.println(studentsOfClass1 + studentsOfClass2 + studentsOfClass3);
        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        int bottlesIn2Minute = 16;
        int bottlesInMinute = 8;
        int minutesInDay = 1440;
        int minutesInThreeDays = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;
        int bottlesIn20minutes = bottlesInMinute * 20;

        int bottlesInDay = bottlesInMinute * minutesInDay;
        int bottlesIn3Days = bottlesInMinute * minutesInThreeDays;
        int bottlesInMonth = bottlesInMinute * minutesInMonth;

        System.out.println("за 20 минут машина произвела " + bottlesIn20minutes + " штук бутылок");
        System.out.println("за сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("за 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("за месяц машина произвела " + bottlesInMonth + " штук бутылок");

        byte totalCans = 120;
        System.out.println(totalCans);
        byte whiteCansPerClass = 2;
        System.out.println(whiteCansPerClass);
        byte brownCansPerClass = 4;
        System.out.println(brownCansPerClass);

        int totalСlasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        System.out.println(totalСlasses);
        int totalWhiteCans = totalСlasses * whiteCansPerClass;
        System.out.println(totalWhiteCans);
        int totalBrownCans = totalСlasses * brownCansPerClass;
        System.out.println(totalBrownCans);

        System.out.println("В школе, где " + totalСlasses + " классов" + ", нужно " + totalWhiteCans + " банок белой краскт " + totalBrownCans + " и" + " банок коричневой краски");

        int bananaCount = 5;
        System.out.println(bananaCount);
        int bananaWeight = 80;
        System.out.println(bananaWeight);
        int milkVolume = 200;
        System.out.println(milkVolume);
        int milkWeightGr = 105;
        System.out.println(milkWeightGr);
        int iceCreamWeight = 200;
        System.out.println(iceCreamWeight);
        int eggsCount = 4;
        System.out.println(eggsCount);
        int eggsWeight = 70;
        System.out.println(eggsWeight);

        int totalWeightGr = bananaCount * bananaWeight + milkVolume * milkWeightGr / 100 + iceCreamWeight + eggsCount * eggsWeight;
        System.out.println(totalWeightGr);
        double totalWeightInnKg = (double) totalWeightGr / 1000.0;
        System.out.println(totalWeightInnKg);

        int weightLossGoalKg = 7;
        System.out.println(weightLossGoalKg);
        double dailyWeightLossLowKg = 0.25;
        System.out.println(dailyWeightLossLowKg);
        double dalyWeightLossHighKg = 0.5;
        System.out.println(dalyWeightLossHighKg);

        int daysLow = (int) ((double) weightLossGoalKg / dailyWeightLossLowKg);
        System.out.println(daysLow);
        int daysHigh = (int) ((double) weightLossGoalKg / dalyWeightLossHighKg);
        System.out.println(daysHigh);

        int daysAverage = (daysLow + daysHigh) / 2;
        System.out.println(daysAverage);

        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double mashaNewSalary = (double) ((double) mashaSalary * 1.1);
        double denisNewSalary = (double) ((double) denisSalary * 1.1);
        double kristinaNewSalary = (double) ((double) kristinaSalary * 1.1);

        double mashaSalaryBeforeIndexation = mashaSalary * 12;
        double denisSalaryBeforeIndexation = denisSalary * 12;
        double kristinaSalaryBeforeIndexation = kristinaSalary * 12;

        double mashaSalaryAfterIndexation = mashaNewSalary * 12;
        double denisSalaryAfterIndexation = denisNewSalary * 12;
        double kristinaAfterBeforeIndexation = kristinaNewSalary * 12;

        double mashaDifferenceBetweenAnnualIncome = mashaSalaryAfterIndexation - mashaSalaryBeforeIndexation;
        double denisDifferenceBetweenAnnualIncome = denisSalaryAfterIndexation - denisSalaryBeforeIndexation;
        double kristinaDifferenceBetweenAnnualIncome = kristinaAfterBeforeIndexation - kristinaSalaryBeforeIndexation;

        System.out.println(" Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос " + mashaDifferenceBetweenAnnualIncome + " рублей ");
        System.out.println(" Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос " + denisDifferenceBetweenAnnualIncome + " рублей ");
        System.out.println(" Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос " + kristinaDifferenceBetweenAnnualIncome + " рублей ");


    }
}

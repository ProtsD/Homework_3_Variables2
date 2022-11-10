public class Main {
    public static void main(String[] args) {
        //***************************** Exercise 1 *****************************
        int intVariable = 1;
        byte byteVariable = 2;
        short shortVariable = 3;
        long longVariable = 8_111_222_333L;
        float floatVariable = 5;
        double doubleVariable = 6.6;
        System.out.println("Exercise 1");
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
        //***************************** Exercise 2 *****************************
        double doubleValue = 27.12;
        long longValue = 987_678_965_549L;
        float floatValue = 2.786f;
        boolean booleanValue = false;
        char shortValue1 = 569;
        short shortValue2 = -159;
        int intValue = 27897;
        byte byteValue = 67;
        //***************************** Exercise 3 *****************************
        short pupilsOfTeacher1 = 23;
        short pupilsOfTeacher2 = 27;
        short pupilsOfTeacher3 = 30;
        short paperLists = 480;
        float paperListsPerPupil = paperLists / (pupilsOfTeacher1 + pupilsOfTeacher2 + pupilsOfTeacher3);
        System.out.println("\nExercise 3");
        System.out.println("На каждого ученика рассчитано " + paperListsPerPupil + " листов бумаги");
        //***************************** Exercise 4 *****************************
        byte bottleNumber = 16;
        short sampleTime = 2;
        int linePerformance;
        int twentyMinutes = 20;
        int minutesInDay = 24 * 60;
        int minutesInFreeDays = 3 * 24 * 60;
        int minutesInMonth = 30 * 24 * 60;
        int capacityPerMin = bottleNumber / sampleTime;
        linePerformance = twentyMinutes * capacityPerMin;
        System.out.println("\nExercise 4");
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + linePerformance + " штук");
        linePerformance = minutesInDay * capacityPerMin;
        System.out.println("За " + minutesInDay + " машина произвела бутылок " + linePerformance + " штук");
        linePerformance = minutesInFreeDays * capacityPerMin;
        System.out.println("За " + minutesInFreeDays + " суток машина произвела бутылок " + linePerformance + " штук");
        linePerformance = minutesInMonth * capacityPerMin;
        System.out.println("За " + minutesInMonth + " суток машина произвела бутылок " + linePerformance + " штук");
        //*****************************     Exercise 5 *****************************
        byte jarTotal = 120;
        int wightJar = 2;
        int brownJar = 4;
        int classrooms = jarTotal / (wightJar + brownJar);
        wightJar *= classrooms;
        brownJar *= classrooms;
        System.out.println("\nExercise 5");
        System.out.println("В школе, где " + classrooms + " классов, нужно " + wightJar + " банок белой краски и " + brownJar + " банок коричневой краски");
        //***************************** Exercise 6 *****************************
        byte bananasNum = 5;
        byte bananaWeight = 80;
        short milkAmount = 200;
        float milkWeight = 1.05f;
        byte iceCreamBreaks = 2;
        byte iceCreamWeight = 100;
        byte eggsItems = 4;
        byte eggWeight = 70;
        float breakfastWeight = bananasNum * bananaWeight + milkAmount * milkWeight + iceCreamBreaks * iceCreamWeight + eggsItems * eggWeight;
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("\nExercise 6");
        System.out.println("Общий вес завтрака:\nв граммах - " + breakfastWeight + "\nв килограммах - " + breakfastWeightKg);
        //***************************** Exercise 7 *****************************
        float weightLossStep1 = 0.25f;
        float weightLossStep2 = 0.5f;
        float targetWeightLoss = 7f;
        float weightLossDurationStep1 = targetWeightLoss / weightLossStep1;
        float weightLossDurationStep2 = targetWeightLoss / weightLossStep2;
        float weightLossDurationStepAvr = (weightLossDurationStep1 + weightLossDurationStep2) / 2;
        System.out.println("\nExercise 7");
        System.out.println("Если каждый день терять вес по " + weightLossStep1 * 1000 + " грамм, то до цели " + weightLossDurationStep1 + " дня");
        System.out.println("Если каждый день терять вес по " + weightLossStep2 * 1000 + " грамм, то до цели " + weightLossDurationStep2 + " дня");
        System.out.println("В среднем потребуется  " + weightLossDurationStepAvr + " дня");
        //***************************** Exercise 8 *****************************
        double employee1Salary = 67760;
        double employee2Salary = 83690;
        double employee3Salary = 76230;
        double salaryIncrease = 1.1;
        double employeeYearBaseSalary = employee1Salary * salaryIncrease * 12;
        double employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("\nExercise 8");
        System.out.println("Маша теперь получает " + employeeYearBaseSalary + " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");

        employeeYearBaseSalary = employee2Salary * salaryIncrease * 12;
        employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("Денис теперь получает " + employeeYearBaseSalary + " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");

        employeeYearBaseSalary = employee3Salary * salaryIncrease * 12;
        employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("Кристина теперь получает " + employeeYearBaseSalary + " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");


    }
}
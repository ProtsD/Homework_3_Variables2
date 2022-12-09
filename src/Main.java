public class Main {
    public static void main(String[] args) {

        //***************************** Exercise 1 *****************************
        /*
        Объявите переменные типа int, byte, short, long, float, double. Название переменных может быть любым, но если
        состоит из двух слов и более, должно придерживаться правила camelCase.
        Выведите в консоль значение каждой переменной в формате "Значение переменной … с типом … равно …"
        */
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
        /*
        Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
        Значения:
        27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).
        */
        double doubleValue = 27.12;
        long longValue = 987_678_965_549L;
        float floatValue = 2.786f;
        boolean booleanValue = false;
        char shortValue1 = 569;
        short shortValue2 = -159;
        int intValue = 27897;
        byte byteValue = 67;

        //***************************** Exercise 3 *****************************
        /*
        Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов
        каждому ученику.
        Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        Для объявления переменных не используйте тип var.
        */
        short pupilsOfTeacher1 = 23;
        short pupilsOfTeacher2 = 27;
        short pupilsOfTeacher3 = 30;
        short paperLists = 480;
        float paperListsPerPupil = paperLists / (pupilsOfTeacher1 + pupilsOfTeacher2 + pupilsOfTeacher3);
        System.out.println("\nExercise 3");
        System.out.println("На каждого ученика рассчитано " + paperListsPerPupil + " листов бумаги");

        //***************************** Exercise 4 *****************************
        /*
        Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины
        будет:
                за 20 минут
                в сутки
                за 3 дня
                за 1 месяц
        Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток
        времени. Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        Для объявления переменных не используйте тип var.
        */
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

        //***************************** Exercise 5 *****************************
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4
        банки коричневой краски. Сколько банок каждой краски было куплено? Выведите результат задачи в консоль в формате
        "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
        */
        byte jarTotal = 120;
        int wightJar = 2;
        int brownJar = 4;
        int classrooms = jarTotal / (wightJar + brownJar);
        wightJar *= classrooms;
        brownJar *= classrooms;
        System.out.println("\nExercise 5");
        System.out.println("В школе, где " + classrooms + " классов, нужно " + wightJar +
                " банок белой краски и " + brownJar + " банок коричневой краски");

        //***************************** Exercise 6 *****************************
        /*
        Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции. То же делают и
        спортсмены, которые сидят на правильном питании и тщательно относятся к тому, что и сколько они едят.
        Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        Бананы – 5 штук (1 банан - 80 грамм);
        Молоко – 200 мл (100 мл = 105 грамм);
        Мороженое пломбир – 2 брикета по 100 грамм;
        Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        Смешать всё в блендере и готово.
        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        Результат напечатайте в консоль.
        *** Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то
        нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить
        5 бананов по 80 грамм, то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому
        общую сумму грамм.
        */
        byte bananasNum = 5;
        byte bananaWeight = 80;
        short milkAmount = 200;
        float milkWeight = 1.05f;
        byte iceCreamBreaks = 2;
        byte iceCreamWeight = 100;
        byte eggsItems = 4;
        byte eggWeight = 70;
        float breakfastWeight = bananasNum * bananaWeight + milkAmount * milkWeight +
                iceCreamBreaks * iceCreamWeight + eggsItems * eggWeight;
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("\nExercise 6");
        System.out.println("Общий вес завтрака:\nв граммах - " + breakfastWeight +
                "\nв килограммах - " + breakfastWeightKg);

        //***************************** Exercise 7 *****************************
        /*
            Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей
        весовой категории. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в
        день. Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и
        сколько, если каждый день будет худеть на 500 грамм. Посчитайте, сколько может потребоваться дней в среднем,
        чтобы добиться результата похудения. Результаты всех подсчетов выведите в консоль.
        */
        float weightLossStep1 = 0.25f;
        float weightLossStep2 = 0.5f;
        float targetWeightLoss = 7f;
        float weightLossDurationStep1 = targetWeightLoss / weightLossStep1;
        float weightLossDurationStep2 = targetWeightLoss / weightLossStep2;
        float weightLossDurationStepAvr = (weightLossDurationStep1 + weightLossDurationStep2) / 2;
        System.out.println("\nExercise 7");
        System.out.println("Если каждый день терять вес по " + weightLossStep1 * 1000 +
                " грамм, то до цели " + weightLossDurationStep1 + " дня");
        System.out.println("Если каждый день терять вес по " + weightLossStep2 * 1000 +
                " грамм, то до цели " + weightLossDurationStep2 + " дня");
        System.out.println("В среднем потребуется  " + weightLossDurationStepAvr + " дня");

        //***************************** Exercise 8 *****************************
        /*
            Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен
        сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год
        повышение составляет 10% от текущей зарплаты.
            К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для
        следующих сотрудников:
                                Маша получает 67 760 рублей в месяц
                                Денис получает 83 690 рублей в месяц
                                Кристина получает 76 230 рублей в месяц
            Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый
        из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".
        */
        double employee1Salary = 67760;
        double employee2Salary = 83690;
        double employee3Salary = 76230;
        double salaryIncrease = 1.1;
        double employeeYearBaseSalary = employee1Salary * salaryIncrease * 12;
        double employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("\nExercise 8");
        System.out.println("Маша теперь получает " + employeeYearBaseSalary +
                " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");

        employeeYearBaseSalary = employee2Salary * salaryIncrease * 12;
        employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("Денис теперь получает " + employeeYearBaseSalary +
                " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");

        employeeYearBaseSalary = employee3Salary * salaryIncrease * 12;
        employeeYearSalaryIncrease = employeeYearBaseSalary - employee1Salary * 12;
        System.out.println("Кристина теперь получает " + employeeYearBaseSalary +
                " рублей. Годовой доход вырос на " + employeeYearSalaryIncrease + "рублей");

        //*********************************** Extra Exercise 6 ***********************************
        /*
        И снова дела банковские, уже сложнее.
        В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит
        средств, который рассчитывается исходя из возраста клиента и его зарплаты.
        Правила расчета следующие:
        Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения
        зарплаты клиента. Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в
        консоль в формате: «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        */
        int age = 25;
        double salary = 60_000;
        double k1 = 1.2;
        double k2 = 1.5;
        double salaryK1 = 50_000;
        double salaryK2 = 80_000;
        double creditLimit;
        System.out.println("\nExtra Exercise 6");
        if (age <= 23) {
            creditLimit = salary * 2;
            if (salary >= salaryK1 && salary < salaryK2) {
                creditLimit *= k1;
            } else if (salary >= salaryK2) {
                creditLimit *= k2;
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        } else {
            creditLimit = salary * 3;
            if (salary >= salaryK1 && salary < salaryK2) {
                creditLimit *= k1;
            } else if (salary >= salaryK2) {
                creditLimit *= k2;
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        }

        //*********************************** Extra Exercise 7 ***********************************
        /*
        Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов и их
        возможность выплачивать кредит. Для того, чтобы вывести предварительное решение, нам необходимо использовать
        данные о возрасте, зарплате и желаемой сумме.
        Правила следующие:
        Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев. Максимальный ежемесячный платеж — 50%
        от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.Если возраст меньше 30, то добавляем 0.5% к ставке.
        Если зарплата больше 80_000, уменьшаем ставку на 0.7%. Нам нужно написать программу для предварительного
        одобрения/отказа заявки по кредиту.
        Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения
        зарплаты, wantedSum = 330_000 для обозначения желаемой суммы кредита. Подсчитайте и выведите ответ, одобрен
        кредит или нет. На основании зарплаты подсчитайте максимальный допустимый платеж. Если максимальный допустимый
        платеж по ЗП больше стандартного платежа по кредиту согласно процентной ставке, то кредит одобрен, если
        меньше — отказан. Пример ответа в консоль:
        «Максимальный платеж при ЗП * равен * рублей. Платеж по кредиту *** рублей. Одобрено/отказано».
        */
        age = 30;
        salary = 80_000;
        double wantedSum = 330_000;
        double baseInterestRate = 10;
        double interestRate;
        int loanTerms = 12;
        int monthlyPaymentMaxRate = 50;
        double monthlyPayment;
        double monthlyPaymentLimit;
        System.out.println("\nExtra Exercise 7");

        interestRate = baseInterestRate;
        if (age < 23) {
            interestRate += 1;
        } else if (age >= 23 && age < 30) {
            interestRate += 0.5;
        }
        if (salary >= 80000) {
            interestRate -= 0.7;
        }
        monthlyPayment = wantedSum * (1 + interestRate / 100) / loanTerms;
        monthlyPaymentLimit = salary * monthlyPaymentMaxRate / 100;
        if (monthlyPayment < monthlyPaymentLimit) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + monthlyPaymentLimit +
                    " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + monthlyPaymentLimit +
                    " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано");
        }
    }
}
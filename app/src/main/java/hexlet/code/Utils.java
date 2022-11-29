package hexlet.code;

public class Utils {

    //получение случайных чисел
    public static final int MAX_RAND_NUMBER = 100;
    public static final int MIN_RAND_NUMBER = 1;

    // от одного до ста
    public static int getRandomNumber() {
        return (int) (Math.random() * MAX_RAND_NUMBER + MIN_RAND_NUMBER);
    }

    // с заданным интервалом (для Прогрессии)
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * min + max);
    }

    // с заданным интервалом второй вариант
    public static int getRandomNumber(int interval) {
        return (int) (Math.random() * interval);
    }



    //константы для цикла вывода вопроса и проверки ответа
    public static final int MAX_CYCLES = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

}



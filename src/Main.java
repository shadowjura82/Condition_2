public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Ваш телефон не поддерживает наше мобильное приложение\n");
    }

    public static void task2() {
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            } else System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else System.out.println("" +
                    "Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Ваш телефон не поддерживает наше мобильное приложение\n");
    }

    public static void task3() {
        short year = 2400;
        if ((year % 400) == 0) {
            System.out.println(year + " год является високосным\n");
        } else if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                System.out.println(year + " год не является високосным\n");
            } else System.out.println(year + " год является високосным\n");
        } else System.out.println(year + " год не является високосным\n");
    }

    public static void task4() {
        short deliveryDistance = 15;
        byte days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = 3;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + "\n");
        } else System.out.println("Свыше 100 км доставки нет\n");
    }
}
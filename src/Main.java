public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
            } else System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Ваш телефон не поддерживает наше мобильное приложение\n");
    }
}
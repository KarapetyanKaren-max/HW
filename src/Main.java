public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int OS = 1;
        int clientDeviceYear = 2013;


        if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");

        } else if (OS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите обычную версию приложения для Android по ссылке");


        int year = 2021;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является высокостным ");
        } else {
            System.out.println(year + " год не является высокостным ");
        }

        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + 1);

        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (deliveryDistance > 100)
        System.out.println("Доставки нет");

        int monthNumber = 6;
        switch (monthNumber ) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
    }















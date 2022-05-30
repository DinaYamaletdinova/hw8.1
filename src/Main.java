import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        int year = 2000;
        printLeapYear(year);

        // Задание 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        suggestVersion(clientOS, clientDeviceYear);

        // Задание 3
        int deliveryDistance = 95;
        int countDeliveryDays = countDeliveryDays (deliveryDistance);
        System.out.println("Потребуется дней: " + countDeliveryDays);


    }
    //1
    private static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printLeapYear(int year){
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

    }

    //2
    private static void suggestVersion(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear){
            System.out.print("Установите lite-версию для ");
        } else {
            System.out.print("Установите версию для ");
        }
        if (clientOS == 1){
            System.out.println("Android");
        } else {
            System.out.println("iOS");
        }

    }
    private static int countDeliveryDays (int deliveryDistance){
        int deliveryDays = 0;
        if (deliveryDistance <= 20){
            deliveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryDays = 3;
        } else {
            System.out.println("Ошибка, рассчёт доставки невозможен.");
        }
        return deliveryDays;

    }
}
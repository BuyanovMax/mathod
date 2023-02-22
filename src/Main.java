public class Main {


    public static int definitionOfTheYear(int year1) {
        if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) {
            System.out.println("Год " + year1 + " високосный");
        } else {
            System.out.println("Год " + year1 + " не високосный");

        }
        return year1;
    }

    public static int definitionYear(int result,int OS) {
        if (result <= 2015) {
            System.out.print("Установите облегченную версию ");
        } else if (result > 2015) {
            System.out.print("Установите обычную версию ");
        }
        if (OS == 0) {
            System.out.print("приложения для iOS по ссылке");
        } else {
            System.out.print("приложения для Android по ссылке");

        }
        int total = result + OS;
        System.out.println();
        return total;

    }


    public static int countingDays(int distance,int days){
        if (distance > 20) {
            days++;
            System.out.println("Потребуется дней: " + days);
        }
        else if(distance > 60) {
            days++;
            System.out.println("Потребуется дней: " + days);
        }
        else if (distance > 100) {

            System.out.println("Доставки нет");
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        int leapYear = definitionOfTheYear(year);


        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        int version = definitionYear(clientDeviceYear,clientOS);


        System.out.println("Задача 3");
        int deliveryDistance = 21;
        int days = 1;
        int data = countingDays(deliveryDistance, days);

    }


}
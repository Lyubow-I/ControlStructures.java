import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        //Task 1
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season ="Зима";
                break;
            case 3:
            case 4:
            case 5:
                season ="Весна";
                break;
            case 6:
            case 7:
            case 8:
                season ="Лето";
                break;
            case 9:
            case 10:
            case 11:
                season ="Осень";
                break;
            default:
               season ="Неверный номер месяца";
        }
        System.out.println(season);
        scanner.close(); */


        // Task 2
    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt();
        String season;
        if (month == 12 || month == 1 || month == 2){
            season = "Зима";
        } else if (month >= 3 && month <= 5) {
            season = "Весна";
        } else if (month >= 6 && month <= 8) {
            season = "Лето";
        } else if (month >= 9 && month <= 11) {
            season = "Осень";
        } else {
            season = "Неверный номер месяца";
        }
        System.out.println(season);
        scanner.close(); */


        //Task 3
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        if (number % 2 ==0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Число не четное");
        }
        scanner.close();

       */

        // Task 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        }else {
            System.out.println("Холодно");
        }scanner.close();

    }

}

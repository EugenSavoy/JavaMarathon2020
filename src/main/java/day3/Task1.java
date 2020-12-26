package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String country;
        while (true) {

            String city = sc.nextLine().trim();
            if (city.equals("Stop")) {
                sc.close();
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    country = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    country = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    country ="Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    country = "Германия";
                    break;
                default:
                    country = "Неизвестная страна";
                    break;
            }
            System.out.println(country);
        }
    }
}

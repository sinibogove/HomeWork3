package qa.testautomation;

import java.util.Scanner;

public class HomeWork3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of a weekday");
        int dayOfTheWeek = scanner.nextInt();

            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("So week day is Monday");
                    break;
                case 2:
                    System.out.println("So week day is Tuesday");
                    break;
                case 3:
                    System.out.println("So week day is Wednesday");
                    break;
                case 4:
                    System.out.println("So week day is Thursday");
                    break;
                case 5:
                    System.out.println("So week day is Friday");
                    break;
                case 6:
                    System.out.println("So week day is Saturday");
                    break;
                case 7:
                    System.out.println("So week day is Sunday");
                    break;
                default:
                    System.out.println("Incorrect number");
            }
        }
    }




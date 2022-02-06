package qa.testautomation;

import java.util.Scanner;

public class HomeWork3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of a weekday");
        int dayOfTheWeek = scanner.nextInt();

            //Напишете програма, която чете цифра от 1 до 7 в конзолата (или се приема като
            // параметър на метод) и на базата на това изписва в конзолата деня от седмицата във
            //формат: You entered 1. So week day is Monday.
            switch (dayOfTheWeek) {
                case 1:
                    System.out.println("You entered 1, so the week day is Monday");
                    break;
                case 2:
                    System.out.println("You entered 2, so the week day is Tuesday");
                    break;
                case 3:
                    System.out.println("You entered 3, so the week day is Wednesday");
                    break;
                case 4:
                    System.out.println("You entered 4, so the week day is Thursday");
                    break;
                case 5:
                    System.out.println("You entered 5, so the week day is Friday");
                    break;
                case 6:
                    System.out.println("You entered 6, so the week day is Saturday");
                    break;
                case 7:
                    System.out.println("You entered 7, so the week day is Sunday");
                    break;
                default:
                    System.out.println("Yoy entered incorrect number");

            }
        // Напишете програма, която за подадени дължина и височина на правоъгълник,
            // изкарва на конзолата неговият периметър и лице.
            double height = 10;
            double length = 5.55;
            double rectangleArea = (height*length);
            double rectanglePerimeter = ((2*height)+(2*length));
            System.out.println("The area of the rectangle is " + rectangleArea);
            System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
        }
    }




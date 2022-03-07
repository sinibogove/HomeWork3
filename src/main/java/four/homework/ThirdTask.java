package four.homework;
/* Напишете програма, която приема масив от числа и изчислява
сумата на всички четни и нечетни числа от поредицата изписвайки подходящо съобщение с резултата.
 */
public class ThirdTask {
    public static void main(String[] args) {
        int divider = 2;
        int sumOfAllNumbers = 0;
        int sumOfEvenNumbers = 0;

        int arr[] = {5, 12, 15, 16, 18, 21};

        for (int j : arr)
            sumOfAllNumbers +=j;

        for (int i : arr)
        if (i % divider==0) {
                sumOfEvenNumbers += i;
            }
        System.out.println("The sum of all even numbers is " + sumOfEvenNumbers);
        System.out.println("The sum of all odd numbers is " + (sumOfAllNumbers-sumOfEvenNumbers));
        }
}

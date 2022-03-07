package four.homework;
//Напишете програма, която изчислява средната стойност от всички числа в масив.

public class SecondTask {
    public static void main(String[] args) {
        double arr[] = new double[3];
        arr[0] = 10.0;
        arr[1] = 20.0;
        arr[2] = 40.0;

        double sum = 0;
        double average = 0;

        for (double i : arr) {
            sum+=i;
            average=sum/ arr.length;
        }
        System.out.println("The average is " + average);
    }
}
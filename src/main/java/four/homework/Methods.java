package four.homework;

public class Methods {

    public static void printSerialNumbers(int n) {

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbersWhichAreNotDividedIntoThreeAndSeven(int n) {

        for (int i = 1; i < n + 1; i++) {
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }

    public static void printSumOfFibonacciNumbers(int n) {
        int sumOfFibonacciNumbers1 = (n - 1);
        int sumOfFibonacciNumbers2 = (n - 2);

        if (n <= 0)
            System.out.println(0);
        else if (n == 1) ;
        System.out.println(1);

        System.out.println((sumOfFibonacciNumbers1 + sumOfFibonacciNumbers2));
    }

    public static void printSum(int n) {
       // int sum = 0;
      //  if (n<=0)
         //   System.out.println(0);
      //  if (n==1)
       //     System.out.println(1);

      //  for (int i = 2; i <= n; i++) {
      //  sum = (i-1)+(i-2);
      //  sum+=i;
      //      System.out.println(sum);
        int sum = 0;
        int [] numFibonacci = new int[n] ;
        numFibonacci [0] =0;
        numFibonacci [1] =1;
        for (int i = 3; i < numFibonacci.length ; i++) {
            numFibonacci[i]=numFibonacci[i-1] +numFibonacci[i-2];}
        for (int i = 0; i < numFibonacci.length; i++) {
            sum += numFibonacci[i];
        }
        System.out.println(sum);
        }
    }

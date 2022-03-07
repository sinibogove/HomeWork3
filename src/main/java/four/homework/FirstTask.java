package four.homework;
        /* 1. Да се напише програма, която създава масив с 20 елемента от целочислен тип
         и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
         Елементите на масива да се изведат на конзолата. */
public class FirstTask {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
                for (int i : myArray) {
                int multiplier = 5;
                System.out.println(i * multiplier);
        }
    }
}

package lv.acodemy.classroom;

public class PlayWithWhileLoops {
    public static void main(String[] args) {
        // print numbers from 1 to 10
        int b = 1;
        while (b <= 10) {
            System.out.println(b);
            b++;
        }
        // print even numbers from 1 to 20
        int a = 2;
        while (a <= 20) {
            System.out.println(a);
            a = a + 2;
        }
        // calculate sum of numbers from 1 to 10
        int x = 1;
        int sumNumber = 0;
        while (x <= 10) {
            sumNumber = sumNumber + x;
            x++;
        }
        System.out.println(sumNumber);

        // print elements from array
        int[] numbers = {2, 20, 30, 40, 50, 55, 100};
        int count = 0;
        while (count < numbers.length) {
            System.out.println(numbers[count]);
            count++;
        }
        // print numbers from 10 to 1
        int v = 10;
        while (v >= 1) {
            System.out.println(v);
            v--;
        }
        // print multiplication table (5)
        int table = 5;
        int multipla = 1;
        while (multipla <= 10) {
            int rezult = table * multipla;
            System.out.println(String.format("%d * %d = %d", table, multipla, rezult));
            multipla++;
        }
    }
}

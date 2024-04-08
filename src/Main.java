// Eddie Hart
// April 1st, 2024
// CSC 1060

public class Main {
    static double total = 0;
    static int power = 1;

    public static void powerOf2GreaterThanN(int N) {
        if (total < N) {
            total = Math.pow(2, power);
            power++;
            powerOf2GreaterThanN(N);
        } else {
            System.out.println("\n" + total);
        }
    }

    public static void powerOf2GreaterThanNIterative(int N) {
        double powerOfTwo = 0;
        int iterativePower = 1;
        while (powerOfTwo < N) {
            powerOfTwo = Math.pow(2, iterativePower);
            iterativePower++;
        }
        System.out.println(powerOfTwo);
    }

    public static void appendNTimes(String string, int integer) {
        if (integer > 0) {
            System.out.print(string);
            appendNTimes(string, integer - 1);
        }
    }

    public static void appendNTimesIterative(String string, int integer) {
        int i = 0;
        while (integer > i) {
            System.out.print(string);
            integer--;
        }
    }

    static int index = 0;

    public static void contains(int[] array, int value) {
        if (array[index] == value) {
            System.out.println("\n" + index);
        } else {
            index++;
            contains(array, value);
        }
    }

    public static void containsIterative(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.print("\n" + i);
            }
        }
    }


    public static void main(String[] args) {
        int[] penis = new int[]{5, 7, 9, 10, 6};
        appendNTimes("penis", 5);
        contains(penis, 6);
        appendNTimesIterative("Penis", 5);
        containsIterative(penis, 6);
        powerOf2GreaterThanN(5);
        powerOf2GreaterThanNIterative(5);
    }
}
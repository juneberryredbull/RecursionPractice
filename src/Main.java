// Eddie Hart
// April 1st, 2024
// CSC 1060

// removed largestpowerof2 method.
// made append and contains methods return their expected values instead of void methods
public class Main {
    static String s = "";

    public static String appendNTimes(String string, int integer) {
        if (integer > 0) {
            s += string;
            appendNTimes(string, integer - 1);
        }
        return s;
    }

    public static String appendNTimesIterative(String string, int integer) {
        int i = 0;
        String s = "";
        while (integer > i) {
            s += string;
            integer--;
        }
        return s;
    }

    static int index = 0;

    public static int contains(int[] array, int value) {
        if (array[index] == value) {
            return index;
        } else {
            index++;
            contains(array, value);
        }
        return index;
    }

    public static int containsIterative(int[] array, int value) {
        int indexII = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indexII = i;
            }
        }
        return indexII;
    }


    public static void main(String[] args) {
        int[] penis = new int[]{5, 7, 9, 10, 6};
        String appended = appendNTimes("penis", 5);
        String appendix = appendNTimesIterative("Penis", 5);
        int contention = contains(penis, 6);
        int contend = containsIterative(penis, 6);
        System.out.println(appended);
        System.out.println(appendix);
        System.out.println(contention);
        System.out.println(contend);
    }
}
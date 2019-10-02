import java.util.Random;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 01, 2019
 */
public class Main {

    private static int[] arr = new int[10000];

    public static void main(String[] args) {

        fillArray();//  filling the array with random elements

        long a = System.currentTimeMillis();// note time for bubble sort runtime
        sortBubble(arr);
        System.out.println("Bubble sort runtime = " + (System.currentTimeMillis() -a) + " millis");

        long b = System.currentTimeMillis();//  -//-
        sortSelect(arr);
        System.out.println("Sort by selection runtime = " + (System.currentTimeMillis() -b) + " millis");

        long c = System.currentTimeMillis();// -//-
        sortInsert(arr);
        System.out.println("Insertion sort runtime = " + (System.currentTimeMillis() -c) + " millis");

        printArray();
        }

    /**
     * Sort bubble
     */
    static void sortBubble(int[] arr) {
        int in, out;
        int len = arr.length;
        for (out = len - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    change(in, in + 1, arr);
                }
            }
        }
    }

    /**
     * Sort select
     */
    static void sortSelect(int[] arr) {
        int in, out, mark;
        int len = arr.length;
        for (out = 0; out < len; out++) {
            mark = out;
            for (in = out + 1; in < len; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark, arr);
        }
    }

    /**
     * Sort insert
     */
    static void sortInsert(int[] arr) {
        int in, out;
        int len = arr.length;
        for (out = 1; out < len; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }

    private static void change(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * fill an array with random elements
     */
    private static void fillArray() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = generateRndElement();
            }
        }

    /**
     * print an array
     */
        private static void printArray() {
            for (int n: arr) {
                System.out.print(n + "|");
            }
        }

    /**
     * generate a random element from 0 to 10000
     * @return random element
     */
    private static int generateRndElement() {
            Random random = new Random();
            int rndElement = random.nextInt(10000);
            return rndElement;
        }
}


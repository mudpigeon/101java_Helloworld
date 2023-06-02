package lib.sample;

import lib.std.*;
import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        // 数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }

    
    public static void main(String[] args) {
        int[] whitelist = In.readInts();

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) StdOut.println(key);
        }
    }
    

    public static void test() {
        // Test by external invoking
        int[] whitelist = new int[50];

        for (int i = 0; i < 50; i++) {
            whitelist[i] = StdRandom.uniformInt(100);
        }

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) StdOut.println(key);
        }
    }

}
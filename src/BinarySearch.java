
import edu.princeton.cs.algs4.In;
import java.util.Arrays;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daven
 */
public class BinarySearch {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        Arrays.sort(whiteList);
        for (int i = 0; i < whiteList.length; i++) {
            for (int j = i+1; j < whiteList.length; j++) {
                if (whiteList[i] == whiteList[j] && whiteList[j] != -11111) {
                    whiteList[i + 1] = -11111;
                }else{
                    break;
                }
            }
        }
        while (!StdIn.isEmpty()) {
            // read key pring if not in whitelist
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1) {
                StdOut.println(key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        // array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

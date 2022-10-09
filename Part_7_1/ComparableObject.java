package Part_7_1;
import java.io.*;
import java.util.*;

public class ComparableObject {
    static class Pair implements Comparable<Pair> {
        String x;
        int y;

        public Pair(String x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public String toString()
        {
            return "(" + x + "," + y + ")";
        }

    public int compareTo(Pair a)
        {
            // if the string are not equal
            if (this.x.compareTo(a.x) != 0) {
                return this.x.compareTo(a.x);
            }
            else {
                // we compare int values
                // if the strings are equal
                return this.y - a.y;
            }
        }
    }
        public static void main(String[] args)
        {

            int n = 4;
            Pair arr[] = new Pair[n];

            arr[0] = new Pair("Yuvrajsinh", 138);
            arr[1] = new Pair("Yuvrajsinh", 139);
            arr[2] = new Pair("Jay", 5);
            arr[3] = new Pair("Vishvdip", 2);

            // Sorting the array
            Arrays.sort(arr);

            // printing the
            // Pair array
            print(arr);
            System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
        }

        public static void print(Pair[] arr)
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }


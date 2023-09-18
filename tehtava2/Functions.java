package koodauskoe.tehtava2;

import java.util.Arrays;

public class Functions {
    
    public static int getShortestGap(int[] numberList) {
        if (numberList.length < 2) return 0; // If there are less than 2 numbers, return 0

        int shortestGap = Integer.MAX_VALUE;
        int[] sortedList = numberList;
        Arrays.sort(sortedList);

        for (int i = 1; i < sortedList.length; i++) {
            int gap = sortedList[i] - sortedList[i-1] - 1;
            if (gap < shortestGap) shortestGap = gap;
        }
        return shortestGap;
    }
}

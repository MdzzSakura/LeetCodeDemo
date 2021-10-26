package randomSort.bubbleSort;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 冒泡排序
 * @author: yjj
 * @create: 2021-10-26
 **/
public class BubbleSort {
    public static void main(String[] args) {
        getBubbleSort();
    }

    public static void getBubbleSort() {
        int[] a = {3,8,1,6,5,4,9,2,7};

        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length-i-1;j++) {
                int x = a[j];
                if (a[j] > a[j+1]) {
                    a[j] = a[j+1];
                    a[j+1] = x;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
    }

}

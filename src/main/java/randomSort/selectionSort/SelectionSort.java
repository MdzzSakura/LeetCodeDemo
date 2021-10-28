package randomSort.selectionSort;

import randomSort.RandomArrayUtil;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 选择排序
 * @author: yjj
 * @create: 2021-10-28
 **/
public class SelectionSort {

    public static void main(String[] args) {
        getSelectionSort();
    }

    public static void getSelectionSort() {
        int[] a = RandomArrayUtil.getRandomArray(10);
        System.out.println("***************************");

        for (int i=0;i<a.length-1;i++) {
            int minIndex = i;

            for (int j=i+1;j<a.length;j++) {
                if (a[j]<a[minIndex]) {
                    //记录最小值的下标
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        Arrays.stream(a).forEach(System.out::println);
        System.out.println("***************************");
    }
}

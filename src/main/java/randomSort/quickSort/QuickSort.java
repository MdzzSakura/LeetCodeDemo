package randomSort.quickSort;

import randomSort.RandomArrayUtil;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 快速排序
 * @author: yjj
 * @create: 2021-11-02
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] a = RandomArrayUtil.getRandomArray(10);
        int[] quickSort = quickSort(a, 0, a.length - 1);
        System.out.println("********************************");
        Arrays.stream(quickSort).forEach(System.out::println);
    }


    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

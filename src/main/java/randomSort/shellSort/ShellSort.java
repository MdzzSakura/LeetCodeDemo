package randomSort.shellSort;

import randomSort.RandomArrayUtil;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 希尔排序
 * @author: yjj
 * @create: 2021-10-28
 **/
public class ShellSort {
    public static void main(String[] args) {
        getShellSort();
    }

    public static void getShellSort() {
        int[] a = RandomArrayUtil.getRandomArray(10);
        System.out.println("***************************");
        //希尔增量
        int gap = a.length/2;

        for (int i=0;i<gap;i++) {

            for (int j=i+gap;j>0;j--){
                if (a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
        System.out.println("***************************");
    }
}

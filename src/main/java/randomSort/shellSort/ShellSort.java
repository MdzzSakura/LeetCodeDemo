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
//        int[] a = {9,8,7,6,5,4,3,2,1};
        System.out.println("***************************");
        //希尔增量
        for (int gap = a.length/2;gap>0;gap/=2) {
            for (int i=gap;i<a.length;i++) {
                int j=i;
                while (j-gap >= 0 && a[j] < a[j-gap]){
                    int temp = a[j];
                    a[j] = a[j-gap];
                    a[j-gap] = temp;
                    j-=gap;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
        System.out.println("***************************");
    }
}

package randomSort.insertionSort;

import randomSort.RandomArrayUtil;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 插入排序
 * @author: yjj
 * @create: 2021-10-28
 **/
public class InsertionSort {
    public static void main(String[] args) {
        getInsertionSort();
    }

    //插入排序是指在待排序的元素中，假设前面n-1(其中n>=2)个数已经是排好顺序的，现将第n个数插到前面已经排好的序列中，
    // 然后找到合适自己的位置，使得插入第n个数的这个序列也是排好顺序的。按照此法对所有元素进行插入，
    // 直到整个序列排为有序的过程，称为插入排序
    public static void getInsertionSort() {
        int[] a = RandomArrayUtil.getRandomArray(10);
        System.out.println("***************************");

        for (int i=0;i<a.length;i++) {

            for (int j=i+1;j>0;j--){
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

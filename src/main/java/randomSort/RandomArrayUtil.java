package randomSort;

import java.util.Arrays;

/**
 * @program: LeetCodeDemo
 * @description: 获取随机数组
 * @author: yjj
 * @create: 2021-10-28
 **/
public class RandomArrayUtil {

    public static int[] getRandomArray(int size) {
        int min = 1,max = 100;
        int[] array = new int[size];
        for (int i=0;i<size;i++) {
            int x = (int) (Math.random()*(max-min))+min;
            array[i] = x;
        }
        Arrays.stream(array).forEach(System.out::println);
        return array;
    }
}

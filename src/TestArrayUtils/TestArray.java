package TestArrayUtils;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] arr= new int[]{12,0,50,100,80,505,1000};
        ArrayUtils arrayUtils=new ArrayUtils();
        int max=arrayUtils.getMax(arr);
        System.out.println("max = " + max);
        int avg=arrayUtils.avg(arr);
        System.out.println("avg = " + avg);
        arrayUtils.printArray(arr);
        System.out.println("反转数组");
        arrayUtils.reverse(arr);
        arrayUtils.printArray(arr);
        System.out.println("对数组进行排序");
        arrayUtils.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

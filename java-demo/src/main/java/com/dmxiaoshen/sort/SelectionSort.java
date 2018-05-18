package com.dmxiaoshen.sort;

import java.util.Arrays;

/**
 * Created by hzhsg on 2018/5/18.
 * 选择排序
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * 。。。
 * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = new int[]{2,6,4,8,12,13,54,32,41,9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        int min;
        for(int i=0;i<a.length-1;i++){
            min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }
}

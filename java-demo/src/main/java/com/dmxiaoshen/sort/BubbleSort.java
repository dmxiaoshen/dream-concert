package com.dmxiaoshen.sort;

import java.util.Arrays;

/**
 * Created by hzhsg on 2018/5/17.
 * 冒泡排序
 * 两个数比较大小，较大的数下沉，较小的数冒起来。
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        sortUp(a);
        System.out.println(Arrays.toString(a));
        sortDown(a);
        System.out.println(Arrays.toString(a));
    }


    public static void sortUp(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[a.length-1-j]<a[a.length-2-j]){
                    int temp = a[a.length-1-j];
                    a[a.length-1-j]=a[a.length-2-j];
                    a[a.length-2-j]=temp;
                }
            }
        }
    }

    public static void sortDown(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[a.length-1-j]>a[a.length-2-j]){
                    int temp = a[a.length-1-j];
                    a[a.length-1-j]=a[a.length-2-j];
                    a[a.length-2-j]=temp;
                }
            }
        }
    }
}

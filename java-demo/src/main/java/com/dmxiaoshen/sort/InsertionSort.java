package com.dmxiaoshen.sort;

import java.util.Arrays;

/**
 * Created by hzhsg on 2018/5/18.
 * 插入排序
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{101,3,2,9,1,6,7,5,11,23,45,32};
        sort2(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j = i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }else{
                    break;
                }
            }

        }
    }

    public static void sort2(int[] a){
        for(int i=1;i<a.length;i++){
            int j;
            int temp = a[i];
            for(j = i;j>0;j--){
                if(a[j-1]>temp){
                   a[j] = a[j-1];
                }else{
                    break;
                }
            }
            a[j] = temp;

        }
    }
}

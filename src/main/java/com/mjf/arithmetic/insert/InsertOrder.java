package com.mjf.arithmetic.insert;

/**
 * 插入排序
 * @author majiafei
 * @date 2020/10/14 22:01
 */
public class InsertOrder {
    public static void insertOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            boolean isChange = false;
            int m = 0;
            for (int j = i - 1; j >= 0; j--) {
                m = j;
                if (array[j] > x) {
                    array[j+1] = array[j];
                    isChange = true;
                } else {
                    break;
                }
            }

            if (isChange) {
                array[m] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, -9};
        insertOrder(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

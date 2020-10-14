package com.mjf.arithmetic.bubble;

/**
 * @author majiafei
 * @date 2020/10/14 22:13
 */
public class BubbleOrder {

    public static void bubbleOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, -9};
        bubbleOrder(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

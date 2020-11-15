package com.mjf.arithmetic.bubble;

/**
 * @author majiafei
 * @date 2020/10/14 22:13
 */
public class BubbleOrder {

    public static void bubbleOrder(int[] array) {
        // 最后一次交换的位置
        int lastExchangePosition = 0;
        int sortOrder = array.length - 1;
        for (int i = 1; i < array.length; i++) {
            // 是否是有序的，没有交换过元素，说明是有序的
            boolean hasOrder = true;
            for (int j = 0; j < sortOrder; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;

                    hasOrder = false;
                    lastExchangePosition = j;
                }
            }
            if (hasOrder) {
                break;
            }
            sortOrder = lastExchangePosition;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, -9, 12, 13, 46};
        bubbleOrder(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

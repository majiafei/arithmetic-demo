package com.mjf.arithmetic.bitmap;

public class BitMap {

    private int[] array;

    private int size;

    /**一个int类型的数据占用32位 */
    private static final int INT_BIT = 32;

    private static final int BIT_NUM = 5;

    public BitMap(int size) {
        this.array = new int[size];
        this.size = size;
    }

    public int getBitIndex(int n) {
        return n >> BIT_NUM;
    }

    public void setBit(int n) {
        int bitIndex = getBitIndex(n);
        if (bitIndex < 0 || bitIndex > size) {
            throw new RuntimeException("数字：" + n + "已经超出了范围");
        }

        int position = n & (INT_BIT - 1);

        array[bitIndex]  |= 1 << position;
    }

    public boolean exists(int n) {
        int bitIndex = getBitIndex(n);
        int position = n & (INT_BIT - 1);

        return (array[bitIndex]  &= 1 << position) != 0;
    }

    public static void main(String[] args) {
        BitMap bitMap = new BitMap(1200);
        bitMap.setBit(100);
        System.out.println(bitMap.exists(120));
    }
}

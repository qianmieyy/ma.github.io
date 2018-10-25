package com.pro.test;

public class InsertionSort {

	//插入排序
	public static void main(String[] args) {
		int[] arrays = { 3, 2, 1, 5, 0 };
		// 临时变量
		int temp;
		// 外层循环控制需要排序的趟数(从1开始因为将第0位看成了有序数据)
		for (int i = 1; i < arrays.length; i++) {
			temp = arrays[i];
			// 如果前一位(已排序的数据)比当前数据要大，那么就进入循环比较[参考第二趟排序]
			int j = i - 1;
			while (j >= 0 && arrays[j] > temp) {
				// 往后退一个位置，让当前数据与之前前位进行比较
				arrays[j + 1] = arrays[j];
				// 不断往前，直到退出循环
				j--;
			}
			// 退出了循环说明找到了合适的位置了，将当前数据插入合适的位置中
			arrays[j + 1] = temp;
		}
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
	}

}

package com.pro.test;

public class Test {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 3, 0, 6 };
		BubbleSort(a);
		System.out.print("冒泡排序：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		SelectionSort(a);
		System.out.print("选择排序：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		InsertionSort(a);
		System.out.print("插入排序：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	public static void BubbleSort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; ++i) {
            // 通过符号位可以减少无谓的比较，如果已经有序了，就退出循环
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; ++j) {
                 if (a[j + 1] < a[j]) {
                      temp = a[j];
                      a[j] = a[j + 1];
                      a[j + 1] = temp;
                      flag = 1;
                 }
            }
            if (flag == 0) {
                 break;
            }
        }
   }
	
	public static void SelectionSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // 认为目前的数就是最小的 , 记录最小数的下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                 if (arr[minIndex] > arr[j]) {
                      // 修改最小值的下标
                      minIndex = j;
                 }
            }
            // 当退出 for 就找到这次的最小值
            if (i != minIndex) {
                 temp = arr[i];
                 arr[i] = arr[minIndex];
                 arr[minIndex] = temp;
            }
        }
   }
	public static void InsertionSort(int arr[]) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                 arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
   }
}

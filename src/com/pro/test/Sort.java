package com.pro.test;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={6,5,4,3,2,1,9};
		//BubbleSort(a);
		SelectionSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void BubbleSort(int[] a){
		int t=0;
		for(int i=0;i<a.length-1;i++){
			int flag=0;
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
	}
	
	public static void SelectionSort(int[] a){
		
        
	}

}

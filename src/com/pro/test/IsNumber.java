package com.pro.test;

public class IsNumber {
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,5,1,2,3,4,6,6,6,6};
		int flag=isGoodNumber(a);
		System.out.println(flag);
	}

	private static int isGoodNumber(int a[]) {
		for(int i=0;i<9;i++){
			for(int j=i;j<9;j++){
				if(a[j]==(a[j+1]-1)){
					if(a[j+1]==(a[j+2]-1)){
						System.out.println(a[j]+" "+a[j+1]+" "+a[j+2]);
						return 1;
					}
				}
			}
		}
		return 0;
	}

}

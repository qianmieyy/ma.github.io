package com.pro.test;

public class Xunhuan {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//b();
		
		Xunhuan.Xun();
	}

	private static void b() {
		String[] a={"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
		String[] b={"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
		int flag=0;
		int n=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){                   
				System.out.print(a[i]+b[j]+" ");
				n++; 
				if(n%10==0){
					System.out.print("\n");
				}else if(n==60){
					flag=1;
					break;
				}
				if(j==b.length-1){
					continue;
				}
				if(i==a.length-1){
					i=0;
				}else{
					i=i+1;
				}
				continue;
			}
			if(flag==1){
				break;
			}
		}
	}
	
	public static void Xun(){
		String[] a={"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
		String[] b={"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};		
		int i=0,count=0,step=0;
		for(;;i++){
				System.out.print(a[i]+b[((10*step)+i)%12]+",");
				count++;
				if(count>9&&count%10==0){
					System.out.println("\t");
					step++;
					i=i-10;
				}
				if(count==60)
					break;
		}
	}
}

package com.selfpractice;

import java.util.Arrays;

public class RemoveDuplicatesArray {
	public static String removeDuplicatesArray (int[] a) {
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			boolean status= false;
				for(int j=0;j<a.length;j++) {
					if(!(i==j)) {
					if(a[i]==a[j]) {
						status=true;
						break;
					}
					}
				}
			if(!status) {
				b[i] = a[i];
			}
		}
		return Arrays.toString(b);
	}
	public static void main(String[] args) {
	int[] a = {20,30,20,40,10,10,30,50};
	System.out.println(removeDuplicatesArray(a));
	}
}

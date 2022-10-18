package com.selfpractice;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {
	public static List<Integer> removeDuplicates (int[] a) {
		List<Integer> list = new LinkedList<Integer>();
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
				list.add(a[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
	int[] a = {20,30,20,40,10,10,30,50};
	System.out.println(removeDuplicates(a));	
	}
}

package com.teechnoelevate.javabasics;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] array= {34,234,45,23,34,42};
		
		int[] array1=new int[6];
		for(int i=0;i<array.length;i++) {
			array1[i]=array[i];
			System.out.println(array1[i]);
		}
		
		System.out.println(Arrays.toString(array1));
	}

	
}
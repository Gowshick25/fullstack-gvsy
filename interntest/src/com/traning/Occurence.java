package com.traning;

import java.util.Arrays;
import java.util.Scanner;

public class Occurence{
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		int[] arr= {1,2,3,4,1,3,7};
		int[] arr1=Arrays.copyOf(arr,arr.length);
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++){
			int count=0;
			String position="";
			if(i==0){
				for(int j=0;j<arr.length;j++){
					if(arr1[i]==arr[j]){
						count++;
						position+=Integer.toString(j)+",";
					}
				}
				System.out.println(arr1[i]+"="+count);
				System.out.println("Position := "+position.substring(0,position.length()-1));
			}
			else if(arr1[i-1]!=arr1[i]){
				for(int j=0;j<arr.length;j++){
					if(arr1[i]==arr[j]){
						count++;
						position+=Integer.toString(j)+",";
					}
				}
				System.out.println(arr1[i]+"="+count);
				System.out.println("Position :="+position.substring(0,position.length()-1));
			}
			else{
				continue;
			}
		}
	}
}
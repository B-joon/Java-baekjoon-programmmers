package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayTest05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());

		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(str.nextToken());
		}
		
		Arrays.sort(arr);
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += ((arr[i] / arr[n - 1]) * 100);
		}
		System.out.println(sum / arr.length);
		
	}
}

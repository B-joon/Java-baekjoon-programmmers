package com.test;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("지뢰찾기 맵 크기를 지정하시요 : ");
		int size = sc.nextInt();
		// 지뢰 셋팅 배열
		int[][] map = new int[size][size];
		// map배열을 join
		int[][] temp = new int[size + 2][size + 2]; 
		// 랜덤한 인덱스에 지뢰 셋팅
		for (int i = 0; i < map.length; i++) { 
			map[ran.nextInt(size)][ran.nextInt(size)] = 7;
		}
		if (size >= 10 && size < 25) {
			for (int i = 0; i < 5; i++) {
				map[ran.nextInt(size)][ran.nextInt(size)] = 7;
			}
		} else if (size >= 25) {
			for (int i = 0; i < 15; i++) {
				map[ran.nextInt(size)][ran.nextInt(size)] = 7;
			}	
		}
		// 지뢰를 셋팅한 맵 배열을 temp에 join
		for (int i = 1; i < temp.length - 1; i++) { 
			for (int k = 1; k < temp.length - 1; k++) {
				temp[i][k] = map[i-1][k-1];
			}
		}
		// 빈칸을 기준으로 8곳을 확인해서 지뢰가 몇개인지 카운트 해준다.
		for (int i = 1; i < map.length + 1; i++) { 
			for (int j = 1; j < map.length + 1; j++) {
				int count = 0;
				if (temp[i][j] == 7) {
					continue;
				} 
				if (temp[i - 1][j - 1] == 7) {
					count++;
				} 
				if (temp[i - 1][j] == 7) {
					count++;
				} 
				if (temp[i - 1][j + 1] == 7) {
					count++;
				} 
				if (temp[i][j - 1] == 7) {
					count++;
				} 
				if (temp[i][j + 1] == 7) {
					count++;
				} 
				if (temp[i + 1][j - 1] == 7) {
					count++;
				} 
				if (temp[i + 1][j] == 7) {
					count++;
				} 
				if (temp[i + 1][j + 1] == 7) {
					count++;
				}
				temp[i][j] = count;
			}
		}
		// 지뢰만 심은 배열
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.printf("%2d", map[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		// 문자열 변환
		String[][] change = new String[size + 2][size + 2];
		
		for (int i = 0; i < change.length; i++) {
			for (int j = 0; j < change.length; j++) {
				if (temp[i][j] == 7) {
					change[i][j] = "*";
				} else {
					change[i][j] = Integer.toString(temp[i][j]);
				}
			}
		}
		for (int i = 1; i < change.length - 1; i++) {
			for (int j = 1; j < change.length - 1; j++) {
				System.out.printf("%2s",change[i][j]);
			}
			System.out.println();
		}
	}
}

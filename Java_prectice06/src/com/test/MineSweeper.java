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
		// 지뢰를 셋팅한 맵 배열을 temp에 join
		for (int i = 1; i < temp.length - 1; i++) { 
			for (int k = 1; k < temp.length - 1; k++) {
				temp[i][k] = map[i-1][k-1];
			}
		}
		// 지뢰를 기준으로 주면에 1씩 증가
		for (int i = 2; i < map.length + 2; i++) { 
			for (int j = 2; j < map.length + 2; j++) {
				if (temp[i][j] == 7) {
					temp[i - 1][j - 1] += 1;
					temp[i - 1][j] += 1;
					temp[i - 1][j + 1] += 1;
					temp[i][j - 1] += 1;
					temp[i][j + 1] += 1;
					temp[i + 1][j - 1] += 1;
					temp[i + 1][j] += 1;
					temp[i + 1][j + 1] += 1;
				}
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
		// 최종출력
		for (int i = 1; i < map.length + 1; i++) {
			for (int j = 1; j < map.length + 1; j++) {
				// 지뢰가 int 형식이라서 8곳 중에 지뢰가 있을경우 지뢰가 8로 증가하기 때문에 
				// 7보다 커지면 다시 7로 셋팅
				if (temp[i][j] > 7) {
					temp[i][j] = 7;
				}
				System.out.printf("%2d", temp[i][j]);
			}
			System.out.println();
		}
	}
}

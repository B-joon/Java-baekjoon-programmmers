package com.test;

import java.util.HashSet;

public class Poketmon {

	public static void main(String[] args) {
		
		Poketmon poketmon = new Poketmon();
		
		int[] nums = {3, 3, 3, 2, 2, 2};
		
		System.out.println(poketmon.solution(nums));
		
	}
	
	public int solution(int[] nums) {
		int answer = nums.length / 2;
		HashSet<Integer> pkm = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			pkm.add(nums[i]);
		}
		
		if (pkm.size() < answer) {
			return pkm.size();
		}
		
		return answer;
	}
	
}

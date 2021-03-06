package com.test;

import java.util.HashMap;
// 프로그래머스 마라톤 문제
public class maraton {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}
		
		return answer;
	}
}

package com.test;

public class Keypad {

	public static void main(String[] args) {

		int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";

		Keypad phone = new Keypad();

		System.out.println(phone.solution(number, hand));

	}

	public String solution(int[] number, String hand) {
		StringBuffer sb = new StringBuffer();
        int LStart = 10;
		int RStart = 12;
        
        for (int num : number) {
			if (num == 1 || num == 4 || num == 7) {
				sb.append("L");
				LStart = num;

			} else if (num == 3 || num == 6 || num == 9) {
				sb.append("R");
				RStart = num;
			} else {
				int Lhand = result(LStart, num);
				int Rhand = result(RStart, num);
				if (Lhand < Rhand) {
					sb.append("L");
					LStart = num;
				} else if (Lhand > Rhand) {
					sb.append("R");
					RStart = num;
				} else {
					if (hand.equals("right")) {
						sb.append("R");
						RStart = num;
					} else {
						sb.append("L");
						LStart = num;
					}
				}
			}
		}
        
        return sb.toString();
	}

	public static int result(int hand, int number) {

		if (hand == 0) {
			hand = 11;
		} else if (number == 0) {
			number = 11;
		}
		
		int handX = (hand -1) / 3;
		int handY = (hand -1) % 3;
		
		int numX = (number -1) / 3;
		int numY = (number -1) % 3;
		
		return Math.abs(handX - numX) + Math.abs(handY - numY);
	}
	
	
//	public static int AV(int resX, int resY) {
//		if (resX < 0) {
//			resX = -resX;
//		} 
//		if (resY < 0) {
//			resY = -resY;
//		}
//		return resX + resY;
//	}

}

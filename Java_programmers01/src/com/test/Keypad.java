package com.test;

public class Keypad {

	public static void main(String[] args) {

		int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";

		Keypad phone = new Keypad();

		System.out.println(phone.solution(number, hand));

	}

	public String solution(int[] numbers, String hand) {
		String answer = "";
        int LStart = 10;
		int RStart = 12;
        
		for (int i = 0; i < numbers.length; i++) {
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                LStart = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                RStart = numbers[i];
            } else {
                int Lhand = result(LStart, numbers[i]);
                int Rhand = result(RStart, numbers[i]);
                
                if (Lhand > Rhand) {
                    answer += "R";
                    RStart = numbers[i];
                } else if (Lhand < Rhand) {
                    answer += "L";
                    LStart = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        RStart = numbers[i];
                    } else {
                        answer += "L";
                        LStart = numbers[i];
                    }
                }
                
            }
		}
        
        return answer;
	}

	public static int result(int hand, int number) {

		if (hand == 0) {
			hand = 11;
		}
		if (number == 0) {
			number = 11;
		}
		
		int handX = (hand -1) / 3;
		int handY = (hand -1) % 3;
		
		int numX = (number -1) / 3;
		int numY = (number -1) % 3;
		
		int resX = handX - numX;
		int resY = handY - numY;
		
		return AV(resX, resY);
	}

	public static int AV(int resX, int resY) {
		if (resX < 0) {
			resX = -resX;
		} 
		if (resY < 0) {
			resY = -resY;
		}
		return resX + resY;
	}

}

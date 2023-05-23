package com.skylaon.rpc;

import java.util.Scanner;

// 1 : 가위 2 : 바위 3 : 보

public class Rps {

	void run() {
		System.out.println("=======run=======");

		while (true) {
			int num = ProcRps();
			if (num == 1) {
				System.out.println("게임을 종료합니다.");
				break;
			}

		}
	}

	int ProcRps() {

		int com = (int) (Math.random() * 3 + 1);
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보!(1:가위 2:바위 3:보) ==> ");
		String user = sc.next();

		switch (user) {
		case "1":
			switch (com) {
			case 1:
				System.out.println("사용자 : 가위 컴퓨터 : 가위\n비겼습니다!");
				break;
			case 2:
				System.out.println("사용자 : 가위 컴퓨터 : 바위\n컴퓨터가 이겼습니다!");
				break;
			case 3:
				System.out.println("사용자 : 가위 컴퓨터 : 보\n사용자가 이겼습니다!");
				break;
			}
			break;
		case "2":
			switch (com) {
			case 1:
				System.out.println("사용자 : 바위 컴퓨터 : 가위\n사용자가 이겼습니다!");
				break;
			case 2:
				System.out.println("사용자 : 바위 컴퓨터 : 바위\n비겼습니다!");
				break;
			case 3:
				System.out.println("사용자 : 바위 컴퓨터 : 보\n컴퓨터가 이겼습니다!");
				break;
			}
			break;
		case "3":
			switch (com) {
			case 1:
				System.out.println("사용자 : 보 컴퓨터 : 가위\n컴퓨터가 이겼습니다!");
				break;
			case 2:
				System.out.println("사용자 : 보 컴퓨터 : 바위\n사용자가 이겼습니다!");
				break;
			case 3:
				System.out.println("사용자 : 보 컴퓨터 : 보\n비겼습니다!");
				break;
			}
			break;

		default:
			System.out.println("입력값이 유효하지 않습니다. 다시 입력하십시오.");
			break;
			
		case "x":
			return 1;
		}
		return 0;
	}
}

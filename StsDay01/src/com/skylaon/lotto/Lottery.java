package com.skylaon.lotto;

import java.util.HashSet;
import java.util.Set;

public class Lottery {

	int p[][] = new int[5][6]; // 사용자 번호(5천원 어치)
	int r[] = new int[6]; // 로또 번호
	int win_max = 0; // 최대 hit 횟수
	int bonusNum = 0; // 보너스 번호
	int bonusArr[] = new int[6];
	int max_index = 0; // 최대 hit 로또의 인덱스 num -> 보너스 계산 시 필요

	void run() {
		p = getPlayerNum();
		r = getLotto();
		bonusNum = getBonus(r); // 보너스 번호 추첨
		win_max = getWin(p, r, bonusNum); // 사용자가 5번 뽑은 로또 중 가장 많이 맞춘 갯수

		playerInfo(p); // 플레이어가 구매한 로또 번호 출력
		lottoInfo(r, bonusNum); // 추첨로또번호 출력

		rank(win_max); // 결과
	}

	// 보너스 번호 뽑고 기존 번호와 같다면 재추첨
	// 로또 번호 추첨
	int[] getLotto() {
		Set<Integer> arr = new HashSet<>();

		while (arr.size() < 6) {
			arr.add((int) (Math.random() * 45 + 1));
		}
		Integer temp[] = arr.toArray(new Integer[0]);

		int a[] = new int[6];

		for (int i = 0; i < a.length; i++) {
			a[i] = temp[i];
		}

		return a;
	}

	// 사용자 로또 자동 구매
	int[][] getPlayerNum() {
		// 5번 x 6번 추첨(2차원 배열)
		int arr[][] = new int[5][6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getLotto();
		}

		return arr;
	}

	int getBonus(int[] arr) {
		int r_num = (int) (Math.random() * 45 + 1);

		// 보너스 번호가 추첨번호와 일치하면 보너스 재추첨
		while (arr.equals(r_num)) {
			r_num = (int) (Math.random() * 45 + 1);
		}
		return r_num;
	}

	// 사용자 추첨번호와 로또 번호 비교
	// 가장 많이 맞춘 횟수 return
	// 좀 더 효율적인 로직 필요.. O(n^3)임
	int getWin(int[][] p, int[] r, int b) {
		int win[] = new int[6];

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				if (p[i][j] == b) {
					bonusArr[i]++;
					continue; // 보너스 번호와 같다면 아래 for루프를 건너뜀
				}
				for (int k = 0; k < r.length; k++) {
					if (p[i][j] == r[k]) {
						win[i]++;
					}
				}
			}
		}

		return getMax(win);

	}

	int getMax(int[] win) {
		int maxNum = 0;
		for (int i = 0; i < win.length; i++) {
			if (maxNum < win[i]) {
				maxNum = win[i];
				max_index = i;
			}
		}
		System.out.println("가장 많이 맞춘 개수 : " + maxNum);
		return maxNum;
	}

	// 등수 출력
	void rank(int win) {
		switch (win) {
		case 3:
			System.out.println("5등입니다.");
			break;
		case 4:
			System.out.println("4등입니다.");
			break;
		case 5:
			// 보너스 번호 hit 배열에서 win배열의 최댓값에 대한 index를 그대로 가져옴
			if (bonusArr[max_index] == 1) {
				System.out.println("2등입니다.");
				break;
			}
			System.out.println("3등입니다.");
			break;
		case 6:
			System.out.println("1등입니다.");
			break;
		default:
			System.out.println("꽝!");
		}
	}

	void playerInfo(int[][] arr) {
		System.out.println("======사용자 추첨 번호======");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 : ");
			
			  for (int j = 0; j < 6; j++) {
				  System.out.print(arr[i][j] + " ");
			  }
			 
			System.out.println();
		}
	}

	void lottoInfo(int[] arr, int bonus) {
		System.out.println("========로또 번호========");
		for (int temp : arr)
			System.out.print(temp + " ");
		System.out.println("보너스 번호 : " + bonus);
	}

}

package com.bhushan.musicplayer.musicplayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayer {
	static boolean loop = true;
	static songOpertion opertion = new songOpertion();

	public static void main(String[] args) {
		musicMenu();

		while (loop) {
			musicMenu();
		}

	}

	public static void musicMenu() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu :- \n 1.play \n 2.Add/Remove \n 3.Edit \n 4.Exit");
		System.err.println("choose option :-");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("1. choose song \n 2. all songs \n 3. random song \n 4. go back.");
			System.err.println("choose option :-");
			int key1 = sc.nextInt();
			switch (key1) {
			case 1: {
				opertion.ChooseSongPlay();
				break;
			}
			case 2: {
				opertion.PlayAllSong();
				break;
			}
			case 3: {
				opertion.PlayRandom();
				break;
			}
			case 4: {
				break;
			}

			}

			break;
		}
		case 2: {
			System.out.println("1.Add song \n 2.Remove song \n 3. go back");
			System.err.println("choose option :-");
			int key2 = sc.nextInt();
			switch (key2) {
			case 1: {
				opertion.addSongs();
				break;
			}
			case 2: {
				opertion.removeSong();
				break;
			}
			case 3: {

				break;
			}
			}

			loop = false;
			musicMenu();
			break;
		}
		case 3: {
			opertion.update();
			loop = false;
			musicMenu();
			break;
		}
		case 4: {
			loop = false;
			musicMenu();
			break;
		}
		}
		}catch(InputMismatchException e) {
			System.out.println("invalid input");
		}

	}
}

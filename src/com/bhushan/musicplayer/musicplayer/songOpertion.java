package com.bhushan.musicplayer.musicplayer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class songOpertion {
	ArrayList<Song> music = new ArrayList<Song>();
	Scanner sc = new Scanner(System.in);
	boolean list = false;

	public void addSongs() {
		try {
		System.out.println("enter no. of song to add");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			System.out.println("Enter song name:");
			String s = sc.next();
			music.add(i, new Song());
			music.get(i).setId(i + 1);
			music.get(i).setSongName(s);
		}
		}catch(InputMismatchException e) {
			System.out.println("invalid input");
		}

	}

	public void displayListOfSong() {

		if (music.isEmpty() == true) {
			System.out.println("NO Song In list...!!");
			throw new NullPointerException();
		} else
//			System.out.println(music);//
			for (int i = 0; i < music.size(); i++) {
				System.out.println(music.get(i).getId() + "|" + music.get(i).songName + music.get(i).getSingerName()
						+ "|" + music.get(i).getMovieName() + "|" + music.get(i).getComposer() + "|"
						+ music.get(i).getLength());
			}
	}

	public void removeSong() {
		try {
			this.displayListOfSong();
			System.out.println("remove song no:");
			int j = sc.nextInt();
			music.remove(j - 1);
			for (int i = j - 1; i < music.size(); i++) {
				music.get(i).setId(i + 1);
			}
			this.displayListOfSong();
		} catch (NullPointerException e) {
			System.out.println("No Songs in List. Add some songs first.");
		}catch(InputMismatchException e) {
			System.out.println("invalid input");
		}



	}

	public void ChooseSongPlay() {
		try {
			this.displayListOfSong();
			System.out.println("enter song no");
			int no = sc.nextInt();
			try {
				System.out.println(music.get(no - 1).getSongName() + "song played");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("no songs found");
			}
		} catch (NullPointerException e) {
			System.out.println("No Songs in List. Add some songs first.");
		}catch(InputMismatchException e) {
			System.out.println("invalid input");
		}

	}

	public void PlayAllSong() {
		for (int i = 0; i < music.size(); i++) {
			System.out.println(music.get(i).getSongName() + " song played");
		}
	}

	public void PlayRandom() {
		double a = (Math.random() * (music.size() - 0 + 1)) + 0;
		System.out.println(music.get((int) a).getSongName() + "song played");
	}

	public void update() {
		try{
			displayListOfSong();
		System.out.println("choose song id no");
		int n = sc.nextInt();
		System.out.println("1.id \n 2.song name\n 3.movie name \n 4.composer \n 5.length \n 6 back");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("enter new id");
			music.get(n - 1).setId(sc.nextInt());
			break;
		case 2:
			System.out.println("enter song by song name");
			music.get(n - 1).setSongName(sc.next());
			break;
		case 3:
			System.out.println("enter song by movie name");
			music.get(n - 1).setMovieName(sc.next());
			break;
		case 4:
			System.out.println("enter song by composer");
			music.get(n - 1).setComposer(sc.next());
			break;
		case 5:
			System.out.println("enter song by song length");
			music.get(n - 1).setLength(sc.nextDouble());
			break;
		case 6:
			break;
		}
		
		}catch(NullPointerException e) {
			System.out.println("invalid input");
		}catch(InputMismatchException e) {
			System.out.println("invalid input");
		}


	}
		

}

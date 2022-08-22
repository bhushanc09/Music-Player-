package com.bhushan.musicplayer.musicplayer;

public class Song {

	int id;
	String songName;
	String singerName;
	String movieName;
	String composer;
	double length;

	Song() {
//		this.id=id;
//		this.songName=song;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "" + id + "|" + songName + "|" + singerName + "|" + movieName + "|" + composer + "|" + length + "\n";
	}

}

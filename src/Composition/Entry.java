package Composition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

public class Entry {
	private String title;
	private String date;
	private
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MM-dd-yyyy hh:mm:s a");
	private String body;

	public Entry(String title, String body) {
		this.title = title;
		this.body = body;
	}

	public Entry(String title) {
		this.title = title;
	}


	public String getEntryTitle() {
		return title;
	}

	public void addEntryTitle(String title) {
		this.title = title;
	}


	public void addEntryDate() {
		this.date = dateTimeFormatter.format(LocalDateTime.now());
	}

	public String getEntryDate() {
		return date;
	}


}

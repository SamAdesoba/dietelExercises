package Composition;

import java.util.ArrayList;

public class Diary {
	private String userName;
	private String password;
	private String phoneNumber;
	private String email;
	private int numberOfEntries = 0;
	private Entry entry = new Entry("Adesoba", "Samson");
	private boolean isLock = true;

	private ArrayList<Entry> entries;
	public Diary(String userName, String password, String phoneNumber, String email) {
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		entries = new ArrayList<>();
	}

	public String getUserName() {
		return userName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public boolean isLock() {
		return isLock;
	}

	public void unlock(String password) {
		if(this.password.equals(password)) isLock = false;
	}

	public int getNumberOfEntries() {
		return numberOfEntries;
	}

	public void Lock() {
		 isLock = true;
	}


	public String getTitle() {
		return entry.getEntryTitle();
	}

	public void addTitle() {
		entry.addEntryTitle("Adesoba");
	}

	public void addDate() {
		entry.addEntryDate();
	}

	public String getDate() {
		return entry.getEntryDate();
	}

	public void addEntry(String title, String body) {
		Entry firstEntry = new Entry(title, body);
		entries.add(firstEntry);
		numberOfEntries++;
	}

	public void deleteEntry(String title, String body) {
		Entry firstEntry = new Entry(title, body);
		entries.remove(firstEntry);
		numberOfEntries--;
	}

	public void deleteEntryByTitle(String title, String body) {

	}


}

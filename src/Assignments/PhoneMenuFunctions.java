package Assignments;

import java.util.Scanner;

public class PhoneMenuFunctions {
		private static Scanner input = new Scanner(System.in);

		public static void main(String[] args) {
			menu();
		}
		private static void menu() {
			menuList();
			int menu = input.nextInt();
			switch (menu) {
				case 1 -> phoneBook();
				case 2 -> message();
				case 3 -> System.out.println("Begin Chat");
				case 4 -> callRegister();
				case 5 -> tones();
				case 6 -> settings();
				case 7 -> System.out.println("Call divert");
				case 8 -> System.out.println("Games");
				case 9 -> System.out.println("Calculator");
				case 10 -> System.out.println("Reminders");
				case 11 -> clock();
				case 12 -> System.out.println("Profiles");
				case 13 -> System.out.println("SIM services");
			}
		}

		private static void menuList() {
			System.out.println("""
                        Welcome to Nokia 3310;
                        Enter:
                        1 -> Phone book
                        2 -> Messages
                        3 -> Chat
                        4 -> Call register
                        5 -> Tones
                        6 -> Settings
                        7 -> Call divert
                        8 -> Games
                        9 -> Calculator
                        10 -> Reminder
                        11 -> Clock
                        12 -> Profiles
                        13 -> SIM services
                        """);
		}

		private static void clock() {
			System.out.println("Clock");
			System.out.println("""
									Enter:
									1 -> Alarm clock
									2 -> Clock settings
									3 -> Date setting
									4 -> Stopwatch
									5 -> Countdown timer
									6 -> Auto update of date and time
									0 -> Back to menu
									""");
			int securitySettings = input.nextInt();
			switch (securitySettings) {
				case 1 -> System.out.println("Alarm clock");
				case 2 -> System.out.println("Clock settings");
				case 3 -> System.out.println("Date setting");
				case 4 -> System.out.println("Stopwatch");
				case 5 -> System.out.println("Countdown timer");
				case 6 -> System.out.println("Auto update of date and time");
				case 0 -> menu();
			}
		}

		private static void settings() {
			System.out.println("Welcome to Settings");
			System.out.println("""
									Enter:
									1 -> Call settings
									2 -> Phone settings
									3 -> Security settings
									4 -> Restore factory settings
									0 -> Back to menu
									""");
			int settings = input.nextInt();
			switch (settings) {
				case 1 -> callSettings();
				case 2 -> phoneSettings();
				case 3 -> securitySettings();
				case 4 -> System.out.println("Restore factory settings");
				case 0 -> menu();
			}
		}

		private static void securitySettings() {
			System.out.println("Security settings");
			System.out.println("""
									Enter:
									1 -> PIN code request
									2 -> Call barring service
									3 -> Fixed dialling
									4 -> Closed user group
									5 -> Phone security
									6 -> Confirm SIM service actions
									0 -> Back to settings
									00 -> Back to menu
									""");
			String securitySettings = input.next();
			switch (securitySettings) {
				case "1" -> System.out.println("PIN code request");
				case "2" -> System.out.println("Call barring service");
				case "3" -> System.out.println("Fixed dialling");
				case "4" -> System.out.println("Closed user group");
				case "5" -> System.out.println("Phone security");
				case "6" -> System.out.println("Confirm SIM service actions");
				case "0" -> settings();
				case "00" -> menu();
			}
		}

		private static void phoneSettings() {
			System.out.println("Phone settings");
			System.out.println("""
									Enter:
									1 -> Language
									2 -> Cell info display
									3 -> Welcome note
									4 -> Network selection
									5 -> Lights
									6 -> Confirm SIM service actions
									0 -> Back to settings
									00 -> Back to menu
									""");
			String phoneSettings = input.next();
			switch (phoneSettings) {
				case "1" -> System.out.println("Language");
				case "2" -> System.out.println("Cell info display");
				case "3" -> System.out.println("Welcome note");
				case "4" -> System.out.println("Network selection");
				case "5" -> System.out.println("Lights");
				case "6" -> System.out.println("Confirm SIM service actions");
				case "0" -> settings();
				case "00" -> menu();
			}
		}

		private static void callSettings() {
			System.out.println(" Welcome to Call settings");
			System.out.println("""
									Enter:
									1 -> Automatic redial
									2 -> Speed dialling
									3 -> Call waiting options
									4 -> Own number sending
									5 -> Phone line in use
									6 -> Automatic answer
									0 -> Back to settings
									00 -> Back to menu
									""");
			String showCallSettings = input.next();
			switch (showCallSettings) {
				case "1" -> System.out.println("Automatic redial");
				case "2" -> System.out.println("Speed dialling");
				case "3" -> System.out.println("Call waiting options");
				case "4" -> System.out.println("Own number sending");
				case "5" -> System.out.println("Phone line in use");
				case "6" -> System.out.println("Automatic answer");
				case "0" -> settings();
				case "00" -> menu();
			}
		}

		private static void tones() {
			System.out.println("Welcome to Tones");
			System.out.println("""
									Enter:
									1 -> Ringing tone
									2 -> Ringing volume
									3 -> Incoming call alert
									4 -> Composer
									5 -> Message alert tone
									6 -> Keypad tones
									7 -> Warning and game tones
									8 -> Vibrating alert
									9 -> Screen saver
									0 -> Back to menu
									""");
			int tones = input.nextInt();
			switch (tones) {
				case 1 -> System.out.println("Ringing tone");
				case 2 -> System.out.println("Ringing volume");
				case 3 -> System.out.println("Incoming call alert");
				case 4 -> System.out.println("Composer");
				case 5 -> System.out.println("Message alert tone");
				case 6 -> System.out.println("Keypad tones");
				case 7 -> System.out.println("Warning and game tones");
				case 8 -> System.out.println("Vibrating alert");
				case 9 -> System.out.println("Screen saver");
				case 0 -> menu();
			}
		}

		private static void callRegister() {
			System.out.println("Welcome to Call register");
			System.out.println("""
									Enter:
									1 -> Missed calls
									2 -> Received calls
									3 -> Dialed numbers
									4 -> Erase recent call lists
									5 -> Show call duration
									6 -> Show call costs
									7 -> Call cost settings
									8 -> Prepaid credit
									0 -> Back to menu
									""");
			int callRegister = input.nextInt();
			switch (callRegister) {
				case 1 -> System.out.println("Missed calls");
				case 2 -> System.out.println("Received calls");
				case 3 -> System.out.println("Dialed numbers");
				case 4 -> System.out.println("Erase recent call lists");
				case 5 -> showCallDuration();
				case 6 -> showCallCost();
				case 7 -> callCostSettings();
				case 8 -> System.out.println("Prepaid credit");
				case 0 -> menu();
			}
		}

		private static void callCostSettings() {
			System.out.println("Call cost settings");
			System.out.println("""
									Enter:
									1 -> Call cost limit
									2 -> Show cost in
									0 -> Back to call register
									00 -> Back to menu
									""");
			String callCostSettings = input.next();
			switch (callCostSettings) {
				case "1" -> System.out.println("Call cost limit");
				case "2" -> System.out.println("Show cost in");
				case "0" -> callRegister();
				case "00" -> menu();
			}
		}

		private static void showCallCost() {
			System.out.println("Show call costs");
			System.out.println("""
									Enter:
									1 -> Last call cost
									2 -> All calls cost
									3 -> Clear counters
									0 -> Back to callRegister
									00 -> Back to menu
									""");
			String showCallCost = input.next();
			switch (showCallCost) {
				case "1" -> System.out.println("Last call cost");
				case "2" -> System.out.println("All calls cost");
				case "3" -> System.out.println("Clear counters");
				case "0" -> callRegister();
				case "00" -> menu();
			}
		}

		private static void showCallDuration() {
			System.out.println("Show call duration");
			System.out.println("""
									Enter:
									1 -> Last call duration
									2 -> All calls duration
									3 -> Received call duration
									4 -> Dialed call duration
									5 -> Clear timers
									0 -> Back to call register
									00 -> Back to menu
									""");
			String showCallDuration = input.next();
			switch (showCallDuration) {
				case "1" -> System.out.println("Last call duration");
				case "2" -> System.out.println("All calls duration");
				case "3" -> System.out.println("Received call duration");
				case "4" -> System.out.println("Dialed call duration");
				case "5" -> System.out.println("Clear timers");
				case "0" -> callRegister();
				case "00" -> menu();
			}
		}

		private static void message() {
			System.out.println("Welcome to Message");
			System.out.println("""
								Enter:
								1 -> Write messages
								2 -> Inbox
								3 -> Outbox
								4 -> Picture messages
								5 -> Templates
								6 -> Smileys
								7 -> Message settings
								8 -> Info service
								9 -> Voice mailbox number
								10 -> Service command editor
								0 -> Back to menu
								""");
			int messages = input.nextInt();
			switch (messages) {
				case 1 -> System.out.println("Write messages");
				case 2 -> System.out.println("Inbox");
				case 3 -> System.out.println("Outbox");
				case 4 -> System.out.println("Picture messages");
				case 5 -> System.out.println("Templates");
				case 6 -> System.out.println("Smileys");
				case 7 -> messageSettings();
				case 8 -> System.out.println("Info service");
				case 9 -> System.out.println("Voice mailbox number");
				case 10 -> System.out.println("Service command editor");
				case 0 -> menu();
			}
		}

		private static void messageSettings() {
			System.out.println("Welcome to Message settings");
			System.out.println("""
								Enter:
								1 -> Message centre number
								2 -> Messages sent as
								3 -> Message validity
								0 -> Back to Message
								00 -> Back to Menu
								""");
			String messageSettings = input.next();
			switch (messageSettings) {
				case "1" -> set1();
				case "2" -> common();
				case "0" -> message();
				case "00" -> menu();
			}
		}

		private static void common() {
			System.out.println("Welcome to Common");
			System.out.println("""
									Enter:
									1 -> Delivery report
									2 -> Reply via same centre
									3 -> Character support
									4 -> Info services
									5 -> Voice mailbox number
									6 -> Service command editor
									7 -> Back to message Settings
									0 -> Back to message
									00 -> Back to menu
									""");
			String common = input.next();
			switch (common) {
				case "1" -> System.out.println("Delivery report");
				case "2" -> System.out.println("Reply via same centre");
				case "3" -> System.out.println("Character support");
				case "4" -> System.out.println("Info services");
				case "5" -> System.out.println("Voice mailbox number");
				case "6" -> System.out.println("Service command editor");
				case "7" -> messageSettings();
				case "0" -> message();
				case "00" -> menu();
			}
		}

		private static void set1() {
			System.out.println("Welcome to Set 1");
			System.out.println("""
									Enter:
									1 -> Message centre number
									2 -> Messages sent as
									3 -> Message validity
									4 -> Back to message Settings
									0 -> Back to message
									00 -> Back to menu
									""");
			String set = input.next();
			switch (set) {
				case "1" -> System.out.println("Message centre number");
				case "2" -> System.out.println("Messages sent as");
				case "3" -> System.out.println("Message validity");
				case "4" -> messageSettings();
				case "0" -> message();
				case "00" -> menu();
			}
		}

		private static void phoneBook() {
			phoneBookList();
			int phoneBook = input.nextInt();
			switch (phoneBook) {
				case 1 -> System.out.println("Search");
				case 2 -> System.out.println("Service Numbers");
				case 3 -> System.out.println("Add name");
				case 4 -> System.out.println("Erase");
				case 5 -> System.out.println("Edit");
				case 6 -> System.out.println("Assign Tone");
				case 7 -> System.out.println("Send b'card");
				case 8 -> Options();
				case 9 -> System.out.println("Speed dail");
				case 10 -> System.out.println("Voice tags");
				case 0 -> menu();
			}
		}

		private static void phoneBookList() {
			System.out.println("Welcome to Phone Book");
			System.out.println("""
								Enter:
								  1 -> Search
								  2 -> Service Numbers
								  3 -> Add name
								  4 -> Erase
								  5 -> Edit
								  6 -> Assign Tone
								  7 -> Send b'card
								  8 -> Options
								  9 -> Type of view
								  10 -> Voice tags
								  0 -> Back
								  """);
		}

		private static void Options() {
			System.out.println(" Welcome to Options");
			System.out.println("""
								Enter:
								  1 -> Type of view
								  2 -> Memory Status
								  0 -> Back to phoneBook
								  00-> Back to menu
								  """);
			String options = input.next();
			switch (options) {
				case "1" -> System.out.println("Type of view");
				case "2" -> System.out.println("Memory Status");
				case "0" -> phoneBook();
				case "00" -> menu();
			}
		}
}
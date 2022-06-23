package practise;

public enum People {
	WORM("AMAKA"),
	DEJI(),
	BUNMI("MERCY", "FLUORENCE");

	private String[] boyFriends;

	People(String name){
		boyFriends = new String[1];
		boyFriends[0] = name;
	}

	People(String... names){
		boyFriends = names;
	}

	public String[] getBoyFriendsName(){
		return boyFriends;
	}

	public void greetBoyFriends(){
		for (String boyFriend:
			  boyFriends) {
			System.out.println("Hello " + boyFriend);
		}
	}
}

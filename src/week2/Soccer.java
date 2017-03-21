package week2;
/*Overriding concept*/

class Sports {
	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}

	public static void main(String[] args) {
		new Sports().getName();
		new Sports().getNumberOfTeamMembers();
	}
}

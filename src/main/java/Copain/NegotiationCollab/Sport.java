package Copain.NegotiationCollab;

enum Sport {
	
	Marche("marche"),
	CourseaPied("course a pied"),
	Natation("natation"),
	Football("football"),
	Escalade("escalade"),
	Boxe("boxe"),
	Judo("judo"),
	Yoga("yoga"),
	Pilate("pilate"),
	Equitation("equitation"),
	Musculation("musculation"),
	Cyclisme("cyclisme");
	
	// autre sport, demander à l'equipe ???
	
	private String symbole;

	Sport(String symbole) {
		this.symbole = symbole;
	}

	public String toString() {
		return this.symbole;
	}
}

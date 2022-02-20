package exercice1;

public class Livre {
	private String titre;
	private Auteur[] tabAuteurs;

	public Livre(String titre,Auteur [] tabAuteurs) {
		this.titre=titre;
		this.tabAuteurs=tabAuteurs;
	}

	public String getTitre() {
		return titre;
	}

	public Auteur getPremierAuteur() {
		if(tabAuteurs!=null)
			return tabAuteurs[0];
		return null;
	}
	public Auteur[] getAuteurs() {
		return tabAuteurs;
	}

}

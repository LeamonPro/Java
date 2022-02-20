package exercice1;

public class Test {

	public static void main(String[] args) {
		Auteur A1 = new Auteur("Aymen");
		Auteur A2 = new Auteur("Ahmed");
		Auteur A3 = new Auteur("Oussema");
		Auteur[] a = new Auteur[1];
		a[0] = A1;
		Livre L1 = new Livre("La fuite", a);
		Auteur[] b = new Auteur[2];
		b[0] = A2;
		b[1] = A1;
		Livre L2 = new Livre("La richesse", b);
		Auteur[] c = new Auteur[2];
		c[0] = A3;
		c[1] = A2;
		Livre L3 = new Livre("Lalaland", c);
		A1.ajouterLivre(L1);
		A1.ajouterLivre(L2);
		A2.ajouterLivre(L2);
		A2.ajouterLivre(L3);
		A3.ajouterLivre(L3);
		if (L1.getPremierAuteur()!=null) {
			System.out.println("Description de 1 auteur de l1");
			L1.getPremierAuteur().afficher();
			}
		else 
			System.out.println("not found");
		if(L3.getAuteurs()!=null) {
			System.out.println("desc de tous les auteurs de l3");
			for (Auteur l : L3.getAuteurs()) {
				l.afficher();}
		}
		else 
			System.out.println("not found");
		if(L1.getPremierAuteur()!=null) {
			System.out.println("nom du 1 auteur de l1");
		System.out.println(L1.getPremierAuteur().getNom());}
		

	}

}

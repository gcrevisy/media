package fr.gcrevisy.media.model.metier;

public class Realisateur {
 private String nom;
 private String Prenom;
 private String birthday;
 
 public Realisateur(String nom, String prenom, String birthday) {
		super();
		this.nom = nom;
		Prenom = prenom;
		this.birthday = birthday;
	}
  
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}

 
 
}

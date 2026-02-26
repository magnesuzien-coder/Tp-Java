package Modele;

public class Personne {
	private int id;
	private String nom;
	private String Prenom;
	private String Password;
	private String Login;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	//Constructeur sans paramètre
	public Personne() {
		super();
	}
	//Constructeur avec paramètre
	public Personne(int id, String nom, String prenom, String password, String login) {
		super();
		this.id = id;
		this.nom = nom;
		Prenom = prenom;
		Password = password;
		Login = login;
	}
	
	
}


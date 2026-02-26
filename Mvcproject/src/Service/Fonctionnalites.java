package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.Jdbc;
import Modele.Personne;

public class Fonctionnalites {

	public void ajouter(Personne p) {
		Jdbc jb = new Jdbc();
		jb.connect();
		String req = "INSERT INTO Personne(Nom,Prenom,Password,Login) VALUES('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getPassword()+"','"+p.getLogin()+"')";
		try {
			jb.sta.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void supprimer(int id ) {
		Jdbc jb = new Jdbc();
		jb.connect();
		String req = "DELETE FROM Personne where id='"+id+"'";
		try {
			jb.sta.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modifier(Personne p) {
		Jdbc jb = new Jdbc();
		jb.connect();
		String req="Update Personne set nom= '"+p.getNom()+"', '"+p.getPrenom()+"', '"+p.getPassword()+"', '"+p.getLogin()+"'";
		try {
			jb.sta.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet connexion(String log, String password) {
		ResultSet rs = null;
		Jdbc jb = new Jdbc();
		jb.connect();
		String req = "SELECT  Login,Password FROM personne where Login='"+log+"' AND Password='"+password+"'";
		try {
			rs= jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public void listePersonne() {
		Jdbc jb = new Jdbc();
		jb.connect();
		String req="SELECT * FROM Personne";
		try {
			jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void rechercher(int id) {
		Jdbc jb = new Jdbc();
		jb.connect();
		String req="SELECT * FROM Personne WHERE ID='"+id+"'";
		try {
			jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

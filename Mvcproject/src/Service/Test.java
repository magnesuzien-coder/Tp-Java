package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.Jdbc;
import Modele.Personne;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jdbc jb = new Jdbc();
		//jb.connect();
		Personne p = new Personne(1, "Ndiaye", "Magne", "magne123","passer");
		Fonctionnalites f = new Fonctionnalites();
		//f.ajouter(p);
		ResultSet rs =f.connexion("m1","1234");
		try {
			if( rs.next()) {
				System.out.println("Login et mot de passe correct");
			}
			else {
				System.out.println("Login ou mot de passe incorrect ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
    
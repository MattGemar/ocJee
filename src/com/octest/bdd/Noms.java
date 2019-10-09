package com.octest.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.Utilisateur;

public class Noms {

	public List<Utilisateur> getUsers(){
		
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		
		//Chargement du driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			
		}
		
		
		//Connexion à la base
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "");
			statement = connexion.createStatement();
			
			//Execution de la requête
			resultat = statement.executeQuery("SELECT * FROM noms;");
			
			while (resultat.next()) {
				
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				
				users.add(utilisateur);
			}
		}catch (SQLException e) {
			
		}finally {
			try {
				if (resultat != null) {
					resultat.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connexion != null) {
					connexion.close();
				}
			}catch( SQLException ignore) {
				ignore.printStackTrace();
			}
		}
		return users;
		
	}
}

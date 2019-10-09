package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String resultat;
	
	public void checkId(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(pass.contentEquals(login+"123")) {
			resultat = "connexion réussie";
		}else {
			resultat = "Problème de connexion";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil du Site</title>
    </head>

    <body>
    	<%@ include file="menu.jsp"%>
    	<%
        	String heure = (String) request.getAttribute("heure");
    	    
    	    if(heure.equals("jour")){
    	    	out.println("<p>Bonjour de la page d'accueil</p>");
    	    }else{
    	    	out.println("<p>Bonsoir de la page d'accueil</p>");	
    	    }			
        %>
    </body>
</html>
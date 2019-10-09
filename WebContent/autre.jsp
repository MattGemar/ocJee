<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
    <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if>
        <p>
            <a href="/test/bonjour">retour</a>
        </p>
</body>
</html>
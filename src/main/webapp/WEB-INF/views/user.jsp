<%@ page session="false" contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="${title}">

    <h1>
    	<fmt:message key="user.text">Burada user servisinden donen veri yazdirilacak!</fmt:message>
	</h1>

	<pre>
	Id :<c:out value="${user.id}"></c:out>
	İsim :<c:out value="${user.name}"></c:out>
	</pre>

</t:layout>

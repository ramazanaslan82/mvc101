<%@ page session="false" contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="${title}">

    <h1>
		<fmt:message key="about.text">這個網頁是關於頁面</fmt:message>
	</h1>
	
</t:layout>

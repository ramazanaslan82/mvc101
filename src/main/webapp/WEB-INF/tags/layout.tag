<jsp:directive.tag language="java" pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ attribute name="title" type="java.lang.String" %>
<!doctype html>
<head>
	<title><c:out value="${title}"/></title>
    <%@include file="/WEB-INF/views/common/meta.jsp" %>
</head>
<body>

	<%@include file="/WEB-INF/views/common/header.jsp" %>
	<div id="container">
    	<jsp:doBody />
    	<P><fmt:message key="layout.time">The time on the server is</fmt:message> <c:out value="${serverTime}"></c:out>. </P>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp" %>

</body>
</html>

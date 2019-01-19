<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Shopping - ${title}</title>

<script>
window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
<div class="wrapper">
		<!-- Navbar Section -->
		<%@include file="./shared/navbar.jsp"%>

	<!-- Content section -->
	<div class="content">

		<!-- Home content -->
		<c:if test="${UserClickHome == true}">
		<%@include file="home.jsp"%>
		</c:if>

		<c:if test="${UserClickContact == true}">
		<%@include file="contact.jsp"%>
		</c:if>		
		
		<c:if test="${UserClickAbout == true}">
		<%@include file="about.jsp"%>
		</c:if>
		
		<c:if test="${UserClickAllProducts == true or userClickCategoryProducts == true}">
		<%@include file="listProducts.jsp"%>
		</c:if>
		
	</div>

	<!-- Footer Section -->
	<%@include file="./shared/footer.jsp" %>	
	
	
	<!-- JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/myapp.js"></script>

</div>
</body>

</html>

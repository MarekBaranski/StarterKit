<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Books</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Delete Books</h1>
				<p>This book was deleted</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="col-md-7 col-md-offset-7">
			<p>
				<a href="/webstore" class="btn btn-default"> <span
					class="glyphicon glyphicon-homen" /></span> Home
				</a>
			</p>
		</div>
	</section>


	<section class="container">
		<div class="row">
			<div class="col-md-5">
			<h3>${book.id}</h3>
				<p>
					<strong>Book title: </strong>${book.title}</span>
				</p>
				<p>
					<strong>Wrote by</strong>: ${book.authors}
				</p>

				<p>
					<a href="<spring:url value="/books" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> back
					</a>
				</p>
			</div>
		</div>
	</section>
</body>
</html>

<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Hello</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<div class="col-md-7 col-md-offset-7">
					<a href="/webstore/login" class="btn btn-success"> <span
						class="glyphicon glyphicon-user" /></span> Log in
					</a>
				</div>
				<h1>${greeting}</h1>
				<p>${info}</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<h3>Books</h3>
						<p>Display all books</p>
						<p>
							<a href="/webstore/books" class="btn btn-default"> <span
								class="glyphicon-info-sign glyphicon" /></span> Show all books
							</a>
						</p>
						<p>Search book</p>
						<p>
							<a href="/webstore/books/search" class="btn btn-default">
								<span class="glyphicon glyphicon-search" /></span> Search
							</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<h3>Add book</h3>
						<p>Create new book</p>
						<p>
							<a href="/webstore/books/add" class="btn btn-default"> <span
								class="glyphicon-info-sign glyphicon" /></span> Add book
							</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>

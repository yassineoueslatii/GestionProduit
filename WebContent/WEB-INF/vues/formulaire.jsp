<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>New Product</title>
</head>
<body>
<form action="/GestionProduit/add" method="post">
<div>
<label>Product name</label>
<input type="text" name="name" placeholder="Introduce the product name">
</div>
<div>
<label>Description of the product</label>
<textarea name="description" placeholder="Introduce the product description"></textarea>
</div>
<div>
<input type="submit" value="save Product">
</div>

</form>

</body>
</html>
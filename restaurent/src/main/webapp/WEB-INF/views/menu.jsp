<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Menu Items</h2>
<a href="/menu/add">Add New</a>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th><th>Description</th><th>Actions</th></tr>
<c:forEach var="menu" items="${menus}">
<tr>
  <td>${menu.id}</td>
  <td>${menu.name}</td>
  <td>${menu.price}</td>
  <td>${menu.description}</td>
  <td><a href="/menu/delete/${menu.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body></html>
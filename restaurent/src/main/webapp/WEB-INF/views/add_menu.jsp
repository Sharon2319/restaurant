<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Add Menu</h2>
<form action="/menu/save" method="post">
    Name: <input type="text" name="name"/><br/>
    Price: <input type="text" name="price"/><br/>
    Description: <input type="text" name="description"/><br/>
    <input type="submit" value="Save"/>
</form>
</body></html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table border="5" cellspacing=5 cellpadding=2 id="myTable">
    <tr><td><B>ID</B></a></td><td><B>Name</B></td><td><B>Salary</B></td></tr>
    <c:forEach var="payRegister" items="${payRegisterList}">
        <tr><td><a href='#' name="${payRegister.id}" onmouseover='javascript:viewAll(${payRegister.id})'>${payRegister.id}</a></td>
            <td>${payRegister.username}</td>
            <td>${payRegister.salary}</td>
        </tr>
    </c:forEach>
</table>
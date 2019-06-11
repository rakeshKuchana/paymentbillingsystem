<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
    <table border="5" cellspacing=5 cellpadding=2 id="myTable">
        <tr><td><B>ID</B></td><td><B>Name</B></td><td><B>Mobile</B></td></tr>
        <c:forEach var="student" items="${studentList}">
            <tr><td><a href="#" name="${student.id}" onmouseover="javascript:sendGenInfo(${student.id})">${student.id}</a></td>
                <td>${student.name}</td>
                <td>${student.mobile}</td>
            </tr>
        </c:forEach>

    </table>
</body>
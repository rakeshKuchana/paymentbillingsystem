<table border="5" cellspacing=5 cellpadding=2>
    <tr><td><B>ID</B></td><td><B>User name</B></td><td><B>Password</B></td><td><B>Date of joining</B></td><td><B>Date of Birth</B></td><td><B>Salary</B></td><td><B>Remove</B></td></tr>
    <tr><td>${payRegister.id}</td>
        <td>${payRegister.username}</td>
        <td>${payRegister.userpass}</td>
        <td>${payRegister.dateOfJoining}</td>
        <td>${payRegister.dateOfBirth}</td>
        <td>${payRegister.salary}</td>
        <td><a href="/paymentbillingsystem/payregister/aremove?val='${payRegister.id}'" name="${payRegister.id}">Delete</a></td>
    </tr>
</table>
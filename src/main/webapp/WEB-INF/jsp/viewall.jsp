<body>
    <table border='5' cellspacing=5 cellpadding=2>
        <tr><td><B>ID</B></td><td><B>Total Fee</B></td><td><B>Paid Amount</B></td><td><B>Balance</B></td></tr>
        <tr><td><a href='#' name="${student.id}" onmouseover="javascript:viewAllInfo(${student.id})">${student.id}</a></td>
        <tr><td><B>Total Fee</B></td><td>${student.fee}</td></tr>
        <tr><td><B>Paid Amount</B></td><td>${student.paid}</td></tr>
        <tr><td><B>Balance</B></td><td>${student.balance}</td></tr>
    </table>
</body>
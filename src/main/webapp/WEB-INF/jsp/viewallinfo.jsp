<body>
    <table border='5' cellspacing=5 cellpadding=2>
        <tr><td><B>ID</B></td><td>${student.id}</td></tr>
        <tr><td><B>Name</B></td><td>${student.name}</td></tr>
        <tr><td><B>Course</B></td><td>${student.course}</td></tr>
        <tr><td><B>Mobile</B></td><td>${student.mobile}</td></tr>
        <tr><td><B>Date of submission</B></td><td>${student.feesub}</td></tr>
        <tr><td><B>Total Fee</B></td><td>${student.fee}</td></tr>
        <tr><td><B>Paid Amount</B></td><td>${student.paid}</td></tr>
        <tr><td><B>Balance</B></td><td>${student.balance}</td></tr>
        <a href='#' name="${student.id}" onmouseover="javascript:sendGenInfo(${student.id})"><font style='color: navy;'><B>General Information</B></font></a>
    </table>
</body>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="/paymentbillingsystem/student/save1" modelAttribute="student" name="myform" id="myform">
    <table cellspacing=15 cellpadding=15>
        <tr><td><font style='color:navy'><B>Student Detail:</B></font></td></tr>
        <tr><td><B>ID:</B></td><td><form:input type="text" path="id"/></td></tr>
        <tr><td><B>Name:</B></td><td><form:input type="text" path="name"/></td></tr>
        <tr><td><B>Course:</B></td><td><form:input type="text" path="course"/></td></tr>
        <tr><td><B>Mobile:</B></td><td><form:input type="text" path="mobile"/></td></tr>
        <tr><td><B>Father's Name:</B></td><td><form:input type="text" path="fatherName"/></td></tr>
        <tr><td><B>Mother's Name:</B></td><td><form:input type="text" path="motherName"/></td></tr>
        <tr><td><B>Qualification:</B></td><td><form:input type="text" path="qualification"/></td></tr>
        <tr><td><B>Date of Birth:</B></td><td><form:input type="text" path="dateOfBirth"/></td></tr>
        <tr><td><B>Date of Joining:</B></td><td><form:input type="text" path="dateOfJoining"/></td></tr>
        <tr><td><B>Date of Submission:</B></td><td><form:input type="text" path="feesub"/></td></tr>
        <tr><td><B>Paid:</B></td><td><form:input type="text" path="paid"/></td></tr>
        <tr><td><B>Fee:</B></td><td><form:input type="text" path="fee"/></td></tr>
        <tr><td><B>Balance:</B></td><td><form:input type="text" path="balance"/></td></tr>
        <tr><td><B>Address:</B></td><td><form:input type="text" path="address"/></td></tr>
        <tr><td><B>Description:</B></td><td><form:input type="text" path="description"/></td></tr>
        <tr><td><B>Trainer:</B></td><td><form:input type="text" path="trainer"/></input</td></tr>
        <tr><td></td><td><input style='padding:3px 3px' value='Edit & Save' type='submit'/></td></tr>
    </table>
</form:form>
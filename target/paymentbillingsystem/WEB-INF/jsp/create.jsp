<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <div id="outer">
        <jsp:include page="header.jsp"></jsp:include>


            <div id="main">

                <h3 style="color: navy;" align="center"><B>Consultant:-   JavaTpoint</B></h3>
                <div id="box">

                <form:form modelAttribute="payRegisterForm" name="myform" action="/paymentbillingsystem/payregister/asave">
                    <table>
                        <tr><td>Branch:</td><td><form:select path="branch">
                                    <form:option value="" label="Select a Branch"/>
                                    <form:option value="Hyderabad" label="Hyderabad"/>
                                    <form:option value="Warangal" label="Warangal"/>
                                    <form:option value="Delhi" label="Delhi"/>
                                </form:select></td></tr>
                        <tr><td><br></td></tr>
                        <tr><td>Username:  </td><td><form:input type="text" path="username"/></td></tr>
                        <tr><td><br></td></tr>

                        <tr><td>Password:  </td><td><form:input type="password" path="userpass"/></td></tr>
                        <tr><td><br></td></tr>
                        <tr><td>Date of Joining:</td><td><form:input type="text" path="dateOfJoining"/></td></tr>
                        <tr><td><br></td></tr>
                        <tr><td>Date of Birth:</td><td><form:input type="text" path="dateOfBirth"/></td></tr>
                        <tr><td><br></td></tr>
                        <tr><td>Salary:</td><td><form:input type="text" path="salary"/></td></tr>
                        <tr><td><br></td></tr>
                        <tr><td></td><td><input type="submit" value="create" style="padding: 2"></td></tr>
                        <tr><td><br></td></tr>
                    </table>
                    <div id="location" align="left"></div>
                </form:form>

            </div>

        </div>




        <jsp:include page="footer.jsp"></jsp:include>

    </div>

</html>

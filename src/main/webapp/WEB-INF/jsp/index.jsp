<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>
            Welcome Page
        </title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />" />
    </head>
    <body>
        <div id="outer">
            <div id="header">

                <div id="logo">
                    <h1>
                        Payment Billing System
                    </h1>
                </div>	
            </div>
            <div id="banner">
                <div class="captions">
                    <h2>Sign in</h2>
                </div>
                <img src="<c:url value="/resources/images/banner.jpg" />" alt="" />

            </div>

            <div id="nav">
                <ul>
                    <li class="first">
                        <a href="/paymentbillingsystem/home">Home</a>
                    </li>
                    <li>
                        <a href="/paymentbillingsystem/generalinfo">New Registration</a>
                    </li>
                    <li>
                        <a href="/paymentbillingsystem/modify">Modify Detail</a>
                    </li>
                    <li>
                        <a href="/paymentbillingsystem/ahome">Administrator</a>
                    </li>

                    <li>
                        <a href="/paymentbillingsystem/contactus">Contact us</a>
                    </li>
                </ul><br class="clear" />
            </div>

            <%
                if (request.getAttribute("notlogin_msg") != null)
                {
                    out.print("<font size='2' color='red' m>");
                    out.print(request.getAttribute("notlogin_msg"));
                    out.print("</font>");
                }
            %>



            <%
                if (request.getAttribute("Error") != null)
                {
                    out.print("<font size='2' color='red' m>");
                    out.print(request.getAttribute("Error"));
                    out.print("</font>");
                }
            %>
            <div id="main">
                <table align="right">

                    <tr align="center"><td style="color: navy;"><B>Notice</B></td></tr>
                    <tr><td><div><marquee direction="up" width="300px" truespeed="truespeed" onmouseover="stop()" onmouseout="start()" style="color: red;">Last Date of fee Submission is 15/10/12
                                    After that You'll have to pay 50 rupees 
                                    per day as a fine and your tutuion fee
                                    exclusively </marquee></div></td></tr></table>
                <center><a href="/paymentbillingsystem/admin"><font style="color: navy; ">Login As Administrator</font></a></center>
                <div id="sidebar">
                    <div class="box">

                        <form method="post" action="/paymentbillingsystem/loginprocess" >
                            <table>
                                <tr><td style="color:navy;"><B> Login Form</B></td></tr>
                                <tr><td><br></td></tr>
                                <tr><td>Branch:</td><td><select name="branch">
                                            <option>Select a Branch</option>
                                            <option>Hyderabad</option>
                                            <option>Warangal</option>
                                            <option>Delhi</option>
                                        </select></td></tr>
                                <tr><td><br></td></tr>
                                <tr><td>User Name:</td><td><input type="text" name="username"/></td></tr>
                                <tr><td><br></td></tr>
                                <tr><td>Password:</td><td><input type="password" name="userpass"/></td></tr>	
                                <tr><td><br></td></tr>
                                <tr><td>      </td><td><input type="submit" value="Sign in"></td></tr>
                            </table>
                        </form>		 
                    </div>
                </div><br class="clear" />
            </div>		




            <div id="header">
                <h4>
                    Copyright 2012 All rights reserved.fore more information please visit: <a href="www.javatpoint.com"><font style="color: yellow;">javatpoint.com</font></a>
                </h4>
            </div>

        </div>
    </body>
</html>
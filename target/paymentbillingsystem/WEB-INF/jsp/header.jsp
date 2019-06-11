<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>



    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />" />

    <div id="header">

        <div id="logo">
            <h1> 
                Payment Billing System
            </h1>
        </div>	
    </div>
    <div id="banner">
        <div class="captions">
            <h2><a href="/paymentbillingsystem/logout"><font style="color: lime">Log out</a></h2>
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

</html>
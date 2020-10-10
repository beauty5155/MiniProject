<%-- 
    Document   : reg_cus_contact
    Created on : Sep 30, 2020, 11:48:27 AM
    Author     : official
--%>

<%@page import="servpack.Rcustomer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact List jsp </title>
        <link rel = "stylesheet" type = "text/css" href = "cus.css">
    </head>
    <body class="bg3">
        <div>
            <div class="container">
                <h1> Regular Customer Contact List</h1>
                <br><br>
                <ul class="nav nav-tabs">
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="/PPCMS/Cus">Customer</a></li>
                    <li class="active"><a href="/PPCMS/RegCusContact">About Customer</a></li>
                    <li><a href="/PPCMS/CreditAccnt">Credit Accounts</a></li>
                    <li><a href="#">Stock</a></li>
                    <li><a href="#">On call Order</a></li>
                    <li><a href="#">Account</a></li>
                </ul>
            </div><br><br>

            <div class="btn1">
                <a href="add_reg_cus_contact.jsp">
                    <input type="button" value="ADD" style ="float:right">
                </a>
            </div><br><br>

            <div class="tab2">
                <%
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css \">");
                    out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js \"></script>");
                    out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js \"></script>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div class=\"container-fluid\">");

                    out.println("<table class =\"table table-striped\">");
                    out.println("<thead>");
                    out.println("<tr>");
                    out.println("<th>ID</th><th>Name</th><th>Contact</th><th>Address</th><th>JDate</th><th>Balance</th>   ");

                    out.println("</tr>");
                    out.println("</thead>");
                    out.println("<tbody>");

                    List<Rcustomer> customer = (ArrayList<Rcustomer>) request.getAttribute("CUSTOMERS");
                    for (Rcustomer cust : customer) {
                        out.println("<tr>");
                        out.println("<td>" + cust.getID() + "</td>");
                        out.println("<td>" + cust.getName() + "</td>");
                        out.println("<td>" + cust.getContact() + "</td>");
                        out.println("<td>" + cust.getAddress() + "</td>");
                        out.println("<td>" + cust.getJDate() + "</td>");
                        out.println("<td>" + cust.getBalance() + "</td>");

                        out.println("</tr>");
                    }
                    out.println("</tbody>");
                    out.println("</table>");
                    out.println("</div>");
                    out.println("</body>");
                %>

            </div>
        </div>
    </body>
</html>

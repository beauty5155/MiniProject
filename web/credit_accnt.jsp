<%-- 
    Document   : credit_accnt
    Created on : Oct 1, 2020, 5:39:31 AM
    Author     : official
--%>

<%@page import="servpack.CreditClass"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Credit Account Page</title>
        <link rel = "stylesheet" type = "text/css" href = "cus.css">
    </head>
    <body class="bg4">
        <div>
            <div class="container">
                <h1> Customer's Credit Account</h1>
                <br><br>
                <ul class="nav nav-tabs">
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="/PPCMS/Cus">Customer</a></li>
                    <li><a href="/PPCMS/RegCusContact">About Customer</a></li>
                    <li class="active"><a href="/PPCMS/CreditAccnt">Credit Accounts</a></li>
                    <li><a href="#">Stock</a></li>
                    <li><a href="#">On call Order</a></li>
                    <li><a href="#">Account</a></li>
                </ul>
            </div><br><br>
            <div class="btn1">
                <a href="add_credit_accnt.jsp">
                    <input type="button" value="ADD" style ="float:right">
                </a>
            </div><br><br>

            <div class="container1">
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
                    out.println("<th>Date</th><th>ID</th><th>BalanceDescription</th><th>STDAmt</th>  ");

                    out.println("</tr>");
                    out.println("</thead>");
                    out.println("<tbody>");

                    List<CreditClass> credit = (ArrayList<CreditClass>) request.getAttribute("ACCOUNT");
                    for (CreditClass cre : credit) {
                        out.println("<tr>");
                        out.println("<td>" + cre.getDate() + "</td>");
                        out.println("<td>" + cre.getID() + "</td>");
                        out.println("<td>" + cre.getBDescription() + "</td>");
                        out.println("<td>" + cre.getStdAmount() + "</td>");
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

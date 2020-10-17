<%-- 
    Document   : reg_cus
    Created on : Sep 3, 2020, 11:16:10 PM
    Author     : Beauty Kumari
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="servpack.CusClass" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet" type = "text/css" href = "cus.css">
        <title>Customer list JSP Page</title>
    </head>

    <body class="bg2">
        <div>
            
            <div class="container">
                <h1> Customer purchase list</h1>
                <br><br>
                <ul class="nav nav-tabs">
                    <li><a href="home.jsp">Home</a></li>
                    <li class="active"><a href="/PPCMS/Cus">Customer</a></li>
                    <li><a href="/PPCMS/RegCusContact">About Customer</a></li>
                    <li><a href="/PPCMS/CreditAccnt">Credit Accounts</a></li>
                    <li><a href="#">Stock</a></li>
                    <li><a href="#">On call Order</a></li>
                    <li><a href="#">Account</a></li>
                </ul>
            </div><br><br>

            <div class="btn1">
                <a href="add_cus.jsp">
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
                    out.println("<th>Date</th><th>ID</th><th>BillNo</th><th>Rate</th><th>Quantity</th><th>Total</th><th>Paid</th><th>Balance</th>  ");

                    out.println("</tr>");
                    out.println("</thead>");
                    out.println("<tbody>");

                    List<CusClass> customer = (ArrayList<CusClass>) request.getAttribute("CUSTOMER");
                    for (CusClass cust : customer) {
                        out.println("<tr>");
                        out.println("<td>" + cust.getDate() + "</td>");
                        out.println("<td>" + cust.getID() + "</td>");
                        out.println("<td>" + cust.getBillNo() + "</td>");
                        out.println("<td>" + cust.getRate() + "</td>");
                        out.println("<td>" + cust.getQuantity() + "</td>");
                        out.println("<td>" + cust.getTotal() + "</td>");
                        out.println("<td>" + cust.getPaid() + "</td>");
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

<%-- 
    Document   : reg_cus
    Created on : Sep 3, 2020, 11:16:10 PM
    Author     : Beauty Kumari
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="servpack.Rcustomer" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet" type = "text/css" href = "reg_cus.css">
        <title>JSP Page</title>
    </head>
    <div class="bg1">
    <body>
        <h1>Regular Customer Details</h1>
<div class="btn1">
        <a href="add_reg_cus.jsp">
            <input type="button" value="ADD" style ="float:right">
        </a>
</div>
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
            out.println("<th>ID</th><th>NAME</th><th>CONTACT</th><th>BOUGHT</th><th>CREDIT</th><th>DEBIT</th>  ");

            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");

            List<Rcustomer> customers = (ArrayList<Rcustomer>) request.getAttribute("CUSTOMERS");
            for (Rcustomer cust : customers) {
                out.println("<tr>");
                out.println("<td>" + cust.getID() + "</td>");
                out.println("<td>" + cust.getName() + "</td>");
                out.println("<td>" + cust.getContact() + "</td>");
                out.println("<td>" + cust.getBought() + "</td>");
                out.println("<td>" + cust.getDebit() + "</td>");
                out.println("<td>" + cust.getCredit() + "</td>");
                out.println("</tr>");
             }
                out.println("</tbody>");
                out.println("</table>");
                out.println("</div>");
                out.println("</body>");
        %>
      
    </body>
    </div>
</html>

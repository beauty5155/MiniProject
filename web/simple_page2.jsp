<%-- 
    Document   : simple_page2
    Created on : Oct 14, 2020, 6:54:12 PM
    Author     : official
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="servpack.Rcustomer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Details</h1>

     <center>
        <section>
            <div class="container">
                <h3><u>Details</u></h3><br><br>
                <div class="row">  
                    <div class="form-group col-md-4">
                        Name
                        <input type="text" name="name" >
                    </div>
                    <div class="form-group col-md-4">
                        Contact
                        <input type="text" name="contact" >
                    </div>
                    <div class="form-group col-md-4">
                        Address
                        <input type="text" name ="address" >
                    </div>
                </div>

                <div class="row">  
                    <div class="form-group col-md-4">
                        JDate
                        <input type="text" name ="jdate" >
                    </div>
                    <div class="form-group col-md-4">
                        Balance
                        <input id="stdAmt" type="text" name="balance" >
                    </div>

                </div>
            </div>
        </section>
        <hr><br><br>

        <a href="add_reg_cus_contact.jsp">
            <input type="button" value="Allow Purchase" onclick = "return validation();">
        </a>
        <script>
            function validation() {
                if (!balance_validation())
                    return false;
                return true;
            }

            function balance_validation() {
                var balance = document.getElementById("stdAmt");
                var numbers = [0 - 9];
                if (!balance >= 3000) {
                    alert("STD AMT Fullfilled");
                    return false;
                    else
                        return true;
                }
            }
        </script>
    </center> 
    <hr><br><br> 
    <div>
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
            for (Rcustomer custt : customer) {
                out.println("<tr>");
                out.println("<td>" + custt.getID() + "</td>");
                out.println("<td>" + custt.getName() + "</td>");
                out.println("<td>" + custt.getContact() + "</td>");
                out.println("<td>" + custt.getAddress() + "</td>");
                out.println("<td>" + custt.getJDate() + "</td>");
                out.println("<td>" + custt.getBalance() + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</body>");
        %>
        <hr><br><br>
        <a href="generate_bill.jsp">
            <input type="button" name="New Bill"> 
        </a>

    </div>
</body>
</html>

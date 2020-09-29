<%-- 
    Document   : reg_cus
    Created on : Sep 3, 2020, 11:16:10 PM
    Author     : Beauty Kumari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Regular Customer Details</h1>

        <a href="add_reg_cus.jsp">
            <input type="button" value="ADD">
        </a>

        <%

          List<Rcustomer> customers =(ArrayList<Rcustomer>)request.getAtrribute("CUSTOMERS");
          
          for(Rcustomer : customers){
              println(cust.getID());
              println(cust.getName());
              println(cust.getContact());
              println(cust.getBought());
              println(cust.getDebit());
              println(cust.getCredit());
          }
    %>
       
    </body>
</html>

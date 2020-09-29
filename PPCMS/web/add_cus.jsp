<%-- 
    Document   : add_cus
    Created on : Sep 4, 2020, 6:38:56 PM
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
               <form action="AddCus" method="post">
            <center>
                <div><h1>ADD CUSTOMER</h1></div>
                <br><br>
                <table>

                    <tr><td>ID</td>
                        <td><input type="number" name="id"></td></tr>

                    <tr><td>Name</td>
                        <td><input type="text" name="name"></td></tr>

                    <tr><td>Contact</td>
                        <td><input type="number" name="contact"></td></tr>

                    <tr><td>Bought</td>
                        <td><input type="number" name="bought"></td></tr>

                    <tr><td>Debit</td>
                        <td><input type="number" name="debit"></td></tr>

                    <tr><td>Credit</td>                 <!-- Add  "Optional*"      -->
                        <td><input type="text" name="credit"></td></tr>
                </table> <br>
                
                <input type="submit" value="SAVE" >

            </center>
        </form>
    </body>
</html>

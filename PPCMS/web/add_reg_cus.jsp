<%-- 
    Document   : add_cus
    Created on : Sep 4, 2020, 10:04:29 AM
    Author     : Beauty Kumari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel = "stylesheet" type = "text/css" href = "reg_cus.css">
        <title>add reg JSP Page</title>
    </head>

    <body class="bg2">
        <form action="AddRegCus" method="post">
            <center>
                <h1>Add Regular Customer</h1>
                <br><br>
                <table>
                    <tr><td>ID</td>
                        <td><input type="text" name="id"></td></tr>

                    <tr><td>Name</td>
                        <td><input type="text" name="name"></td></tr>

                    <tr><td>Contact</td>
                        <td><input type="text" name="contact"></td></tr>

                    <tr><td>Bought</td>
                        <td><input type="text" name="bought"></td></tr>

                    <tr><td>Debit</td>
                        <td><input type="text" name="debit"></td></tr>

                    <tr><td>Credit</td>
                        <td><input type="text" name="credit"></td></tr>
                </table> 
                <br>
                <input type="submit" value="SAVE">
            </center>
        </form>
    </body>
</html>

<%-- 
    Document   : add_credit_accnt
    Created on : Oct 1, 2020, 5:40:15 AM
    Author     : official
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://maxcdn.bootstrapcnd.com/bootstrap/3.3.6/css/bootstrap.min.css" ref="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css" ref="stylesheet">
        <script scr="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
        <script scr="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstap.min.js"></script>
        <script scr="https://cdnjs.cloudflare.com/ajax/libs/bootsrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>

          <link rel = "stylesheet" type = "text/css" href = "cus.css">
          
        <title>Credit Account Page</title>
    </head>
    <body class="bgadd">
         <form action="AddCreditAccnt" method="post">
            <center>
                <h1>Add Credits</h1>
                <br><br>
                <table>
                    <tr><td>Date</td>
                        <td><input type="text" name="date" id="datepicker"></td></tr>
                    <script>
                        $('#datepicker').datepicker({
                            autoclose:true,
                                    format: "yyyy-mm-dd"
                        });
                    </script>

                    <tr><td>ID</td>
                        <td><input type="text" name="id"></td></tr>

                    <tr><td>BDescription</td>
                        <td><input type="text" name="blncedesc"></td></tr>

                    <tr><td>StdAmt</td>
                        <td><input type="text" name="stdamt"></td></tr>

                </table> 
                <br>
                <input type="submit" value="SAVE">
            </center>
        </form>
    </body>
</html>

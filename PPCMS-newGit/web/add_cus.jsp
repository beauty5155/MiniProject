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
    <!--    <link href="https://maxcdn.bootstrapcnd.com/bootstrap/3.3.6/css/bootstrap.min.css" ref="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css" ref="stylesheet">
        <script scr="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
        <script scr="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstap.min.js"></script>
        <script scr="https://cdnjs.cloudflare.com/ajax/libs/bootsrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
-->
   <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">  
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css" rel="stylesheet">  
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>  
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script> </head>
   
        <link rel = "stylesheet" type = "text/css" href = "cus.css">
        <title>add customer jsp</title>
    </head>

    <body class="bgadd">
        <form action="AddCus" method="post">
            <center>
                <h1>Add Customer</h1>
                <br><br>
                <table>
                    <tr><td>Date</td>
                        <td><input type="text" id="datepicker" name="date"></td></tr>
                    <script>
                        $('#datepicker').datepicker({
                            autoclose: true,
                            format: "yyyy-mm-dd"
                     <!--   format:"dd/mm/yyyy"-->
                        });
                    </script>


                    <tr><td>ID</td>
                        <td><input type="text" name="id"></td></tr>

                    <tr><td>BillNo</td>
                        <td><input type="text" name="billno"></td></tr>

                    <tr><td>Rate</td>
                        <td><input type="text" name="rate"></td></tr>

                    <tr><td>Quantity</td>
                        <td><input type="text" name="quantity"></td></tr>

                    <tr><td>Total</td>
                        <td><input type="text" name="total"></td></tr>

                    <tr><td>Paid</td>
                        <td><input type="text" name="paid"></td></tr>
                    <tr><td>Balance</td>
                        <td><input type="text" name="balance"></td></tr>

                </table> 
                <br>
                <input type="submit" value="SAVE">
            </center>
        </form>
    </body>
</html>

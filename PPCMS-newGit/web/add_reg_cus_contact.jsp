<%-- 
    Document   : add_reg_cus_contact
    Created on : Sep 30, 2020, 12:32:46 PM
    Author     : official
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <!--      <link href="https://maxcdn.bootstrapcnd.com/bootstrap/3.3.6/css/bootstrap.min.css" ref="stylesheet">
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
          
        <title>Adding Contact Address JSP </title>
    </head>
    <body class="bgadd">
        <form action="AddRegCusContact" method="post">
            <center>
                <h1>Add Customer Contact Address</h1>
                <br><br>
                <table>

                    <tr><td>Name</td>
                        <td><input type="text" name="name"></td></tr>

                    <tr><td>Contact</td>
                        <td><input type="text" name="contact"></td></tr>

                    <tr><td>Address</td>
                        <td><input type="text" name="address"></td></tr>

                    <tr><td>JDate</td>
                        <td><input type="text" name="jdate" id="datepicker"></td></tr>
                    <script>
                        $('#datepicker').datepicker({
                            autoclose: true,
                            format: "yyyy-mm-dd"
                        });
                    </script>

                </table> 
                <br>
                <input type="submit" value="SAVE">
            </center>
        </form>
    </body>
</html>

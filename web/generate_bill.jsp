<%-- 
    Document   : generate_bill
    Created on : Oct 14, 2020, 8:27:47 PM
    Author     : official
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generate Bill For Payment</title>
    </head>
    <body>

        <h1>Generate Bill</h1>
        Date
        <input type="text" name="date">
        Bill Amt
        <input type="text" name="billamt"> 
        Paid Amt
        <input type="text" name="paidamt">
        Balance
        <input type="text" name="balance">
        <input type="submit" name="bill" value="Generate bill">

    </body>
</html>

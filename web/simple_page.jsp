<%-- 
    Document   : simple_page
    Created on : Oct 11, 2020, 3:24:34 PM
    Author     : official
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--@page import="java.sql.*"%>
<%
    Connection conn = null;
    Statement stmt = null;
    final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";
    final String USER = "root";
    final String PASS = "";
    Class.forName("org.mariadb.jdbc.Driver");
    conn = DriverManager.getConnection(DB_URL, USER, PASS);

--%>
<!DOCTYPE html>
<html>
    <head>
        <!--  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Simple Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <form action="SimplePage" method="post">
                <h1></h1>
                Enter ID
                <input type ="text" name="id" >
                <input type="submit" value="Get Details" >
            </form>
        <br><br>
        <hr>
    <!-- <center>
        <section>
            <div class="container">
                <h3><u>Details</u></h3><br><br>
                <div class="row">  <div class="form-group col-md-4">
                        ID
                        <input type="text" name="id" value="<%--
                            stmt = conn.createStatement();
                            String sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            ResultSet rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getString("ID"));
                            }
                               --%>">
                    </div>
                    <div class="form-group col-md-4">
                        Name
                        <input type="text" name="name" value="<%--
                            stmt = conn.createStatement();
                            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getString("Name"));
                            }
                               --%>">
                    </div>
                    <div class="form-group col-md-4">
                        Contact
                        <input type="text" name="contact" value="<%--
                            stmt = conn.createStatement();
                            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getInt("Contact"));
                            }
                               --%>">
                    </div>
                </div>

                <div class="row">  
                     <div class="form-group col-md-4">
                        Address
                        <input type="text" name ="address" value="<%--
                            stmt = conn.createStatement();
                            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getString("Address"));
                            }
                               --%>">
                    </div>
                    <div class="form-group col-md-4">
                        JDate
                        <input type="text" name ="jdate" value="<%--
                            stmt = conn.createStatement();
                            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getString("Jdate"));
                            }
                               --%>">
                    </div>
                    <div class="form-group col-md-4">
                        Balance
                        <input id="stdAmt" type="text" name="balance" value="<%--
                            stmt = conn.createStatement();
                            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = 'id'";
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print(rs.getString("Balance"));
                            }
                               --%>">
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
    </center>  -->
                             
</body>
</html>

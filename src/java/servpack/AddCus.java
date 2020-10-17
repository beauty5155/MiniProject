package servpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * @author Beauty Kumari
 */
@WebServlet(urlPatterns = {"/AddCus"})
public class AddCus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("http://localhost:8081/PPCMS/Cus");

        response.setContentType("text/html;charset=UTF-8");

        String date = request.getParameter("date");
        String id = request.getParameter("id");
        String billno = request.getParameter("billno");
        String rate = request.getParameter("rate");
        String quantity = request.getParameter("quantity");
        String total = request.getParameter("total");
        String paid = request.getParameter("paid");
        String balance = request.getParameter("balance");

        Connection conn = null;
        Statement stmt = null;

        try (PrintWriter out = response.getWriter()) {

            out.println(date);
            out.println(id);
            out.println(billno);
            out.println(rate);
            out.println(quantity);
            out.println(total);
            out.println(paid);
            out.println(balance);
            /* Change all db, sql query according to new db name (latter)  */

            final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
            final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";

            final String USER = "root";
            final String PASS = "";
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql1 = "", sql2 = "";

            out.println("1 before");
            stmt = conn.createStatement();
            sql1 = "INSERT INTO `cus_pur`(`Date`, `ID`, `BillNo`, `Rate`, `Quantity`, `Total`, `Paid`, `Balance`) VALUES ('" + date + "', '" + id + "','" + billno + "','" + rate + "','" + quantity + "','" + total + "','" + paid + "','" + balance + "' ) ";
            out.println("2 after");
            out.println(sql1);
            out.println("3 before");
            stmt.executeUpdate(sql1);
            out.println("4 after");

            stmt = conn.createStatement();
            out.println("5 ");
            sql2 = "UPDATE reg_cus_contact SET   reg_cus_contact.Balance =( SELECT  SUM(cus_pur.Balance) FROM   cus_pur  WHERE  reg_cus_contact.ID = cus_pur.ID)";
           
            // //      sql2 = "UPDATE reg_cus_contact SET   reg_cus_contact.Balance =( SELECT  SUM(cus_pur.Balance) AND CHECK(SUM<=2500) FROM   cus_pur  WHERE  reg_cus_contact.ID = cus_pur.ID)";

            out.println(" 6");
            out.println(sql2);
            out.println("7 ");
            stmt.executeUpdate(sql2);
            out.println("8 ");

            /*
            nId = Integer.parseInt(id);
            nContact = Integer.parseInt(contact);
            nBought = Integer.parseInt(bought);
            nDebit = Integer.parseInt(debit);
            nCredit = Integer.parseInt(credit);
             */
 /*
            out.println(sql);
            stmt.executeUpdate(sql);
             */
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

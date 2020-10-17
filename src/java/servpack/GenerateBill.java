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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author official
 */
@WebServlet(urlPatterns = {"/GenerateBill"})
public class GenerateBill extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
         String billamt = request.getParameter("billamt");
        String paidamt = request.getParameter("paidamt");
        String balance = request.getParameter("balance");
        
         Connection conn = null;
        Statement stmt = null;

        
        try (PrintWriter out = response.getWriter()) {
            
             out.println(billamt);
            out.println(paidamt);
            out.println(balance);
           final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
            final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";

            final String USER = "root";
            final String PASS = "";
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql1 = "",sql2="";
            Date date = null;            
            
            out.println("1 before");
            stmt = conn.createStatement();
            sql1 = "INSERT INTO `payment`(`Date`, `BillAmt`, `PaidAmt`, `Balance`) VALUES ('" + date + "', '" + billamt + "','" + paidamt + "','" + balance + "' ) ";
            out.println("2 after");
            out.println(sql1);
            out.println("3 before");
            stmt.executeUpdate(sql1);
            out.println("4 after");
            out.println("11 before");
            stmt = conn.createStatement();
            out.println("22 ");
            sql2 = "UPDATE reg_cus_contact SET   reg_cus_contact.Balance =( SELECT  SUM(payment.Balance) FROM   payment  WHERE  reg_cus_contact.ID = payment.ID)";
            out.println(" 33");
            out.println(sql2);
            out.println("44 ");
            stmt.executeUpdate(sql2);
            out.println("55");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GenerateBill.class.getName()).log(Level.SEVERE, null, ex);
        }
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

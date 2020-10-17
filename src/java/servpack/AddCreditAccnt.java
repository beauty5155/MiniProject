/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servpack;

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

/**
 *
 * @author official
 */
@WebServlet(urlPatterns = {"/AddCreditAccnt"})
public class AddCreditAccnt extends HttpServlet {

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

        response.sendRedirect("http://localhost:8081/PPCMS/CreditAccnt");
        response.setContentType("text/html;charset=UTF-8");

        String date = request.getParameter("date");
        String id = request.getParameter("id");
        String blncedesc = request.getParameter("blncedesc");
        String stdamt = request.getParameter("stdamt");

        Connection conn = null;
        Statement stmt = null;

        try (PrintWriter out = response.getWriter()) {

            out.println(date);
            out.println(id);
            out.println(blncedesc);
            out.println(stdamt);

            /* Change all db, sql query according to new db name (latter)  */
            final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
            final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";

            final String USER = "root";
            final String PASS = "";
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            String sql;

            out.println("before query");
            sql = "INSERT INTO `credit_accnt`(`Date`, `ID`, `BDescription`, `StdAmount`) VALUES ('" + date + "', '" + id + "','" + blncedesc + "','" + stdamt + "')";
            out.println("after query");
            out.println(sql);
            out.println("before update");
            stmt.executeUpdate(sql);
            out.println("after update");
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

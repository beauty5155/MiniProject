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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author official
 */
@WebServlet(name = "SimplePage", urlPatterns = {"/SimplePage"})
public class SimplePage extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");

        Connection conn = null;
        Statement stmt = null;
        
        try (PrintWriter out = response.getWriter()) {
            out.println(id);

            final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
            final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";

            final String USER = "root";
            final String PASS = "";
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "", name = "", address = "", contact = "";
            Date jdate;
            int balance = 0, nId = 0;

            stmt = conn.createStatement();

            sql = "SELECT * FROM `reg_cus_contact` WHERE `ID` = '" + id + "' ";

            nId = Integer.parseInt(id);

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
/*
                out.print("<tr>");
                out.print("<td>" + rs.getString("ID") + "</td>");
                out.print("<td>" + rs.getString("Name") + "</td>");
                out.print("<td>" + rs.getString("Contact") + "</td>");
                out.print("<td>" + rs.getString("Address")  + "</td>");
                out.print("<td>" + rs.getDate("Jdate") + "</td>");
                out.print("<td>" + rs.getInt("Balance") + "</td>");
                out.print("<td>" + "<form action=""> <input type="submit"> </form>" + "</td>");
                out.print("</tr>");
 */               
              
                id = rs.getString("ID");
                name = rs.getString("Name");
                contact = rs.getString("Contact");
                address = rs.getString("Address");
                jdate = rs.getDate("Jdate");
                balance = rs.getInt("Balance");

                out.println(id);
                out.println(name);
                out.println(contact);
                out.println(address);
                out.println(jdate);
                out.println(balance);

            }
     /*     RequestDispatcher rd = request.getRequestDispatcher("simple_page.jsp");
            rd.forward(request, response);
     */
            rs.close();
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
        } catch (SQLException ex) {
            Logger.getLogger(SimplePage.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(SimplePage.class.getName()).log(Level.SEVERE, null, ex);
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

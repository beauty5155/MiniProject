package servpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servpack.Rcustomer;

/**
 *
 * @author Beauty Kumari
 */
@WebServlet(urlPatterns = {"/RegCus"})
public class RegCus extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        Connection conn = null;
        Statement stmt = null;

        try (PrintWriter out = response.getWriter()) {
    /*       
        String me = "BEAUTY";
        request.setAttribute("nm", me);
        RequestDispatcher rd = request.getRequestDispatcher("reg_cus.jsp");
        rd.forward(request, response);
    */
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost/pcms";

            final String USER = "root";
            final String PASS = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            int id = 0, contact = 0, bought = 0, debit = 0, credit = 0;
            String sql, name = null;
            sql = "SELECT * FROM `pcms_db`";
            ResultSet rs = stmt.executeQuery(sql);

            List<Rcustomer> customers = new ArrayList<Rcustomer>();

            while (rs.next()) {

                id = rs.getInt("ID");
                name = rs.getString("Name");
                contact = rs.getInt("Contact");
                bought = rs.getInt("Bought");
                debit = rs.getInt("Debit");
                credit = rs.getInt("Credit");
                /*
                out.println(id);
                out.println(name);
                out.println(contact);
                out.println(bought);
                out.println(debit);
                out.println(credit);
                 */

                Rcustomer cust = new Rcustomer();
                cust.setID(id);
                cust.setName(name);
                cust.setContact(contact);
                cust.setBought(bought);
                cust.setDebit(debit);
                cust.setCredit(credit);

                customers.add(cust);
            }

            request.setAttribute("CUSTOMERS", customers);
            RequestDispatcher rd = request.getRequestDispatcher("reg_cus.jsp");
            rd.forward(request, response);

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
            Logger.getLogger(RegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegCus.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RegCus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegCus.class.getName()).log(Level.SEVERE, null, ex);
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

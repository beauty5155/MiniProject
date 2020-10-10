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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Beauty Kumari
 */
@WebServlet(urlPatterns = {"/Cus"})
public class Cus extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        /*          
        javaDate date = "";
        String sqldate = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            date = formatter.parse("MM-dd-yyyy");
            sqldate = formatter.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
         */
        Connection conn = null;
        Statement stmt = null;
        try (PrintWriter out = response.getWriter()) {

            final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
            final String DB_URL = "jdbc:mariadb://localhost:3307/ppcms_db";

            final String USER = "root";
            final String PASS = "";
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            int id = 0, billno = 0, rate = 0, quantity = 0, total = 0, paid = 0, balance = 0;
            Date date;
            String sql;
            sql = "SELECT * FROM `cus_pur`";
            ResultSet rs = stmt.executeQuery(sql);

            List<CusClass> customer = new ArrayList<CusClass>();

            while (rs.next()) {

                date = rs.getDate("Date");
                id = rs.getInt("ID");
                billno = rs.getInt("BillNo");
                rate = rs.getInt("Rate");
                quantity = rs.getInt("Quantity");
                total = rs.getInt("Total");
                paid = rs.getInt("Paid");
                balance = rs.getInt("Balance");
                /* 
                out.println(id);
                out.println(bill);
                out.println(rate);
                out.println(quantity);
                out.println(total);
                out.println(paid);
                out.println(balance);
                 */

                CusClass cust = new CusClass();

                cust.setDate(date);
                cust.setID(id);
                cust.setBillNo(billno);
                cust.setRate(rate);
                cust.setQuantity(quantity);
                cust.setTotal(total);
                cust.setPaid(paid);
                cust.setBalance(balance);

                customer.add(cust);
            }
            request.setAttribute("CUSTOMER", customer);
            RequestDispatcher rd = request.getRequestDispatcher("cus.jsp");
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

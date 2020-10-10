package servpack;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beauty Kumari
 */
public class CusClass {
 
    int cid = 0, cbillno = 0, crate = 0, cquantity = 0, ctotal = 0,cpaid=0,cbalance=0;
    Date cdate;

    public void setDate(Date date) {
        cdate = date;
    }
     public Date getDate() {
        return cdate;
    }
     
    public void setID(int id) {
        cid = id;
    }
     public int getID() {
        return cid;
    }

    public void setBillNo(int billno) {
        cbillno = billno;
    }
     public int getBillNo() {
        return cbillno;
    }

    public void setRate(int rate) {
        crate = rate;
    }
     public int getRate() {
        return crate;
    }

    public void setQuantity(int quantity) {
        cquantity = quantity;
    }
     public int getQuantity() {
        return cquantity;
    }

    public void setTotal(int total) {
        ctotal = total;
    }
     public int getTotal() {
        return ctotal;
    }

    public void setPaid(int paid) {
        cpaid = paid;
    }
     public int getPaid() {
        return cpaid;
    }
     
     public void setBalance(int balance) {
        cbalance = balance;
    }
     public int getBalance() {
        return cbalance;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servpack;

import java.sql.Date;

/**
 *
 * @author official
 */
public class Rcustomer {

    int cid = 0,cbalance = 0;
    String cname = "", caddress = "", ccontact = "";

    Date cjdate;

    public void setID(int id) {
        cid = id;
    }

    public int getID() {
        return cid;
    }

    public void setContact(String contact) {
        ccontact = contact;
    }

    public String getContact() {
        return ccontact;
    }

    public void setName(String name) {
        cname = name;
    }

    public String getName() {
        return cname;
    }

    public void setAddress(String address) {
        caddress = address;
    }

    public String getAddress() {
        return caddress;
    }

    public void setJDate(Date jdate) {
        cjdate = jdate;
    }

    public Date getJDate() {
        return cjdate;
    }

    public void setBalance(int balance) {
        cbalance = balance;
    }

    public int getBalance() {
        return cbalance;
    }

    void setID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

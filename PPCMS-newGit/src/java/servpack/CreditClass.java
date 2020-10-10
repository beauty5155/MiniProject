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
public class CreditClass {

    int cid = 0;
    String cblncedesc = "", cstdamt ="";
    Date cdate;

    public void setID(int id) {
        cid = id;
    }

    public int getID() {
        return cid;
    }

    public void setDate(Date date) {
        cdate = date;
    }

    public Date getDate() {
        return cdate;
    }

    public void setBDescription(String blncedesc) {
        cblncedesc = blncedesc;
    }

    public String getBDescription() {
        return cblncedesc;
    }

    public void setStdAmount(String stdamt) {
        cstdamt = stdamt;
    }

    public String getStdAmount() {
        return cstdamt;
    }
}

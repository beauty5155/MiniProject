package servpack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beauty Kumari
 */
public class Rcustomer {
int id=0,contact=0,bought=0,debit=0,credit=0;
String name="";
/*
public void setID(int id){
    this.id=id;
}
public int getID(){
    return id;
}

public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}

public void setContact(int contact){
    this.contact=contact;
}
public int getContact(){
    return contact;
}

public void setBought(int bought){
    this.bought=bought;
}    
public int getBought(){
    return bought;
}

public void setDebit(int debit){
    this.debit=debit;
}
public int getDebit(){
    return debit;
}
    
public void setCredit(int credit){
    this.credit=credit;
}
public int getCredit(){
    return credit;
}
}
    
*/    
    
    int cid = 0, ccontact = 0, cbought = 0, cdebit = 0, ccredit = 0;
    String cname = null;

    public void setID(int id) {
        cid = id;
    }
     public int getID() {
        return cid;
    }

    public void setName(String name) {
        cname = name;
    }
     public String getName() {
        return cname;
    }

    public void setContact(int contact) {
        ccontact = contact;
    }
     public int getContact() {
        return ccontact;
    }

    public void setBought(int bought) {
        cbought = bought;
    }
     public int getBought() {
        return cbought;
    }

    public void setDebit(int debit) {
        cdebit = debit;
    }
     public int getDebit() {
        return cdebit;
    }

    public void setCredit(int credit) {
        ccredit = credit;
    }
     public int getCredit() {
        return ccredit;
    }
}

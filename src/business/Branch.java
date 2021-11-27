/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author ba220
 */
public class Branch {
    private String bno, bnm, bloc; //branch number, name, location
    private int bemp; //branch number of employees
    public Branch() {
        bno="";
        bnm="";
        bloc="";
        bemp=0;
        
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getBnm() {
        return bnm;
    }

    public void setBnm(String bnm) {
        this.bnm = bnm;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public int getBemp() {
        return bemp;
    }

    public void setBemp(int bemp) {
        this.bemp = bemp;
    }
    @Override
    public String toString() { //enables the combo box to show branch names
        return this.bnm + " (" + this.bno + ")";
    }
}

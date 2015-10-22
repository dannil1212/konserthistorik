/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konserthistorik;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Nilsson
 */
public class Konsert implements Comparable<Konsert> {

    String band;
    String plats;
    int datum;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getPlats() {
        return plats;
    }

    public void setPlats(String plats) {
        this.plats = plats;
    }

    public String getDatum() {
        return Integer.toString(datum);
    }

    public void setDatum(String datum) {
        try {
            this.datum = Integer.parseInt(datum);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Du får endast ange siffror! Datum satt till 999999");
            this.datum = 999999;
        }
    }
    

    @Override
    public String toString() {
        return (this.getBand() + ", "
                + this.getPlats() + ", "
                + this.getDatum());
    }

    @Override
    public int compareTo(Konsert k) {
        if (datum < k.datum) {
            return -1;
        } else if (datum > k.datum) {
            return 1;
        } else {
            return 0;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konserthistorik;

/**
 *
 * @author Daniel Nilsson
 */
public class Konsert {

    String band;
    String plats;
    String datum;

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
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return (this.getBand() + ", "
                + this.getPlats() + ", "
                + this.getDatum());
    }

}

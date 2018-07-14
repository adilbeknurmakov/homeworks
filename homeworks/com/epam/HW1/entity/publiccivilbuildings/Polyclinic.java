/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publiccivilbuildings;

/**
 *
 * @author Adilbek
 */
public class Polyclinic extends HealthCare{
    private int numberOfPolyclinic;

    /**
     * @return the numberOfPolyclinic
     */
    public int getNumberOfPolyclinic() {
        return numberOfPolyclinic;
    }

    /**
     * @param numberOfPolyclinic the numberOfPolyclinic to set
     */
    public void setNumberOfPolyclinic(int numberOfPolyclinic) {
        this.numberOfPolyclinic = numberOfPolyclinic;
    }

    @Override
    public String toString() {
        return "Polyclinic{" + "numberOfPolyclinic=" + numberOfPolyclinic + '}';
    }
    
}

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
public class Dispensary extends HealthCare{
    private String typeOfDispansery;
    private int patientCapacity;

    /**
     * @return the typeOfDispansery
     */
    public String getTypeOfDispansery() {
        return typeOfDispansery;
    }

    /**
     * @param typeOfDispansery the typeOfDispansery to set
     */
    public void setTypeOfDispansery(String typeOfDispansery) {
        this.typeOfDispansery = typeOfDispansery;
    }

    /**
     * @return the patientCapacity
     */
    public int getPatientCapacity() {
        return patientCapacity;
    }

    /**
     * @param patientCapacity the patientCapacity to set
     */
    public void setPatientCapacity(int patientCapacity) {
        this.patientCapacity = patientCapacity;
    }

    @Override
    public String toString() {
        return "Dispensary{" + "typeOfDispansery=" + typeOfDispansery + ", patientCapacity=" + patientCapacity + '}';
    }
    
}

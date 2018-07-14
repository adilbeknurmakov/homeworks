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
public class Cultural extends CivilBuildings {
    //state or private
    private String typeOfCultural;

    /**
     * @return the typeOfCultural
     */
    public String getTypeOfCultural() {
        return typeOfCultural;
    }

    /**
     * @param typeOfCultural the typeOfCultural to set
     */
    public void setTypeOfCultural(String typeOfCultural) {
        this.typeOfCultural = typeOfCultural;
    }

    @Override
    public String toString() {
        return "Cultural{" + "typeOfCultural=" + typeOfCultural + '}';
    }
    
}

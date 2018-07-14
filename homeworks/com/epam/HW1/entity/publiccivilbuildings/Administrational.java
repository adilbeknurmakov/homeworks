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
public class Administrational extends CivilBuildings{
    private String typeOfOcupation; // leased, stateProperty, donative

    /**
     * @return the typeOfOcupation
     */
    public String getTypeOfOcupation() {
        return typeOfOcupation;
    }

    /**
     * @param typeOfOcupation the typeOfOcupation to set
     */
    public void setTypeOfOcupation(String typeOfOcupation) {
        this.typeOfOcupation = typeOfOcupation;
    }

    @Override
    public String toString() {
        return "Administrational{" + "typeOfOcupation=" + typeOfOcupation + '}';
    }
    
}

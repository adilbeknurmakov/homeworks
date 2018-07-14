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
public class Stadium extends Cultural{
    private String typeOfStadium;
    private boolean indoorStadium;

    /**
     * @return the typeOfStadium
     */
    public String getTypeOfStadium() {
        return typeOfStadium;
    }

    /**
     * @param typeOfStadium the typeOfStadium to set
     */
    public void setTypeOfStadium(String typeOfStadium) {
        this.typeOfStadium = typeOfStadium;
    }

    /**
     * @return the indoorStadium
     */
    public boolean isIndoorStadium() {
        return indoorStadium;
    }

    /**
     * @param indoorStadium the indoorStadium to set
     */
    public void setIndoorStadium(boolean indoorStadium) {
        this.indoorStadium = indoorStadium;
    }

    @Override
    public String toString() {
        return "Stadium{" + "typeOfStadium=" + typeOfStadium + ", indoorStadium=" + indoorStadium + '}';
    }
    
}

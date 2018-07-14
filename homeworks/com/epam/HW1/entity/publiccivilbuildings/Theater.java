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
public class Theater extends Cultural {
    private String language;
    private int numberOfHalls;

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the numberOfHalls
     */
    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    /**
     * @param numberOfHalls the numberOfHalls to set
     */
    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    @Override
    public String toString() {
        return "Theater{" + "language=" + language + ", numberOfHalls=" + numberOfHalls + '}';
    }
    
}

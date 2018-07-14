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
public class Museum extends Cultural{
    private boolean national;
    //modern, ancient, ancient kazakh
    private String typeOfMuseum;

    /**
     * @return the national
     */
    public boolean isNational() {
        return national;
    }

    /**
     * @param national the national to set
     */
    public void setNational(boolean national) {
        this.national = national;
    }

    /**
     * @return the typeOfMuseum
     */
    public String getTypeOfMuseum() {
        return typeOfMuseum;
    }

    /**
     * @param typeOfMuseum the typeOfMuseum to set
     */
    public void setTypeOfMuseum(String typeOfMuseum) {
        this.typeOfMuseum = typeOfMuseum;
    }

    @Override
    public String toString() {
        return "Museum{" + "national=" + national + ", typeOfMuseum=" + typeOfMuseum + '}';
    }
    
    
}

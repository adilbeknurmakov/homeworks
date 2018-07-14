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
public class Educational extends CivilBuildings{
    private boolean publicInstitution;
    private String director;
    private int languageOfInstruction;

    /**
     * @return the publicInstitution
     */
    public boolean isPublicInstitution() {
        return publicInstitution;
    }

    /**
     * @param publicInstitution the publicInstitution to set
     */
    public void setPublicInstitution(boolean publicInstitution) {
        this.publicInstitution = publicInstitution;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
     /**
     * @return the languageOfInstruction
     */
    public int getLanguageOfInstruction() {
        return languageOfInstruction;
    }

    /**
     * @param languageOfInstruction the languageOfInstruction to set
     */
    public void setLanguageOfInstruction(int languageOfInstruction) {
        this.languageOfInstruction = languageOfInstruction;
    }

    @Override
    public String toString() {
        return "Educational{" + "publicInstitution=" + 
                publicInstitution + ", director=" + director + 
                ", languageOfInstruction=" + languageOfInstruction + '}';
    }
    
}

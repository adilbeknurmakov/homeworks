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
public class University extends Educational{
    private String universityName;
    //international, local
    private String typeOfUniversity; 
    private boolean localAccreditation;
    private boolean foreignAccreditation;

    /**
     * @return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return the typeOfUniversity
     */
    public String getTypeOfUniversity() {
        return typeOfUniversity;
    }

    /**
     * @param typeOfUniversity the typeOfUniversity to set
     */
    public void setTypeOfUniversity(String typeOfUniversity) {
        this.typeOfUniversity = typeOfUniversity;
    }

    /**
     * @return the localAccreditation
     */
    public boolean isLocalAccreditation() {
        return localAccreditation;
    }

    /**
     * @param localAccreditation the localAccreditation to set
     */
    public void setLocalAccreditation(boolean localAccreditation) {
        this.localAccreditation = localAccreditation;
    }

    /**
     * @return the foreignAccreditation
     */
    public boolean isForeignAccreditation() {
        return foreignAccreditation;
    }

    /**
     * @param foreignAccreditation the foreignAccreditation to set
     */
    public void setForeignAccreditation(boolean foreignAccreditation) {
        this.foreignAccreditation = foreignAccreditation;
    }

    @Override
    public String toString() {
        return "University{" + "universityName=" + universityName + 
                ", typeOfUniversity=" + typeOfUniversity + 
                ", localAccreditation=" + localAccreditation + 
                ", foreignAccreditation=" + foreignAccreditation + '}';
    }
    
    
}

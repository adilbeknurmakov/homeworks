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
public class HealthCare extends CivilBuildings {
    private boolean publicHealthInstitution;
    //kids, students, all
    private String ageCategory;

    /**
     * @return the publicHealthInstitution
     */
    public boolean isPublicHealthInstitution() {
        return publicHealthInstitution;
    }

    /**
     * @param publicHealthInstitution the publicHealthInstitution to set
     */
    public void setPublicHealthInstitution(boolean publicHealthInstitution) {
        this.publicHealthInstitution = publicHealthInstitution;
    }

    /**
     * @return the ageCategory
     */
    public String getAgeCategory() {
        return ageCategory;
    }

    /**
     * @param ageCategory the ageCategory to set
     */
    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public String toString() {
        return "HealthCare{" + "publicHealthInstitution=" + publicHealthInstitution + ", ageCategory=" + ageCategory + '}';
    }
    
}

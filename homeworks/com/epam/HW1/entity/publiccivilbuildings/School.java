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
public class School extends Educational{
    private int schoolNumber;
    private int studentCapacity;
    //lyceum, gymnasium, ordinary
    private String typeOfSchool;

    /**
     * @return the schoolNumber
     */
    public int getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * @param schoolNumber the schoolNumber to set
     */
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * @return the studentCapacity
     */
    public int getStudentCapacity() {
        return studentCapacity;
    }

    /**
     * @param studentCapacity the studentCapacity to set
     */
    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    /**
     * @return the typeOfSchool
     */
    public String getTypeOfSchool() {
        return typeOfSchool;
    }

    /**
     * @param typeOfSchool the typeOfSchool to set
     */
    public void setTypeOfSchool(String typeOfSchool) {
        this.typeOfSchool = typeOfSchool;
    }

    @Override
    public String toString() {
        return "School{" + "schoolNumber=" + schoolNumber + ", studentCapacity=" + studentCapacity + ", typeOfSchool=" + typeOfSchool + '}';
    }
    
    
}

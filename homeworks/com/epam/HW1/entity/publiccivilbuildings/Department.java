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
public class Department extends Administrational{
    private String nameOfDepartment;
    private int floors;

    /**
     * @return the nameOfDepartment
     */
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    /**
     * @param nameOfDepartment the nameOfDepartment to set
     */
    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    /**
     * @return the floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Department{" + "nameOfDepartment=" + nameOfDepartment + ", floors=" + floors + '}';
    }
    
}

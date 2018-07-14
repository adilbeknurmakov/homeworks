/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publiccivilbuildings;

/**
 *
 * @author Adilbek
 * Types of civil buildings in Astana
 */
public class CivilBuildings {
    private int yearOfConstruction; 
    private String architect;
    private String style;
    private String developer;
    private int cost;
    private String typeOfBuilding; //public, residential
    private String address;
    private int height;

    /**
     * @return the yearOfConstruction
     */
    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * @param yearOfConstruction the yearOfConstruction to set
     */
    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    /**
     * @return the architect
     */
    public String getArchitect() {
        return architect;
    }

    /**
     * @param architect the architect to set
     */
    public void setArchitect(String architect) {
        this.architect = architect;
    }

    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * @return the developer
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * @param developer the developer to set
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    /**
     * @return the typeOfBuilding
     */
    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    /**
     * @param typeOfBuilding the typeOfBuilding to set
     */
    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }
     /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CivilBuildings{" + "yearOfConstruction=" + yearOfConstruction + ", architect=" + architect + ", style=" + style + ", developer=" + developer + ", cost=" + cost + ", typeOfBuilding=" + typeOfBuilding + '}';
    }    

   
  
}

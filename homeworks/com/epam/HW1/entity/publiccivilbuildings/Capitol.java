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
public final class Capitol extends Administrational {
    private static final Capitol instance = new Capitol("Akkorda", 7);
    private int floors;
    private String name;
    
    private Capitol(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public static Capitol getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Capitol{" + "floors=" + floors + ", name=" + name + '}';
    }

    
}
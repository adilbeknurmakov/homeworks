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
public class Main {
    
     public static void main(String[] args){
         Dispensary dispensary = new Dispensary();
         dispensary.setTypeOfDispansery("tuberculosis");
         dispensary.setPatientCapacity(87);
         
         Capitol.getInstance();
         
         University university = new University();
         university.setForeignAccreditation(false);
         university.setTypeOfUniversity("International");
         university.setUniversityName("Adilbek Nurmakov University (ANU)");
         
         System.out.println(dispensary);
         System.out.println(Capitol.getInstance());
         System.out.println(university);
     }
}

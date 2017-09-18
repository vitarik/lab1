/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;

import aleatoire.Person;

/**
 *
 * @author messaoudiTarik
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bonjour Tarik Messaoudi");
        Person zied= new Person("Zied","Zaier", 33);
        System.out.println(zied.getFirstName() );
        System.out.println(zied.getLastName() );
        System.out.println(zied.getAge() );
        zied.setLastName("john");
        System.out.println(zied.getLastName() );
        
    }
    
}

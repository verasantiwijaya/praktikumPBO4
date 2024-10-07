/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spacewar.rocket;

import spacewar.abstrac.FireMeteor1;
import spacewar.abstrac.StoneMeteor1;
import spacewar.meteor.FireMeteor;
import spacewar.meteor.StoneMeteor;

/**
 *
 * @author HP
 */
public class spacewar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //objek kelas
       Rocket rk = new Rocket();
       Grasshoper gs = new Grasshoper();
       Falcon fc = new Falcon();
       
       //memanggil override
       gs.launch();
       fc.launch();
       
       //memanggil overloading
       rk.launch(); // Memanggil metode launch tanpa parameter
       rk.launch("Hydrogen");  // Memanggil metode launch 1 parameter
       rk.launch("Liquid Oxygen", 1500);  // Memanggil metode launch 2 parameter
       
       
       //penggunaan interface kelas
//        StoneMeteor sm = new StoneMeteor(2,  5);
//        FireMeteor fm = new FireMeteor(2, 5, 40);
//
//        // Meteor menabrak roket
//        sm.hit(fc);
//        fm.hit( gs);
//
//        // Tampilkan healthpoint
//        System.out.println("healtpointnya menjadi: " + fc.healtpoint);
//        System.out.println("healtpointnya menjadi: " + gs.healtpoint);
        
        
        //penggunaan abstract kelas
        StoneMeteor1 sm1 = new StoneMeteor1(2,  5);
        FireMeteor1 fm1 = new FireMeteor1(2, 5, 40);

        // Meteor menabrak roket
        sm1.hit(fc);
        fm1.hit( gs);

        // Tampilkan healthpoint
        System.out.println("healtpointnya menjadi: " + fc.healtpoint);
        System.out.println("healtpointnya menjadi: " + gs.healtpoint);


        
    }
    
}

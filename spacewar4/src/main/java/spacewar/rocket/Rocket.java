/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.rocket;

/**
 *
 * @author HP
 */
public class Rocket {
    //getter dan setter
    public int healtpoint = 100;
    
    public void setHealtpoint(int healtpoint) {
        this.healtpoint = healtpoint;
        if (this.healtpoint < 0){
            this.healtpoint = 0;
        }
    }

    public int getHealtpoint() {
        return healtpoint;
    }
    
    
    
    //Overloading
    public void launch() {
        System.out.println("Roket diluncurkan!");
    }

    public void launch(String fuelType) {
        System.out.println("Roket diluncurkan dengan bahan bakar: " + fuelType);
    }

    public void launch(String fuelType, double weight) {
        System.out.println("Roket diluncurkan dengan bahan bakar: " + fuelType + " dan berat: " + weight + " kg");
    }
}

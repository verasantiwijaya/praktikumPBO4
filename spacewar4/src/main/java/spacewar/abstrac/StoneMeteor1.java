/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.abstrac;

/**
 *
 * @author HP
 */
public class StoneMeteor1 extends Meteor1{
    // Konstruktor
    public StoneMeteor1(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    @Override
    public int calculatedDamage() {
        return this.speed * this.size;
    }

    
}

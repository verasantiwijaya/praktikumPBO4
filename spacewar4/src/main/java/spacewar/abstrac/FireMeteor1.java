/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.abstrac;

/**
 *
 * @author HP
 */
public class FireMeteor1 extends Meteor1 {
    public int temperature;

    public FireMeteor1(int speed, int size, int temperature) {
        this.speed = speed;
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public int calculatedDamage() {
        return (this.speed * this.size) + this.temperature;
    }

}

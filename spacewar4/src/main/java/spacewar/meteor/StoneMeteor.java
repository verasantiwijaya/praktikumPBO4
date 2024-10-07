/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.meteor;

import spacewar.rocket.Rocket;

/**
 *
 * @author HP
 */
public class StoneMeteor implements Meteor {
    public int speed;
    public int size;

    // Konstruktor
    public StoneMeteor(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    @Override
    public int calculateDamage() {
        return this.speed * this.size;
    }

    @Override
    public void hit(Rocket rocket) {
        // Mengurangi health point roket dengan damage yang dihitung
        rocket.setHealtpoint(rocket.getHealtpoint()- this.calculateDamage());
    }
}

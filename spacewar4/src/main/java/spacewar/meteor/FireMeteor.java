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
public class FireMeteor implements Meteor {
    public int speed;
    public int size;
    public int temperature;

    public FireMeteor(int speed, int size, int temperature) {
        this.speed = speed;
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public int calculateDamage() {
        return (this.speed * this.size) + this.temperature;
    }

    @Override
    public void hit(Rocket rocket) {
        rocket.healtpoint -= this.calculateDamage();
    }
}


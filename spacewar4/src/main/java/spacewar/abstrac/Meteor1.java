/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacewar.abstrac;

import spacewar.rocket.Rocket;

/**
 *
 * @author HP
 */
public abstract class Meteor1 {
    protected int speed;
    protected int size;
    
    abstract public int calculatedDamage();
    
    public void hit (Rocket rocket){
        rocket.setHealtpoint(rocket.getHealtpoint()-this.calculatedDamage());
    }
    
}

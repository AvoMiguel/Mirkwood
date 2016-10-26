/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package script;

import java.util.Random;

/**
 *
 * @author UserPL022Pc09
 */
public class Spider extends Character{
    
    public Spider(int hp, int attack, int defense) {
        super(hp, 0, attack, defense);
        Random r = new Random();
        int p=6 + r.nextInt(7);//para dar 4 a 10
        setPower(p);
    }
}

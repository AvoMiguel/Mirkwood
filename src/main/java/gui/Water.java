/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author UserPL022Pc09
 */
public class Water extends MapObject {

    public Water(int bk1, int bk2, int bk3, int ft1, int ft2, int ft3, char simbolo) {
        super(bk1, bk2, bk3, ft1, ft2, ft3, simbolo);
        setBk1(100);
        setBk2(150);
        setBk3(100);
        
        setSimbolo('▓');
    }

   

    
}

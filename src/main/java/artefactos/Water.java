/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;

/**
 *
 * @author UserPL022Pc09
 */
public class Water extends MapObject{
    TextColor.RGB foreColor = new RGB(51,102,255);
    TextColor.RGB bkgColor = new RGB(51,102,255);;
    
    public Water(TextColor.RGB foregroundColor, TextColor.RGB backgroundColor) {
        super(SymbolsMirk.WATER[2], null, null);
        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
    }
    
}

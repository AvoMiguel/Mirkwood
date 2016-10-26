/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.googlecode.lanterna.TextColor;

/**
 *
 * @author UserPL022Pc09
 */
public class MapObject extends MapLayer {
    int bk1,bk2,bk3,ft1,ft2,ft3;
    char simbolo;
    TextColor.RGB bkgColor = new TextColor.RGB(bk1,bk2,bk3);
    TextColor.RGB frontColor = new TextColor.RGB(ft1,ft2,ft3);

    public MapObject(int bk1, int bk2, int bk3, int ft1, int ft2, int ft3, char simbolo) {
        this.bk1 = bk1;
        this.bk2 = bk2;
        this.bk3 = bk3;
        this.ft1 = ft1;
        this.ft2 = ft2;
        this.ft3 = ft3;
        this.simbolo = simbolo;
    }

    public int getBk1() {
        return bk1;
    }

    public void setBk1(int bk1) {
        this.bk1 = bk1;
    }

    public int getBk2() {
        return bk2;
    }

    public void setBk2(int bk2) {
        this.bk2 = bk2;
    }

    public int getBk3() {
        return bk3;
    }

    public void setBk3(int bk3) {
        this.bk3 = bk3;
    }

    public int getFt1() {
        return ft1;
    }

    public void setFt1(int ft1) {
        this.ft1 = ft1;
    }

    public int getFt2() {
        return ft2;
    }

    public void setFt2(int ft2) {
        this.ft2 = ft2;
    }

    public int getFt3() {
        return ft3;
    }

    public void setFt3(int ft3) {
        this.ft3 = ft3;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public TextColor.RGB getBkgColor() {
        return bkgColor;
    }

    public void setBkgColor(TextColor.RGB bkgColor) {
        this.bkgColor = bkgColor;
    }

    public TextColor.RGB getFrontColor() {
        return frontColor;
    }

    public void setFrontColor(TextColor.RGB frontColor) {
        this.frontColor = frontColor;
    }
    
    
    
}

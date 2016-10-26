/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import gui.Map;

/**
 *
 * @author UserPL022Pc09
 */
public class MapLayer {
    MapObject [][] objectos;

    public MapLayer() {
        objectos = new MapObject[Map.COLUMNS][Map.LINES];
    }

    public MapObject[][] getMap() {
        return objectos;
    }

    public void setObjectos(MapObject[][] objectos) {
        this.objectos = objectos;
    }
    
    
}

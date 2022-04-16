package br.edu.uniaeso.model;

import java.awt.Color;

public class RubikSide {
    private Color[][] side;

    private SideID sideID;
    private SideColor sideColor;
    private Integer sideSize;

    public RubikSide(SideID sideId, SideColor sideColor, Integer sideSize) {
        setSideID(sideID);
        setSide(new Color[sideSize][sideSize]);
        initialize(sideColor);
    }


    private void initialize(SideColor sideColor) {
        for (int i = 0; i < side.length; i++) {
            for (int j = 0; j < side[i].length; j++) {
                side[i][j] = sideColor.getColor();
            }
        }
    }

    public boolean isSolved() {
        boolean verify = true;
        for (int i = 0; i < side.length; i++) {
            for (int j = 0; j < side[i].length; j++) {
                if (side[i][j] == sideColor.getColor()) {
                    verify &= true;
                } else {
                    verify &= false;
                }
            }
        }
        return verify;
    }

    public SideColor getSideColor() {
        return sideColor;
    }

    public void setSideColor(SideColor sideColor) {
        this.sideColor = sideColor;
    }

    public SideID getSideID() {
        return sideID;
    }

    public void setSideID(SideID sideID) {
        this.sideID = sideID;
    }

    public Color[][] getSide() {
        return side;
    }

    public void setSide(Color[][] side) {
        this.side = side;
    }
    
    public Integer getSideSize() {
        return sideSize;
    }

    public void setSideSize(Integer sideSize) {
        this.sideSize = sideSize;
    }
}

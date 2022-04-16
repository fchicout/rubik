package br.edu.uniaeso.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RubikSide {
    private Color[][] side = new Color[3][3];

    private SideID sideID;
    private SideColor sideColor;
    private SideState sideState;

    public RubikSide(SideID sideId, SideState sideState, SideColor sideColor) {
        setSideID(sideID);
        if (sideState == SideState.SOLVED) {
            initializeSolved(sideColor);
        } else if (sideState == SideState.SCRAMBLED) {
            initializeScrambled(sideColor);
        }
    }

    private void initializeScrambled(SideColor sideColor) {
        
    }

    private void initializeSolved(SideColor sideColor) {
        for (int i = 0; i < side.length; i++) {
            for (int j = 0; j < side[i].length; j++) {
                side[i][j] = sideColor.getColor();
            }
        }
    }

    public SideColor getSideColor() {
        return sideColor;
    }

    public void setSideColor(SideColor sideColor) {
        this.sideColor = sideColor;
    }

    public SideState getSideState() {
        return sideState;
    }

    public void setSideState(SideState sideState) {
        this.sideState = sideState;
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

}

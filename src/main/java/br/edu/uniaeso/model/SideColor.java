package br.edu.uniaeso.model;

import java.awt.Color;

public enum SideColor {
    WHITE(Color.WHITE),
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    YELLOW(Color.YELLOW),
    ORANGE(Color.ORANGE);

    public final Color color;

    private SideColor(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
}

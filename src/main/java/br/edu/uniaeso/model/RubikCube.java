package br.edu.uniaeso.model;

import java.awt.Color;

public class RubikCube implements ICubicRubik {
    private RubikSide[] cube = new RubikSide[6];

    @Override
    public void initializeCubeMatrix() {
        cube[0] = new RubikSide(SideID.FRONT, SideColor.WHITE, 3);
        cube[1] = new RubikSide(SideID.LEFT, SideColor.ORANGE, 3);
        cube[2] = new RubikSide(SideID.RIGHT, SideColor.RED, 3);
        cube[3] = new RubikSide(SideID.BACK, SideColor.YELLOW, 3);
        cube[4] = new RubikSide(SideID.UP, SideColor.BLUE, 3);
        cube[5] = new RubikSide(SideID.DOWN, SideColor.GREEN, 3);
    }

    @Override
    public void shuffleCube() {
        // TODO Auto-generated method stub
    }

    @Override
    public void printCube() {
        // TODO Auto-generated method stub

    }

    private ICubicRubik faceRotateClockwise(SideID sideID) {
        for (RubikSide rubikSide : cube) {
            if (rubikSide.getSideID() == SideID.LEFT) {
                Color[][] rotateSide = new Color[rubikSide.getSideSize()][rubikSide.getSideSize()];
                rotateSide[0][0] = rubikSide.getSide()[2][0];
                rotateSide[0][1] = rubikSide.getSide()[1][0];
                rotateSide[0][2] = rubikSide.getSide()[0][0];

                rotateSide[1][0] = rubikSide.getSide()[2][1];
                rotateSide[1][1] = rubikSide.getSide()[1][1];
                rotateSide[1][2] = rubikSide.getSide()[0][1];

                rotateSide[2][0] = rubikSide.getSide()[2][2];
                rotateSide[2][1] = rubikSide.getSide()[1][2];
                rotateSide[2][2] = rubikSide.getSide()[0][2];

                rubikSide.setSide(rotateSide);
            }
        }
        return this;
    }

    private RubikCube swapColumn(SideID origin, SideID destiny, Integer column) {
        Color[] swapData = getRubikSide(origin).getColumn(column);
        getRubikSide(origin).setColumn(getRubikSide(destiny).getColumn(column), column);
        getRubikSide(destiny).setColumn(swapData, column);

        return this;
    }

    @Override
    public RubikCube rotateLeftClockwise() {
        faceRotateClockwise(SideID.LEFT);
        swapColumn(SideID.FRONT, SideID.DOWN, 0).
        swapColumn(SideID.UP, SideID.FRONT, 0).
        swapColumn(SideID.BACK, SideID.UP, 0);
        return this;
    }

    @Override
    public ICubicRubik rotateLeftCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateRightClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateRightCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateUpClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateUpCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateDownClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateDownCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateCenterHorizontalClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateCenterHorizontalCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateCenterVerticalClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICubicRubik rotateCenterVerticalCounterClockwise() {
        // TODO Auto-generated method stub
        return null;
    }

    private RubikSide getRubikSide(SideID sideID) {
        for (RubikSide rubikSide : cube) {
            if (rubikSide.getSideID() == sideID) {
                return rubikSide;
            }
        }
        return null;
    }
}

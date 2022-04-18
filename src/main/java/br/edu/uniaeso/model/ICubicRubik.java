package br.edu.uniaeso.model;

public interface ICubicRubik {
    public void initializeCubeMatrix();

    public void shuffleCube();

    public void printCube();

    public ICubicRubik rotateLeftClockwise();

    public ICubicRubik rotateLeftCounterClockwise();

    public ICubicRubik rotateRightClockwise();

    public ICubicRubik rotateRightCounterClockwise();

    public ICubicRubik rotateUpClockwise();

    public ICubicRubik rotateUpCounterClockwise();

    public ICubicRubik rotateDownClockwise();

    public ICubicRubik rotateDownCounterClockwise();

    public ICubicRubik rotateCenterHorizontalClockwise();

    public ICubicRubik rotateCenterHorizontalCounterClockwise();

    public ICubicRubik rotateCenterVerticalClockwise();

    public ICubicRubik rotateCenterVerticalCounterClockwise();

}

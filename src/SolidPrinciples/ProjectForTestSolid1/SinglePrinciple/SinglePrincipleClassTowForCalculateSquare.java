package SolidPrinciples.ProjectForTestSolid1.SinglePrinciple;

import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.SubBaseShapeNumber1;

// this class worked to calculate Square Shape
public class SinglePrincipleClassTowForCalculateSquare implements SubBaseShapeNumber1 {

    private double width;
    private double height;

    public SinglePrincipleClassTowForCalculateSquare(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaReturnOtherValue(double width, double height) {
        return getWidth() * getHeight() * 12;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double area() {
        return width * height;
    }

}

package SolidPrinciples.ProjectForTestSolid1.SinglePrinciple;

import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.SubShapeNumber2;

/// this class for calculate sape of  Triangle
public class SinglePrincipleClassFourForCalculateTriangle implements SubShapeNumber2 {

    private double width;
    private double height;
    private double Altitude;


    public SinglePrincipleClassFourForCalculateTriangle(double width, double height, double Altitude) {
        this.width = width;
        this.height = height;
        this.Altitude = Altitude;
    }



    @Override
    public double calculateTriangle(double height, double width, double Altitude) {
        return getHeight() + getWidth() + getAltitude() * 10;
    }

    @Override
    public double areaReturnOtherValue(double width, double height) {
        return 0;
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
    public double getAltitude() {
        return this.Altitude;
    }

    @Override
    public double area() {
        return SubShapeNumber2.super.area();
    }
}

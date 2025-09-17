package SolidPrinciples.ProjectForTestSolid1.SinglePrinciple;

import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.BaseShape;

// this class worked to Circle SinglePrincipleRectangle Shape
public class SinglePrincipleClassThreeForCalculateCircle implements BaseShape {
    double radius;
    double x;

    public SinglePrincipleClassThreeForCalculateCircle(double x, double radius) {
        this.radius = radius;
        this.x = x;
    }


    @Override
    public double area() {
        return radius + x;
    }
}

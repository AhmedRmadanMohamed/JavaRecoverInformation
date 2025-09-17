package SolidPrinciples.ProjectForTestSolid1;

import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.BaseShape;
import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.SubBaseShapeNumber1;
import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.SubShapeNumber2;
import SolidPrinciples.ProjectForTestSolid1.OpenClosePrincipleClasses.OpenClosePrincipleClassForAreaCalculator;
import SolidPrinciples.ProjectForTestSolid1.SinglePrinciple.SinglePrincipleClassFourForCalculateTriangle;
import SolidPrinciples.ProjectForTestSolid1.SinglePrinciple.SinglePrincipleClassOneForCalculateRectangle;
import SolidPrinciples.ProjectForTestSolid1.SinglePrinciple.SinglePrincipleClassThreeForCalculateCircle;
import SolidPrinciples.ProjectForTestSolid1.SinglePrinciple.SinglePrincipleClassTowForCalculateSquare;

import java.awt.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
///-------------------SinglePrinciple Concept ----------------------------
        BaseShape rectangleBaseShape = new SinglePrincipleClassOneForCalculateRectangle(100, 50);
     SubBaseShapeNumber1 squaresBaseShape = new SinglePrincipleClassTowForCalculateSquare(130, 60);
     BaseShape circleBaseShape = new SinglePrincipleClassThreeForCalculateCircle(200, 90);
///----------------------open Close Principle Concept--------------------------------
        OpenClosePrincipleClassForAreaCalculator openClosePrincipleClassForAreaCalculator = new OpenClosePrincipleClassForAreaCalculator(List.of(rectangleBaseShape, squaresBaseShape, circleBaseShape));
        System.out.println();
        System.out.println("------------------rectangleBaseShape--------------------------");
        System.out.println(rectangleBaseShape.area());
        System.out.println();
        System.out.println("------------------squaresBaseShape--------------------------");

        System.out.println(squaresBaseShape.area());
        System.out.println();
        System.out.println("-------------------circleBaseShape---------------------------");
        System.out.println(circleBaseShape.area());
        System.out.println();
        System.out.println("Sum  Area Of All Shapes: (CircleBaseShape ,SquaresBaseShape  ,RectangleBaseShape )  ");
        System.out.println(openClosePrincipleClassForAreaCalculator.totalArea());
        System.out.println();
        System.out.println();
        /// -----------------------------for Liscove Principle Concept ---------------------


        SubBaseShapeNumber1 RectangleSubShapeNumber1 = new SinglePrincipleClassOneForCalculateRectangle(1200, 1300);
        OpenClosePrincipleClassForAreaCalculator openClosePrincipleClassForAreaCalculator2 =
                new OpenClosePrincipleClassForAreaCalculator(List.of(RectangleSubShapeNumber1));

        System.out.println("New Shape Added To Triangle : calculate Basic Area Method  on   SubShapeNumber1");
        ;
        System.out.println();

        System.out.println(RectangleSubShapeNumber1.areaReturnOtherValue(RectangleSubShapeNumber1.getWidth(), RectangleSubShapeNumber1.getHeight()));
        System.out.println();
        System.out.println("-------------------RectangleSubShapeNumber1---------------------------");
        System.out.println();

        System.out.println(RectangleSubShapeNumber1.area());
        System.out.println();
        System.out.println("Sum Of All Shapes on openClosePrincipleClassForAreaCalculator: Total Area Shape Of  (Rectangle Only )  ------>");
        System.out.println(openClosePrincipleClassForAreaCalculator2.totalArea());


        ///  new project code  for test

        System.out.println(" ----->                 New Project Code  For Test  On SOLID Principle Class              ------>");

        SubShapeNumber2 TriangleSubShapeNumber2 = new SinglePrincipleClassFourForCalculateTriangle(10, 20, 30);

        System.out.println();
        System.out.println("New Shape Added To Triangle : calculate Basic Area Method  on   SubShapeNumber2");
        System.out.println();
        System.out.println(TriangleSubShapeNumber2.area());
        System.out.println();
        System.out.println("New Shape Added To Triangle : calculate AreaReturnOtherValue  Method");
        System.out.println();
        System.out.println(TriangleSubShapeNumber2.areaReturnOtherValue(TriangleSubShapeNumber2.getWidth(), TriangleSubShapeNumber2.getHeight()));
        System.out.println();
        System.out.println(" New Shape Added To Triangle : calculate Triangle  CalculateTriangle Method");
        System.out.println();
        System.out.println(TriangleSubShapeNumber2.calculateTriangle(TriangleSubShapeNumber2.getWidth(),
                TriangleSubShapeNumber2.getHeight(), TriangleSubShapeNumber2.getAltitude()));
        System.out.println();
        OpenClosePrincipleClassForAreaCalculator openClosePrincipleClassForAreaCalculator1 = new OpenClosePrincipleClassForAreaCalculator(List.of(TriangleSubShapeNumber2));
        System.out.println();
        System.out.println("Sum Of All Shapes on openClosePrincipleClassForAreaCalculator: Total Area Triangle  ------>");
        System.out.println();
        System.out.println(openClosePrincipleClassForAreaCalculator1.totalArea());
        System.out.println();
        System.out.println("------------------------------------------------------------------");

    }


}

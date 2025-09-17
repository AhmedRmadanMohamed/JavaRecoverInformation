
package SolidPrinciples.ProjectForTestSolid1.OpenClosePrincipleClasses;

import SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple.BaseShape;

import java.util.List;

public class OpenClosePrincipleClassForAreaCalculator {
    private final List<BaseShape> baseShape;

    public OpenClosePrincipleClassForAreaCalculator(List<BaseShape> baseShape) {
        this.baseShape = List.copyOf(baseShape);

    }


    public double totalArea() {
        return baseShape.stream().mapToDouble(BaseShape::area).sum();
    }


}

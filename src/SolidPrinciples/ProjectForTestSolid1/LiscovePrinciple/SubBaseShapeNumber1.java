package SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple;

// This InterFace For Test Liscove Principle
public interface SubBaseShapeNumber1 extends BaseShape {

    ///  this function area  on the Shape interface but this return other  Value
    double areaReturnOtherValue(double width, double height);

      double getWidth();

     double getHeight();

    @Override
    default double area() {

        return areaReturnOtherValue(getWidth(), getHeight());
    }

}

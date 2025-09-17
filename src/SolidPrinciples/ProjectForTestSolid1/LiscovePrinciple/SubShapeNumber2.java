package SolidPrinciples.ProjectForTestSolid1.LiscovePrinciple;

public interface SubShapeNumber2 extends SubBaseShapeNumber1 {

    double calculateTriangle(double height, double width, double Altitude);

    @Override
    double areaReturnOtherValue(double width, double height);

    @Override
    double getWidth();

    @Override
    double getHeight();

    double getAltitude();


    @Override
    default double area() {

        return areaReturnOtherValue( getWidth(), getHeight());
    }


    default double area(double height, double width , double Altitude) {

        return calculateTriangle(height, width, Altitude);
    };

}

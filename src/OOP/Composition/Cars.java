package OOP.Composition;


import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final String CarType;
    private final Engine Engine;
    private final Wheels Wheels;


    public Cars(String CarType) {
        this.Engine = new Engine();
        this.Wheels = new Wheels();
        this.CarType = CarType;
    }


    public void Engin(int EngineCode, String EngineName, double EngineSpeed, String EngineType) {
        Engine.setEngineCode(EngineCode);
        Engine.setEngineName(EngineName);
        Engine.setEngineSpeed(EngineSpeed);
        Engine.setEngineType(EngineType);
        List<Engine> list =  new ArrayList<>();
        list.add(this.Engine);
        for (Engine e : list) {
            System.out.println( "this is car "+this.CarType+"  " +e.getEngineCode() + "    " + e.getEngineName() + "    " + e.getEngineSpeed() + "   " + e.getEngineType());
        }
    }



    public void Wheels(int WheelsCode, String WheelsName, double WheelsPrice) {
        Wheels.setWheelsCode(WheelsCode);
        Wheels.setWheelsName(WheelsName);
        Wheels.setWheelsPrice(WheelsPrice);
        List<Wheels> list =  new ArrayList<>();
        list.add(Wheels);


        for (Wheels e : list) {
            System.out.println("this Wheels Car"+"   "+CarType+"  "+WheelsCode + "   " + WheelsName + "   " + WheelsPrice);
        }


    }




}

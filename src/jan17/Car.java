package jan17;

public abstract class Car {


    protected void fuel(){
        System.out.println("Fule Injected");
    }

   protected void igniteFuel(){
        System.out.println("Fule ignited");
    }

   protected void enginestart(){
        System.out.println("engine starts");
    }


    void startCar(){
        fuel();
        igniteFuel();
        enginestart();
        System.out.println("Car is started");
    }
}


class Petrolcar extends Car {


}

class CarMain {
    static void main() {
        Car car = new Petrolcar();
        car.startCar();
    }
}

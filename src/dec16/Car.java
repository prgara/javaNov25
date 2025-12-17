package dec16;

public class Car {
    int numOfCylinders;
    int color;
    int model;

//    public Car() {
//    }
//
//    public Car(int numOfCylinders, int color, int model) {
//        this.numOfCylinders = numOfCylinders;
//        this.color = color;
//        this.model = model;
//    }

    //    Car(int color, int model, int numOfCylinders){
//        this.color = color;
//        this.numOfCylinders = numOfCylinders;
//        this.model = model;
//    }




    // start method
    public void start(){
        System.out.println("Car started");
    }

    // return num of wheels of a car
    public String numOfWheels(int wheels){ // wheels -> param
        return "Num of wheels : " + wheels;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numOfCylinders=" + numOfCylinders +
                ", color=" + color +
                ", model=" + model +
                '}';
    }
}

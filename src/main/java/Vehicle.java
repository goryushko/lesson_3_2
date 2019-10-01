//Start with a base class of a Vehicle, then create a Car class that inherits from this base class.//
//        Finally, create another class, a specific type of Car that inherits from the Car class.//
//        You should be able to hand steering, changing gears, and moving(speed in other words).
//        You will want to decide where to put the appropriate state and behaviours(fields and methods).
//        As mentioned above, changing gears, increasing/decreasing speed should be included.
//        For you specific type of vehicle you will want to add something specific for that type of car.


abstract class Vehicle {

    abstract void handSteering();

}

abstract class Car extends Vehicle {

    abstract void changingGears();

    abstract void moving();
}


class Wolkswagen extends Car {
    private boolean possibilityHandSteering;
    private int speed;
    private int gears;

    public Wolkswagen(boolean possibilityHandSteering, int speed, int gears) {
        this.possibilityHandSteering = possibilityHandSteering;
        this.speed = speed;
        this.gears = gears;
    }

    public boolean isPossibilityHandSteering() {
        return possibilityHandSteering;
    }

    public void setPossibilityHandSteering(boolean possibilityHandSteering) {
        this.possibilityHandSteering = possibilityHandSteering;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    void handSteering() {

        System.out.println("This car may only manage manually.");
    }

    @Override
    void changingGears() {
        System.out.println("There is a possibility to change gears.");
    }

    @Override
    void moving() {
        System.out.println("The car has both increase and decrease speed.");
    }
}




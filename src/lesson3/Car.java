package lesson3;

public class Car extends Vehicle implements CheckEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}

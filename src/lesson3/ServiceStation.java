package lesson3;

public class ServiceStation {
    public void check(Vehicle... vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                checkVehicle(vehicle);
            }
        }
        System.out.println();
    }

    private void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        if (vehicle instanceof CheckEngine) {
            ((CheckEngine) vehicle).checkEngine();
        }
        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }
    }
}

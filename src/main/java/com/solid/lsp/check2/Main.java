package com.solid.lsp.check2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("BMW i32");
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.setVehicle(car);

        Vehicle vehicle = vehicleFactory.getVehicle();

        System.out.println(vehicle);
    }
}

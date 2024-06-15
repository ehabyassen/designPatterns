package com.solid.lsp.check2;

public class CarFactory extends VehicleFactory {

    private Car car;

    @Override
    public Car getVehicle() {
        return new Car("BMW i32");
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

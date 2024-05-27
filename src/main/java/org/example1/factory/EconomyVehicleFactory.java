package org.example1.factory;

import org.example1.car.Car;
import org.example1.car.SedanCar;
import org.example1.motocycle.CruiserMotorcycle;
import org.example1.motocycle.Motorcycle;

/*Esta es una de las clases especificas que implementa la interfaz abstracta y decide que objetos
* retornar*/
public class EconomyVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public Motorcycle createMotorCycle() {
        return new CruiserMotorcycle();
    }
}

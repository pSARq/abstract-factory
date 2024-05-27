package org.example1.factory;

import org.example1.car.Car;
import org.example1.car.SportCar;
import org.example1.motocycle.Motorcycle;
import org.example1.motocycle.SportMotorcycle;

/*Esta es la otra clase que implementa las interfaz y decide que objetos retornar
* de acuerdo a su contexto. En este caso, vehiculos deportivos*/
public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Motorcycle createMotorCycle() {
        return new SportMotorcycle();
    }
}

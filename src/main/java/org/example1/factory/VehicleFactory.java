package org.example1.factory;

import org.example1.car.Car;
import org.example1.motocycle.Motorcycle;

/*Esta es mi interfaz abstracta que construye las familias de objetos*/
public interface VehicleFactory {

    Car createCar();

    Motorcycle createMotorCycle();

}

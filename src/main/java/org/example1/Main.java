package org.example1;

import org.example1.car.Car;
import org.example1.factory.EconomyVehicleFactory;
import org.example1.factory.LuxuryVehicleFactory;
import org.example1.factory.VehicleFactory;
import org.example1.motocycle.Motorcycle;

public class Main {
    public static void main(String[] args) {
        /*Aqui construyo mi fabrica de vehiculos lujos (son los deportivos). Luego con la fabrica ya puedo crear
        * una instancia en especifico*/
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        Car luxuryCar = luxuryFactory.createCar();
        Motorcycle luxuryMotorcycle = luxuryFactory.createMotorCycle();

        /*Una vez creadas mis intancias ya puedo mandar a llamar los metodos que tengan mis interfaces Car y
        * Motorcycle*/
        luxuryCar.drive();
        luxuryMotorcycle.ride();

        ///////////////////////////////////////////

        /*Este es otro ejemplo*/
        VehicleFactory economyFactory = new EconomyVehicleFactory();
        Car economyCar = economyFactory.createCar();
        Motorcycle economyMotorcycle = economyFactory.createMotorCycle();

        economyCar.drive();
        economyMotorcycle.ride();

    }
}
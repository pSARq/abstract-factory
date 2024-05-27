package org.example1.motocycle;

/*Esta es una de las clases que implementa a la interfaz y esta clase es un objeto en especifico.
* Mientras que la interfaz es generica y engloba a todas las motos, en esta clase se esta diciendo que
* es una moto deportiva*/
public class SportMotorcycle implements Motorcycle {
    @Override
    public void ride() {
        System.out.println("Conduciendo una moto deportiva");
    }
}

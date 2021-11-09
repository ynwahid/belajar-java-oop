package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.Avanza;
import programmer.ucup.ganteng.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTyre());
    car.drive();
    System.out.println(car.getBrand());
    System.out.println(car.isMaintenance());
  }
}

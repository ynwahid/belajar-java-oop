package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.annotation.Fancy;
import programmer.ucup.ganteng.data.Animal;
import programmer.ucup.ganteng.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {

  public static void main(String[] args) {

    Animal animal = new Cat();
    animal.name = "Puss";
    animal.run();
  }
}

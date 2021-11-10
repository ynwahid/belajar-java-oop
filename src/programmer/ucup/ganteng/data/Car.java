package programmer.ucup.ganteng.data;

import programmer.ucup.ganteng.annotation.Fancy;

@Fancy(name = "Car", tags = {"interface", "java"})
public interface Car extends HasBrand, IsMaintenance {

  void drive();

  int getTyre();

  default boolean isBig() {
    return false;
  }
}

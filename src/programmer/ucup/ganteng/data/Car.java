package programmer.ucup.ganteng.data;

public interface Car extends HasBrand, IsMaintenance {

  void drive();

  int getTyre();

  default boolean isBig() {
    return false;
  }
}

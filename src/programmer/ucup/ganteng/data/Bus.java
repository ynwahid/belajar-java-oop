package programmer.ucup.ganteng.data;

public class Bus implements Car {

  public void drive() {
    System.out.println("Bus drives.");
  }

  public int getTyre() {
    return 8;
  }

  public String getBrand() {
    return "Hino";
  }

  public boolean isMaintenance() {
    return false;
  }

  public boolean isBig() {
    return true;
  }
}

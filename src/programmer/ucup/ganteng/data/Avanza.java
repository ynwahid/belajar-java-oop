package programmer.ucup.ganteng.data;

public class Avanza implements Car{

  public void drive() {
    System.out.println("Avanza drives.");
  }

  public int getTyre() {
    return 4;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintenance() {
    return false;
  }
}

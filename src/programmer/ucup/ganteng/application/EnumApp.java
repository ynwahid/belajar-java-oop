package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.Customer;
import programmer.ucup.ganteng.data.Level;

public class EnumApp {

  public static void main(String[] args) {

    Customer customer = new Customer();
    customer.setName("Yusuf");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(customer.getLevel().getDescription());

    String levelName = Level.VIP.name();
    System.out.println(levelName);

    Level level = Level.valueOf("PREMIUM");
    System.out.println(level);

    Level[] levels = Level.values();

    System.out.println();
    System.out.println("Print All Available Values");
    for (var lvl : levels) {
      System.out.println(lvl);
    }
  }
}
